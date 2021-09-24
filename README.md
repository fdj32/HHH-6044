# A. HHH-6044

[Hibernate Bug: Composite Primary Key with IDENTITY on SQLServer](https://hibernate.atlassian.net/browse/HHH-6044)  

# B. Run SQLServer in Docker

## 1. [pull mssql image](https://hub.docker.com/_/microsoft-mssql-server)
```
docker pull mcr.microsoft.com/mssql/server
docker pull mcr.microsoft.com/mssql/server:latest
```
## 2. run a container
```
docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=helloworld" --name mssql -p 1433:1433 -d mcr.microsoft.com/mssql/server:latest

docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=helloworld" --name mssql -p 1433:1433 -v c:/mssql:/var/opt/mssql -d mcr.microsoft.com/mssql/server:latest
```
## 3. [create database](https://docs.microsoft.com/en-us/sql/t-sql/statements/create-database-transact-sql?view=sql-server-ver15&tabs=sqlpool)
```
USE master;
GO
IF DB_ID (N'secure') IS NOT NULL
DROP DATABASE secure;
GO
CREATE DATABASE secure;
GO
-- Verify the database files and sizes
SELECT name, size, size*1.0/128 AS [Size in MBs]
FROM sys.master_files
WHERE name = N'secure';
GO
```
## 4. [create account](https://docs.microsoft.com/en-us/sql/t-sql/statements/create-user-transact-sql?view=sql-server-ver15)
```
CREATE LOGIN secure WITH PASSWORD = 'helloworld';
USE secure;
CREATE USER secure FOR LOGIN secure;
GO
```
## 5. [grant permission](https://docs.microsoft.com/zh-cn/sql/t-sql/statements/grant-database-permissions-transact-sql?view=sql-server-ver15)
```
USE secure;
GRANT CONTROL ON DATABASE::secure TO secure;
GO
```


# C. SQL

```

CREATE TABLE hello_world (
    [id] INT IDENTITY (1, 1) NOT NULL,
    [instance_id] INT NOT NULL,
    [username] VARCHAR (50) NOT NULL,
    [country] VARCHAR (50) NOT NULL,
    CONSTRAINT [pk_hello_world] PRIMARY KEY (id, instance_id)
);

CREATE TABLE hello_china (
    [id] INT IDENTITY (1, 1) PRIMARY KEY NOT NULL,
    [username] VARCHAR (50) NOT NULL
);

CREATE TABLE hello_sun (
    [id] INT IDENTITY (1, 1) NOT NULL,
    [instance_id] INT NOT NULL,
    [username] VARCHAR (50) NOT NULL,
    [country] VARCHAR (50) NOT NULL,
    CONSTRAINT [pk_hello_sun] PRIMARY KEY (id, instance_id, country)
);

CREATE TABLE hello_moon (
    [id] INT IDENTITY (1, 1) NOT NULL,
    [instance_id] INT NOT NULL,
    [username] VARCHAR (50) NOT NULL,
    [country] VARCHAR (50) NOT NULL,
    [said_date] DATETIME2 NOT NULL DEFAULT GETDATE(),
    CONSTRAINT [pk_hello_moon] PRIMARY KEY (id, instance_id, username, country)
);

```

# D. Code Changes
## 1. spring.jpa.properties.hibernate.ejb.interceptor
application.yml

```
spring:
  jpa:
    properties:
      hibernate:
        ejb:
          interceptor: io.github.fdj32.app.dao.CustomInterceptor
```

Hibernate doesn't recognize the correct state of Entity with composite primary key, previously it was  we need to change it by this override this method, replace default `EmptyInterceptor` by setting `spring.jpa.properties.hibernate.ejb.interceptor=io.github.fdj32.app.dao.CustomInterceptor` , @See `DefaultMergeEventListener`

```
public void onMerge(MergeEvent event, Map copiedAlready) throws HibernateException {
...
	if ( entityState == null ) {
		entityState = EntityState.getEntityState( entity, event.getEntityName(), entry, source, false );
	}

	switch ( entityState ) {
		case DETACHED:
			entityIsDetached( event, copyCache );
			break;
		case TRANSIENT:
			entityIsTransient( event, copyCache );
			break;
		case PERSISTENT:
			entityIsPersistent( event, copyCache );
			break;
		default: //DELETED
			throw new ObjectDeletedException(
					"deleted instance passed to merge",
					null,
					EventUtil.getLoggableName( event.getEntityName(), entity )
			);
	}
	...
}
```

`public class CustomInterceptor extends EmptyInterceptor` isTransient is to change the return value of `EntityState.getEntityState(...)`

```
@Override
public Boolean isTransient(Object entity) {
	Class<?> cls = entity.getClass();
	for (Field field : cls.getDeclaredFields()) {
		Annotation annoId = field.getAnnotation(Id.class);
		Annotation annoGeneratedValue = field.getAnnotation(GeneratedValue.class);
		if (null != annoId && null != annoGeneratedValue) {
			String fieldName = field.getName();
			String getterMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			try {
				Method getter = cls.getMethod(getterMethodName);
				Object identityValue = getter.invoke(entity);
				if (GenerationType.IDENTITY == ((GeneratedValue) annoGeneratedValue).strategy()
						&& null == identityValue) {
					return true;
				}
			} catch (Exception e) {
				LOG.error("", e);
			}
		}
	}
	return null;
}
```

## 2. org.hibernate.mapping.Component.buildIdentifierGenerator(), keyword: SQLServer
It's used in `CompositeNestedGeneratedValueGenerator`, you can comment these line to see where it throws exception.

```
	final IdentifierGenerator valueGenerator = value.createIdentifierGenerator(
			identifierGeneratorFactory,
			dialect,
			defaultCatalog,
			defaultSchema,
			rootClass
	);
+	if (dialect.getClass().getName().contains("SQLServer") && properties.size() > 1 && valueGenerator instanceof IdentityGenerator) {
+		continue;
+	}
	generator.addGeneratedValuePlan(
			new ValueGenerationPlan(
					valueGenerator,
					injector( property, attributeDeclarer )
			)
	);
```

## 3. org.hibernate.persister.entity.AbstractEntityPersister, keyword: SQLServer, partialCompositeKey

### a. Declare a list `partialCompositeKey`

Add a list `partialCompositeKey` to store partial composite key fields, ignore identity column, and this can help to remember the field sequence in SQL insert statement.

```
private final List<String> partialCompositeKey;
```
### b. Constructor

```
this.partialCompositeKey = new ArrayList<>();
```

### c. generateInsertString()
This method is to generate a default insert SQL, we need to ignore identity field in SQLServer, and remember the sequence of other columns of composite primary key, sample: `hello_sun` and `hello_moon`.

```
// add the primary key
if ( j == 0 && identityInsert ) {
	insert.addIdentityColumn( getKeyColumns( 0 )[0] );
}
else if (getKeyColumns( j ).length == 1) {
	insert.addColumns( getKeyColumns( j ) );
}
else {
	String clsName = getEntityMetamodel().getName();
	try {
		Class cls = Class.forName(clsName);
		// @Id in @Entity
		Arrays.stream(cls.getDeclaredFields()).filter(f -> null != f.getAnnotation(Id.class)).forEach(f -> {
			GeneratedValue gv = f.getAnnotation(GeneratedValue.class);
			if (null == gv || !(gv.strategy() == GenerationType.IDENTITY
					&& getFactory().getDialect().getClass().getName().contains("SQLServer"))) {
				javax.persistence.Column column = f.getAnnotation(javax.persistence.Column.class);
				insert.addColumns(new String[] { column.name() });
				partialCompositeKey.add(f.getName());
			}
		});
		// @EmbeddedId in @Entity and @Embeddable + @Column in Composite Key
		Arrays.stream(cls.getDeclaredFields()).filter(field -> null != field.getAnnotation(EmbeddedId.class)).forEach(field -> {
			Arrays.stream(field.getType().getDeclaredFields()).filter(f -> null != f.getAnnotation(javax.persistence.Column.class)).forEach(f -> {
				GeneratedValue gv = f.getAnnotation(GeneratedValue.class);
				if (null == gv || !(gv.strategy() == GenerationType.IDENTITY
						&& getFactory().getDialect().getClass().getName().contains("SQLServer"))) {
					javax.persistence.Column column = f.getAnnotation(javax.persistence.Column.class);
					insert.addColumns(new String[] { column.name() });
					partialCompositeKey.add(f.getName());
				}
			});
		});
		
	} catch (Exception e) {
		insert.addColumns(getKeyColumns(j));
	}
}
```

### d. dehydrateId()
This method is to bind primary key columns in insert SQL statement.


```
else if (id != null) {
	if (getIdentifierType() instanceof ComponentType) {
		ComponentType ct = (ComponentType) getIdentifierType();
		int count = 0;
		for (int i = 0; i < partialCompositeKey.size(); i++) {
			int propertyIndex = ct.getPropertyIndex(partialCompositeKey.get(i));
			ct.getSubtypes()[propertyIndex].nullSafeSet(ps, ct.getPropertyValue(id, propertyIndex), index, session);
			index += ct.getSubtypes()[propertyIndex].getColumnSpan( session.getFactory() );;
			count++;
		}
		return count;
	} else {
		getIdentifierType().nullSafeSet(ps, id, index, session);
		return getIdentifierColumnSpan();
	}
}
```

# E. Guide to create this project
## 1. hibernate-core\target\generated-src
We need to change the code in hibernate-core.jar, so we need to download a release from [Hibernate Github](https://github.com/hibernate/hibernate-orm/releases), I choose [5.5.7.zip](https://github.com/hibernate/hibernate-orm/archive/refs/tags/5.5.7.zip), then unzip it, run `gradlew.bat assemble`. After successful building, we can get some generated sources from `hibernate-orm-5.5.7\hibernate-core\target\generated-src`, antlr, apt, jaxb, these codes must be imported to hibernate-core library project.

## 2. gradle init
`gradle init` can generate a bootstart project structure for us, we can remove one project 'list' or 'utilities', change another one to hibernate-core, then change some *.gradle files, then import hibernate-core code and generated-src. Add dependencies to compile java code then.

# F. Known issues
## 1. save() doesn't return identity value generated.
## 2. XML configuration files not processed.