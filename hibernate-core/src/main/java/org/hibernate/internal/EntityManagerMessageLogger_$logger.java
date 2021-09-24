package org.hibernate.internal;

import java.util.Locale;
import java.sql.SQLWarning;
import java.io.Serializable;
import java.util.Set;
import org.hibernate.type.BasicType;
import org.hibernate.internal.CoreMessageLogger;
import java.sql.SQLException;
import org.hibernate.cache.CacheException;
import org.jboss.logging.DelegatingBasicLogger;
import java.io.FileNotFoundException;
import java.util.ServiceConfigurationError;
import org.hibernate.engine.jndi.JndiException;
import java.lang.String;
import java.net.URISyntaxException;
import org.jboss.logging.Logger;
import java.util.Properties;
import java.net.URL;
import org.hibernate.engine.jdbc.dialect.spi.DialectResolver;
import javax.transaction.SystemException;
import org.jboss.logging.BasicLogger;
import org.hibernate.engine.jndi.JndiNameException;
import org.hibernate.dialect.Dialect;
import javax.naming.NamingException;
import javax.annotation.Generated;
import org.hibernate.type.SerializationException;
import org.hibernate.HibernateException;
import javax.naming.NameNotFoundException;
import org.hibernate.engine.loading.internal.EntityLoadContext;
import java.util.Hashtable;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.CollectionKey;
import java.io.IOException;
import java.lang.reflect.Method;
import org.hibernate.LockMode;
import org.hibernate.engine.loading.internal.CollectionLoadContext;
import javax.transaction.Synchronization;
import java.lang.Exception;
import java.lang.Integer;
import org.hibernate.type.Type;
import java.lang.ClassCastException;
import java.lang.Long;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.util.Arrays;
import java.io.File;
import org.hibernate.id.IntegralDataTypeHolder;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:28+0800")
public class EntityManagerMessageLogger_$logger extends DelegatingBasicLogger implements EntityManagerMessageLogger, org.hibernate.internal.CoreMessageLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = EntityManagerMessageLogger_$logger.class.getName();
    public EntityManagerMessageLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void boundEjb3ConfigurationToJndiName(final String name) {
        super.log.logf(FQCN, INFO, null, boundEjb3ConfigurationToJndiName$str(), name);
    }
    private static final String boundEjb3ConfigurationToJndiName = "HHH015001: Bound Ejb3Configuration to JNDI name: %s";
    protected String boundEjb3ConfigurationToJndiName$str() {
        return boundEjb3ConfigurationToJndiName;
    }
    @Override
    public final void ejb3ConfigurationName(final String name) {
        super.log.logf(FQCN, INFO, null, ejb3ConfigurationName$str(), name);
    }
    private static final String ejb3ConfigurationName = "HHH015002: Ejb3Configuration name: %s";
    protected String ejb3ConfigurationName$str() {
        return ejb3ConfigurationName;
    }
    @Override
    public final void ejb3ConfigurationRenamedFromName(final String name) {
        super.log.logf(FQCN, INFO, null, ejb3ConfigurationRenamedFromName$str(), name);
    }
    private static final String ejb3ConfigurationRenamedFromName = "HHH015003: An Ejb3Configuration was renamed from name: %s";
    protected String ejb3ConfigurationRenamedFromName$str() {
        return ejb3ConfigurationRenamedFromName;
    }
    @Override
    public final void ejb3ConfigurationUnboundFromName(final String name) {
        super.log.logf(FQCN, INFO, null, ejb3ConfigurationUnboundFromName$str(), name);
    }
    private static final String ejb3ConfigurationUnboundFromName = "HHH015004: An Ejb3Configuration was unbound from name: %s";
    protected String ejb3ConfigurationUnboundFromName$str() {
        return ejb3ConfigurationUnboundFromName;
    }
    @Override
    public final void explodedJarDoesNotExist(final URL jarUrl) {
        super.log.logf(FQCN, WARN, null, explodedJarDoesNotExist$str(), jarUrl);
    }
    private static final String explodedJarDoesNotExist = "HHH015005: Exploded jar file does not exist (ignored): %s";
    protected String explodedJarDoesNotExist$str() {
        return explodedJarDoesNotExist;
    }
    @Override
    public final void explodedJarNotDirectory(final URL jarUrl) {
        super.log.logf(FQCN, WARN, null, explodedJarNotDirectory$str(), jarUrl);
    }
    private static final String explodedJarNotDirectory = "HHH015006: Exploded jar file not a directory (ignored): %s";
    protected String explodedJarNotDirectory$str() {
        return explodedJarNotDirectory;
    }
    @Override
    public final void illegalArgumentOnStaticMetamodelFieldInjection(final String name, final String name2, final String name3, final String name4) {
        super.log.logf(FQCN, ERROR, null, illegalArgumentOnStaticMetamodelFieldInjection$str(), name, name2, name3, name4);
    }
    private static final String illegalArgumentOnStaticMetamodelFieldInjection = "HHH015007: Illegal argument on static metamodel field injection : %s#%s; expected type :  %s; encountered type : %s";
    protected String illegalArgumentOnStaticMetamodelFieldInjection$str() {
        return illegalArgumentOnStaticMetamodelFieldInjection;
    }
    @Override
    public final void malformedUrl(final URL jarUrl, final URISyntaxException e) {
        super.log.logf(FQCN, ERROR, e, malformedUrl$str(), jarUrl);
    }
    private static final String malformedUrl = "HHH015008: Malformed URL: %s";
    protected String malformedUrl$str() {
        return malformedUrl;
    }
    @Override
    public final void malformedUrlWarning(final URL jarUrl, final URISyntaxException e) {
        super.log.logf(FQCN, WARN, e, malformedUrlWarning$str(), jarUrl);
    }
    private static final String malformedUrlWarning = "HHH015009: Malformed URL: %s";
    protected String malformedUrlWarning$str() {
        return malformedUrlWarning;
    }
    @Override
    public final void unableToFindFile(final URL jarUrl, final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToFindFile$str(), jarUrl);
    }
    private static final String unableToFindFile = "HHH015010: Unable to find file (ignored): %s";
    protected String unableToFindFile$str() {
        return unableToFindFile;
    }
    @Override
    public final void unableToLocateStaticMetamodelField(final String name, final String name2) {
        super.log.logf(FQCN, WARN, null, unableToLocateStaticMetamodelField$str(), name, name2);
    }
    private static final String unableToLocateStaticMetamodelField = "HHH015011: Unable to locate static metamodel field : %s#%s; this may or may not indicate a problem with the static metamodel";
    protected String unableToLocateStaticMetamodelField$str() {
        return unableToLocateStaticMetamodelField;
    }
    @Override
    public final void usingProvidedDataSource() {
        super.log.logf(FQCN, INFO, null, usingProvidedDataSource$str());
    }
    private static final String usingProvidedDataSource = "HHH015012: Using provided datasource";
    protected String usingProvidedDataSource$str() {
        return usingProvidedDataSource;
    }
    @Override
    public final void ignoringEntityNotFound(final String entityName, final String identifier) {
        super.log.logf(FQCN, DEBUG, null, ignoringEntityNotFound$str(), entityName, identifier);
    }
    private static final String ignoringEntityNotFound = "HHH015013: Returning null (as required by JPA spec) rather than throwing EntityNotFoundException, as the entity (type=%s, id=%s) does not exist";
    protected String ignoringEntityNotFound$str() {
        return ignoringEntityNotFound;
    }
    @Override
    public final void deprecatedJpaPositionalParameterAccess(final Integer jpaPositionalParameter) {
        super.log.logf(FQCN, WARN, null, deprecatedJpaPositionalParameterAccess$str(), jpaPositionalParameter);
    }
    private static final String deprecatedJpaPositionalParameterAccess = "HHH015014: DEPRECATION - attempt to refer to JPA positional parameter [?%1$s] using String name [\"%1$s\"] rather than int position [%1$s] (generally in Query#setParameter, Query#getParameter or Query#getParameterValue calls).  Hibernate previously allowed such usage, but it is considered deprecated.";
    protected String deprecatedJpaPositionalParameterAccess$str() {
        return deprecatedJpaPositionalParameterAccess;
    }
    @Override
    public final void unusedMappedSuperclass(final String name) {
        super.log.logf(FQCN, INFO, null, unusedMappedSuperclass$str(), name);
    }
    private static final String unusedMappedSuperclass = "HHH015015: Encountered a MappedSuperclass [%s] not used in any entity hierarchy";
    protected String unusedMappedSuperclass$str() {
        return unusedMappedSuperclass;
    }
    @Override
    public final void deprecatedPersistenceProvider(final String deprecated, final String replacement) {
        super.log.logf(FQCN, WARN, null, deprecatedPersistenceProvider$str(), deprecated, replacement);
    }
    private static final String deprecatedPersistenceProvider = "HHH015016: Encountered a deprecated javax.persistence.spi.PersistenceProvider [%s]; [%s] will be used instead.";
    protected String deprecatedPersistenceProvider$str() {
        return deprecatedPersistenceProvider;
    }
    @Override
    public final void deprecatedInstrumentationProperty() {
        super.log.logf(FQCN, WARN, null, deprecatedInstrumentationProperty$str());
    }
    private static final String deprecatedInstrumentationProperty = "HHH015017: 'hibernate.ejb.use_class_enhancer' property is deprecated. Use 'hibernate.enhance.enable[...]' properties instead to enable each individual feature.";
    protected String deprecatedInstrumentationProperty$str() {
        return deprecatedInstrumentationProperty;
    }
    @Override
    public final void duplicatedPersistenceUnitName(final String name) {
        super.log.logf(FQCN, WARN, null, duplicatedPersistenceUnitName$str(), name);
    }
    private static final String duplicatedPersistenceUnitName = "HHH015018: Encountered multiple persistence-unit stanzas defining same name [%s]; persistence-unit names must be unique";
    protected String duplicatedPersistenceUnitName$str() {
        return duplicatedPersistenceUnitName;
    }
    @Override
    public final void alreadySessionBound() {
        super.log.logf(FQCN, WARN, null, alreadySessionBound$str());
    }
    private static final String alreadySessionBound = "HHH000002: Already session bound on call to bind(); make sure you clean up your sessions!";
    protected String alreadySessionBound$str() {
        return alreadySessionBound;
    }
    @Override
    public final void autoCommitMode(final boolean autocommit) {
        super.log.logf(FQCN, INFO, null, autoCommitMode$str(), autocommit);
    }
    private static final String autoCommitMode = "HHH000006: Autocommit mode: %s";
    protected String autoCommitMode$str() {
        return autoCommitMode;
    }
    @Override
    public final void autoFlushWillNotWork() {
        super.log.logf(FQCN, WARN, null, autoFlushWillNotWork$str());
    }
    private static final String autoFlushWillNotWork = "HHH000008: JTASessionContext being used with JDBC transactions; auto-flush will not operate correctly with getCurrentSession()";
    protected String autoFlushWillNotWork$str() {
        return autoFlushWillNotWork;
    }
    @Override
    public final void batchContainedStatementsOnRelease() {
        super.log.logf(FQCN, INFO, null, batchContainedStatementsOnRelease$str());
    }
    private static final String batchContainedStatementsOnRelease = "HHH000010: On release of batch it still contained JDBC statements";
    protected String batchContainedStatementsOnRelease$str() {
        return batchContainedStatementsOnRelease;
    }
    @Override
    public final void bytecodeProvider(final String provider) {
        super.log.logf(FQCN, INFO, null, bytecodeProvider$str(), provider);
    }
    private static final String bytecodeProvider = "HHH000021: Bytecode provider name : %s";
    protected String bytecodeProvider$str() {
        return bytecodeProvider;
    }
    @Override
    public final void c3p0ProviderClassNotFound(final String c3p0ProviderClassName) {
        super.log.logf(FQCN, WARN, null, c3p0ProviderClassNotFound$str(), c3p0ProviderClassName);
    }
    private static final String c3p0ProviderClassNotFound = "HHH000022: c3p0 properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    protected String c3p0ProviderClassNotFound$str() {
        return c3p0ProviderClassNotFound;
    }
    @Override
    public final void cachedFileNotFound(final String path, final FileNotFoundException error) {
        super.log.logf(FQCN, WARN, null, cachedFileNotFound$str(), path, error);
    }
    private static final String cachedFileNotFound = "HHH000023: I/O reported cached file could not be found : %s : %s";
    protected String cachedFileNotFound$str() {
        return cachedFileNotFound;
    }
    @Override
    public final void cacheProvider(final String name) {
        super.log.logf(FQCN, INFO, null, cacheProvider$str(), name);
    }
    private static final String cacheProvider = "HHH000024: Cache provider: %s";
    protected String cacheProvider$str() {
        return cacheProvider;
    }
    @Override
    public final void callingJoinTransactionOnNonJtaEntityManager() {
        super.log.logf(FQCN, WARN, null, callingJoinTransactionOnNonJtaEntityManager$str());
    }
    private static final String callingJoinTransactionOnNonJtaEntityManager = "HHH000027: Calling joinTransaction() on a non JTA EntityManager";
    protected String callingJoinTransactionOnNonJtaEntityManager$str() {
        return callingJoinTransactionOnNonJtaEntityManager;
    }
    @Override
    public final void closing() {
        super.log.logf(FQCN, DEBUG, null, closing$str());
    }
    private static final String closing = "HHH000031: Closing";
    protected String closing$str() {
        return closing;
    }
    @Override
    public final void collectionsFetched(final long collectionFetchCount) {
        super.log.logf(FQCN, INFO, null, collectionsFetched$str(), collectionFetchCount);
    }
    private static final String collectionsFetched = "HHH000032: Collections fetched (minimize this): %s";
    protected String collectionsFetched$str() {
        return collectionsFetched;
    }
    @Override
    public final void collectionsLoaded(final long collectionLoadCount) {
        super.log.logf(FQCN, INFO, null, collectionsLoaded$str(), collectionLoadCount);
    }
    private static final String collectionsLoaded = "HHH000033: Collections loaded: %s";
    protected String collectionsLoaded$str() {
        return collectionsLoaded;
    }
    @Override
    public final void collectionsRecreated(final long collectionRecreateCount) {
        super.log.logf(FQCN, INFO, null, collectionsRecreated$str(), collectionRecreateCount);
    }
    private static final String collectionsRecreated = "HHH000034: Collections recreated: %s";
    protected String collectionsRecreated$str() {
        return collectionsRecreated;
    }
    @Override
    public final void collectionsRemoved(final long collectionRemoveCount) {
        super.log.logf(FQCN, INFO, null, collectionsRemoved$str(), collectionRemoveCount);
    }
    private static final String collectionsRemoved = "HHH000035: Collections removed: %s";
    protected String collectionsRemoved$str() {
        return collectionsRemoved;
    }
    @Override
    public final void collectionsUpdated(final long collectionUpdateCount) {
        super.log.logf(FQCN, INFO, null, collectionsUpdated$str(), collectionUpdateCount);
    }
    private static final String collectionsUpdated = "HHH000036: Collections updated: %s";
    protected String collectionsUpdated$str() {
        return collectionsUpdated;
    }
    @Override
    public final void columns(final Set keySet) {
        super.log.logf(FQCN, INFO, null, columns$str(), keySet);
    }
    private static final String columns = "HHH000037: Columns: %s";
    protected String columns$str() {
        return columns;
    }
    @Override
    public final void compositeIdClassDoesNotOverrideEquals(final String name) {
        super.log.logf(FQCN, WARN, null, compositeIdClassDoesNotOverrideEquals$str(), name);
    }
    private static final String compositeIdClassDoesNotOverrideEquals = "HHH000038: Composite-id class does not override equals(): %s";
    protected String compositeIdClassDoesNotOverrideEquals$str() {
        return compositeIdClassDoesNotOverrideEquals;
    }
    @Override
    public final void compositeIdClassDoesNotOverrideHashCode(final String name) {
        super.log.logf(FQCN, WARN, null, compositeIdClassDoesNotOverrideHashCode$str(), name);
    }
    private static final String compositeIdClassDoesNotOverrideHashCode = "HHH000039: Composite-id class does not override hashCode(): %s";
    protected String compositeIdClassDoesNotOverrideHashCode$str() {
        return compositeIdClassDoesNotOverrideHashCode;
    }
    @Override
    public final void configurationResource(final String resource) {
        super.log.logf(FQCN, INFO, null, configurationResource$str(), resource);
    }
    private static final String configurationResource = "HHH000040: Configuration resource: %s";
    protected String configurationResource$str() {
        return configurationResource;
    }
    @Override
    public final void configuredSessionFactory(final String name) {
        super.log.logf(FQCN, INFO, null, configuredSessionFactory$str(), name);
    }
    private static final String configuredSessionFactory = "HHH000041: Configured SessionFactory: %s";
    protected String configuredSessionFactory$str() {
        return configuredSessionFactory;
    }
    @Override
    public final void configuringFromFile(final String file) {
        super.log.logf(FQCN, INFO, null, configuringFromFile$str(), file);
    }
    private static final String configuringFromFile = "HHH000042: Configuring from file: %s";
    protected String configuringFromFile$str() {
        return configuringFromFile;
    }
    @Override
    public final void configuringFromResource(final String resource) {
        super.log.logf(FQCN, INFO, null, configuringFromResource$str(), resource);
    }
    private static final String configuringFromResource = "HHH000043: Configuring from resource: %s";
    protected String configuringFromResource$str() {
        return configuringFromResource;
    }
    @Override
    public final void configuringFromUrl(final URL url) {
        super.log.logf(FQCN, INFO, null, configuringFromUrl$str(), url);
    }
    private static final String configuringFromUrl = "HHH000044: Configuring from URL: %s";
    protected String configuringFromUrl$str() {
        return configuringFromUrl;
    }
    @Override
    public final void configuringFromXmlDocument() {
        super.log.logf(FQCN, INFO, null, configuringFromXmlDocument$str());
    }
    private static final String configuringFromXmlDocument = "HHH000045: Configuring from XML document";
    protected String configuringFromXmlDocument$str() {
        return configuringFromXmlDocument;
    }
    @Override
    public final void connectionsObtained(final long connectCount) {
        super.log.logf(FQCN, INFO, null, connectionsObtained$str(), connectCount);
    }
    private static final String connectionsObtained = "HHH000048: Connections obtained: %s";
    protected String connectionsObtained$str() {
        return connectionsObtained;
    }
    @Override
    public final void containerProvidingNullPersistenceUnitRootUrl() {
        super.log.logf(FQCN, ERROR, null, containerProvidingNullPersistenceUnitRootUrl$str());
    }
    private static final String containerProvidingNullPersistenceUnitRootUrl = "HHH000050: Container is providing a null PersistenceUnitRootUrl: discovery impossible";
    protected String containerProvidingNullPersistenceUnitRootUrl$str() {
        return containerProvidingNullPersistenceUnitRootUrl;
    }
    @Override
    public final void containsJoinFetchedCollection(final String role) {
        super.log.logf(FQCN, WARN, null, containsJoinFetchedCollection$str(), role);
    }
    private static final String containsJoinFetchedCollection = "HHH000051: Ignoring bag join fetch [%s] due to prior collection join fetch";
    protected String containsJoinFetchedCollection$str() {
        return containsJoinFetchedCollection;
    }
    @Override
    public final void creatingSubcontextInfo(final String intermediateContextName) {
        super.log.logf(FQCN, INFO, null, creatingSubcontextInfo$str(), intermediateContextName);
    }
    private static final String creatingSubcontextInfo = "HHH000053: Creating subcontext: %s";
    protected String creatingSubcontextInfo$str() {
        return creatingSubcontextInfo;
    }
    @Override
    public final void definingFlushBeforeCompletionIgnoredInHem(final String flushBeforeCompletion) {
        super.log.logf(FQCN, WARN, null, definingFlushBeforeCompletionIgnoredInHem$str(), flushBeforeCompletion);
    }
    private static final String definingFlushBeforeCompletionIgnoredInHem = "HHH000059: Defining %s=true ignored in HEM";
    protected String definingFlushBeforeCompletionIgnoredInHem$str() {
        return definingFlushBeforeCompletionIgnoredInHem;
    }
    @Override
    public final void deprecatedForceDescriminatorAnnotation() {
        super.log.logf(FQCN, WARN, null, deprecatedForceDescriminatorAnnotation$str());
    }
    private static final String deprecatedForceDescriminatorAnnotation = "HHH000062: @ForceDiscriminator is deprecated use @DiscriminatorOptions instead.";
    protected String deprecatedForceDescriminatorAnnotation$str() {
        return deprecatedForceDescriminatorAnnotation;
    }
    @Override
    public final void deprecatedOracle9Dialect() {
        super.log.logf(FQCN, WARN, null, deprecatedOracle9Dialect$str());
    }
    private static final String deprecatedOracle9Dialect = "HHH000063: The Oracle9Dialect dialect has been deprecated; use either Oracle9iDialect or Oracle10gDialect instead";
    protected String deprecatedOracle9Dialect$str() {
        return deprecatedOracle9Dialect;
    }
    @Override
    public final void deprecatedOracleDialect() {
        super.log.logf(FQCN, WARN, null, deprecatedOracleDialect$str());
    }
    private static final String deprecatedOracleDialect = "HHH000064: The OracleDialect dialect has been deprecated; use Oracle8iDialect instead";
    protected String deprecatedOracleDialect$str() {
        return deprecatedOracleDialect;
    }
    @Override
    public final void deprecatedUuidGenerator(final String name, final String name2) {
        super.log.logf(FQCN, WARN, null, deprecatedUuidGenerator$str(), name, name2);
    }
    private static final String deprecatedUuidGenerator = "HHH000065: DEPRECATED : use [%s] instead with custom [%s] implementation";
    protected String deprecatedUuidGenerator$str() {
        return deprecatedUuidGenerator;
    }
    @Override
    public final void disallowingInsertStatementComment() {
        super.log.logf(FQCN, INFO, null, disallowingInsertStatementComment$str());
    }
    private static final String disallowingInsertStatementComment = "HHH000067: Disallowing insert statement comment for select-identity due to Oracle driver bug";
    protected String disallowingInsertStatementComment$str() {
        return disallowingInsertStatementComment;
    }
    @Override
    public final void duplicateGeneratorName(final String name) {
        super.log.logf(FQCN, WARN, null, duplicateGeneratorName$str(), name);
    }
    private static final String duplicateGeneratorName = "HHH000069: Duplicate generator name %s";
    protected String duplicateGeneratorName$str() {
        return duplicateGeneratorName;
    }
    @Override
    public final void duplicateGeneratorTable(final String name) {
        super.log.logf(FQCN, WARN, null, duplicateGeneratorTable$str(), name);
    }
    private static final String duplicateGeneratorTable = "HHH000070: Duplicate generator table: %s";
    protected String duplicateGeneratorTable$str() {
        return duplicateGeneratorTable;
    }
    @Override
    public final void duplicateImport(final String entityName, final String rename) {
        super.log.logf(FQCN, INFO, null, duplicateImport$str(), entityName, rename);
    }
    private static final String duplicateImport = "HHH000071: Duplicate import: %s -> %s";
    protected String duplicateImport$str() {
        return duplicateImport;
    }
    @Override
    public final void duplicateJoins(final String entityName) {
        super.log.logf(FQCN, WARN, null, duplicateJoins$str(), entityName);
    }
    private static final String duplicateJoins = "HHH000072: Duplicate joins for class: %s";
    protected String duplicateJoins$str() {
        return duplicateJoins;
    }
    @Override
    public final void duplicateListener(final String className) {
        super.log.logf(FQCN, INFO, null, duplicateListener$str(), className);
    }
    private static final String duplicateListener = "HHH000073: entity-listener duplication, first event definition will be used: %s";
    protected String duplicateListener$str() {
        return duplicateListener;
    }
    @Override
    public final void duplicateMetadata() {
        super.log.logf(FQCN, WARN, null, duplicateMetadata$str());
    }
    private static final String duplicateMetadata = "HHH000074: Found more than one <persistence-unit-metadata>, subsequent ignored";
    protected String duplicateMetadata$str() {
        return duplicateMetadata;
    }
    @Override
    public final void entitiesDeleted(final long entityDeleteCount) {
        super.log.logf(FQCN, INFO, null, entitiesDeleted$str(), entityDeleteCount);
    }
    private static final String entitiesDeleted = "HHH000076: Entities deleted: %s";
    protected String entitiesDeleted$str() {
        return entitiesDeleted;
    }
    @Override
    public final void entitiesFetched(final long entityFetchCount) {
        super.log.logf(FQCN, INFO, null, entitiesFetched$str(), entityFetchCount);
    }
    private static final String entitiesFetched = "HHH000077: Entities fetched (minimize this): %s";
    protected String entitiesFetched$str() {
        return entitiesFetched;
    }
    @Override
    public final void entitiesInserted(final long entityInsertCount) {
        super.log.logf(FQCN, INFO, null, entitiesInserted$str(), entityInsertCount);
    }
    private static final String entitiesInserted = "HHH000078: Entities inserted: %s";
    protected String entitiesInserted$str() {
        return entitiesInserted;
    }
    @Override
    public final void entitiesLoaded(final long entityLoadCount) {
        super.log.logf(FQCN, INFO, null, entitiesLoaded$str(), entityLoadCount);
    }
    private static final String entitiesLoaded = "HHH000079: Entities loaded: %s";
    protected String entitiesLoaded$str() {
        return entitiesLoaded;
    }
    @Override
    public final void entitiesUpdated(final long entityUpdateCount) {
        super.log.logf(FQCN, INFO, null, entitiesUpdated$str(), entityUpdateCount);
    }
    private static final String entitiesUpdated = "HHH000080: Entities updated: %s";
    protected String entitiesUpdated$str() {
        return entitiesUpdated;
    }
    @Override
    public final void entityAnnotationOnNonRoot(final String className) {
        super.log.logf(FQCN, WARN, null, entityAnnotationOnNonRoot$str(), className);
    }
    private static final String entityAnnotationOnNonRoot = "HHH000081: @org.hibernate.annotations.Entity used on a non root entity: ignored for %s";
    protected String entityAnnotationOnNonRoot$str() {
        return entityAnnotationOnNonRoot;
    }
    @Override
    public final void entityManagerClosedBySomeoneElse(final String autoCloseSession) {
        super.log.logf(FQCN, WARN, null, entityManagerClosedBySomeoneElse$str(), autoCloseSession);
    }
    private static final String entityManagerClosedBySomeoneElse = "HHH000082: Entity Manager closed by someone else (%s must not be used)";
    protected String entityManagerClosedBySomeoneElse$str() {
        return entityManagerClosedBySomeoneElse;
    }
    @Override
    public final void entityMappedAsNonAbstract(final String name) {
        super.log.logf(FQCN, WARN, null, entityMappedAsNonAbstract$str(), name);
    }
    private static final String entityMappedAsNonAbstract = "HHH000084: Entity [%s] is abstract-class/interface explicitly mapped as non-abstract; be sure to supply entity-names";
    protected String entityMappedAsNonAbstract$str() {
        return entityMappedAsNonAbstract;
    }
    @Override
    public final void exceptionHeaderFound(final String exceptionHeader, final String metaInfOrmXml) {
        super.log.logf(FQCN, INFO, null, exceptionHeaderFound$str(), exceptionHeader, metaInfOrmXml);
    }
    private static final String exceptionHeaderFound = "HHH000085: %s %s found";
    protected String exceptionHeaderFound$str() {
        return exceptionHeaderFound;
    }
    @Override
    public final void exceptionHeaderNotFound(final String exceptionHeader, final String metaInfOrmXml) {
        super.log.logf(FQCN, INFO, null, exceptionHeaderNotFound$str(), exceptionHeader, metaInfOrmXml);
    }
    private static final String exceptionHeaderNotFound = "HHH000086: %s No %s found";
    protected String exceptionHeaderNotFound$str() {
        return exceptionHeaderNotFound;
    }
    @Override
    public final void exceptionInAfterTransactionCompletionInterceptor(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, exceptionInAfterTransactionCompletionInterceptor$str());
    }
    private static final String exceptionInAfterTransactionCompletionInterceptor = "HHH000087: Exception in interceptor afterTransactionCompletion()";
    protected String exceptionInAfterTransactionCompletionInterceptor$str() {
        return exceptionInAfterTransactionCompletionInterceptor;
    }
    @Override
    public final void exceptionInBeforeTransactionCompletionInterceptor(final Throwable e) {
        super.log.logf(FQCN, ERROR, e, exceptionInBeforeTransactionCompletionInterceptor$str());
    }
    private static final String exceptionInBeforeTransactionCompletionInterceptor = "HHH000088: Exception in interceptor beforeTransactionCompletion()";
    protected String exceptionInBeforeTransactionCompletionInterceptor$str() {
        return exceptionInBeforeTransactionCompletionInterceptor;
    }
    @Override
    public final void exceptionInSubResolver(final String message) {
        super.log.logf(FQCN, INFO, null, exceptionInSubResolver$str(), message);
    }
    private static final String exceptionInSubResolver = "HHH000089: Sub-resolver threw unexpected exception, continuing to next : %s";
    protected String exceptionInSubResolver$str() {
        return exceptionInSubResolver;
    }
    @Override
    public final void expectedType(final String name, final String string) {
        super.log.logf(FQCN, ERROR, null, expectedType$str(), name, string);
    }
    private static final String expectedType = "HHH000091: Expected type: %s, actual value: %s";
    protected String expectedType$str() {
        return expectedType;
    }
    @Override
    public final void expired(final Object key) {
        super.log.logf(FQCN, WARN, null, expired$str(), key);
    }
    private static final String expired = "HHH000092: An item was expired by the cache while it was locked (increase your cache timeout): %s";
    protected String expired$str() {
        return expired;
    }
    @Override
    public final void factoryBoundToJndiName(final String name) {
        super.log.logf(FQCN, INFO, null, factoryBoundToJndiName$str(), name);
    }
    private static final String factoryBoundToJndiName = "HHH000094: Bound factory to JNDI name: %s";
    protected String factoryBoundToJndiName$str() {
        return factoryBoundToJndiName;
    }
    @Override
    public final void factoryJndiRename(final String oldName, final String newName) {
        super.log.logf(FQCN, INFO, null, factoryJndiRename$str(), oldName, newName);
    }
    private static final String factoryJndiRename = "HHH000096: A factory was renamed from [%s] to [%s] in JNDI";
    protected String factoryJndiRename$str() {
        return factoryJndiRename;
    }
    @Override
    public final void factoryUnboundFromJndiName(final String name) {
        super.log.logf(FQCN, INFO, null, factoryUnboundFromJndiName$str(), name);
    }
    private static final String factoryUnboundFromJndiName = "HHH000097: Unbound factory from JNDI name: %s";
    protected String factoryUnboundFromJndiName$str() {
        return factoryUnboundFromJndiName;
    }
    @Override
    public final void factoryUnboundFromName(final String name) {
        super.log.logf(FQCN, INFO, null, factoryUnboundFromName$str(), name);
    }
    private static final String factoryUnboundFromName = "HHH000098: A factory was unbound from name: %s";
    protected String factoryUnboundFromName$str() {
        return factoryUnboundFromName;
    }
    @Override
    public final void failed(final Throwable throwable) {
        super.log.logf(FQCN, ERROR, null, failed$str(), throwable);
    }
    private static final String failed = "HHH000099: an assertion failure occurred (this may indicate a bug in Hibernate, but is more likely due to unsafe use of the session): %s";
    protected String failed$str() {
        return failed;
    }
    @Override
    public final void failSafeCollectionsCleanup(final CollectionLoadContext collectionLoadContext) {
        super.log.logf(FQCN, WARN, null, failSafeCollectionsCleanup$str(), collectionLoadContext);
    }
    private static final String failSafeCollectionsCleanup = "HHH000100: Fail-safe cleanup (collections) : %s";
    protected String failSafeCollectionsCleanup$str() {
        return failSafeCollectionsCleanup;
    }
    @Override
    public final void failSafeEntitiesCleanup(final EntityLoadContext entityLoadContext) {
        super.log.logf(FQCN, WARN, null, failSafeEntitiesCleanup$str(), entityLoadContext);
    }
    private static final String failSafeEntitiesCleanup = "HHH000101: Fail-safe cleanup (entities) : %s";
    protected String failSafeEntitiesCleanup$str() {
        return failSafeEntitiesCleanup;
    }
    @Override
    public final void fetchingDatabaseMetadata() {
        super.log.logf(FQCN, INFO, null, fetchingDatabaseMetadata$str());
    }
    private static final String fetchingDatabaseMetadata = "HHH000102: Fetching database metadata";
    protected String fetchingDatabaseMetadata$str() {
        return fetchingDatabaseMetadata;
    }
    @Override
    public final void firstOrMaxResultsSpecifiedWithCollectionFetch() {
        super.log.logf(FQCN, WARN, null, firstOrMaxResultsSpecifiedWithCollectionFetch$str());
    }
    private static final String firstOrMaxResultsSpecifiedWithCollectionFetch = "HHH000104: firstResult/maxResults specified with collection fetch; applying in memory!";
    protected String firstOrMaxResultsSpecifiedWithCollectionFetch$str() {
        return firstOrMaxResultsSpecifiedWithCollectionFetch;
    }
    @Override
    public final void flushes(final long flushCount) {
        super.log.logf(FQCN, INFO, null, flushes$str(), flushCount);
    }
    private static final String flushes = "HHH000105: Flushes: %s";
    protected String flushes$str() {
        return flushes;
    }
    @Override
    public final void forcingContainerResourceCleanup() {
        super.log.logf(FQCN, INFO, null, forcingContainerResourceCleanup$str());
    }
    private static final String forcingContainerResourceCleanup = "HHH000106: Forcing container resource cleanup on transaction completion";
    protected String forcingContainerResourceCleanup$str() {
        return forcingContainerResourceCleanup;
    }
    @Override
    public final void forcingTableUse() {
        super.log.logf(FQCN, INFO, null, forcingTableUse$str());
    }
    private static final String forcingTableUse = "HHH000107: Forcing table use for sequence-style generator due to pooled optimizer selection where db does not support pooled sequences";
    protected String forcingTableUse$str() {
        return forcingTableUse;
    }
    @Override
    public final void foreignKeys(final Set keySet) {
        super.log.logf(FQCN, INFO, null, foreignKeys$str(), keySet);
    }
    private static final String foreignKeys = "HHH000108: Foreign keys: %s";
    protected String foreignKeys$str() {
        return foreignKeys;
    }
    @Override
    public final void foundMappingDocument(final String name) {
        super.log.logf(FQCN, INFO, null, foundMappingDocument$str(), name);
    }
    private static final String foundMappingDocument = "HHH000109: Found mapping document in jar: %s";
    protected String foundMappingDocument$str() {
        return foundMappingDocument;
    }
    @Override
    public final void guidGenerated(final String result) {
        super.log.logf(FQCN, WARN, null, guidGenerated$str(), result);
    }
    private static final String guidGenerated = "HHH000113: GUID identifier generated: %s";
    protected String guidGenerated$str() {
        return guidGenerated;
    }
    @Override
    public final void handlingTransientEntity() {
        super.log.logf(FQCN, INFO, null, handlingTransientEntity$str());
    }
    private static final String handlingTransientEntity = "HHH000114: Handling transient entity in delete processing";
    protected String handlingTransientEntity$str() {
        return handlingTransientEntity;
    }
    @Override
    public final void hibernateConnectionPoolSize(final int poolSize, final int minSize) {
        super.log.logf(FQCN, INFO, null, hibernateConnectionPoolSize$str(), poolSize, minSize);
    }
    private static final String hibernateConnectionPoolSize = "HHH000115: Hibernate connection pool size: %s (min=%s)";
    protected String hibernateConnectionPoolSize$str() {
        return hibernateConnectionPoolSize;
    }
    @Override
    public final void honoringOptimizerSetting(final String none, final String incrementParam, final int incrementSize, final String positiveOrNegative, final int defaultIncrementSize) {
        super.log.logf(FQCN, WARN, null, honoringOptimizerSetting$str(), none, incrementParam, incrementSize, positiveOrNegative, defaultIncrementSize);
    }
    private static final String honoringOptimizerSetting = "HHH000116: Config specified explicit optimizer of [%s], but [%s=%s]; using optimizer [%s] increment default of [%s].";
    protected String honoringOptimizerSetting$str() {
        return honoringOptimizerSetting;
    }
    @Override
    public final void hql(final String hql, final Long valueOf, final Long valueOf2) {
        super.log.logf(FQCN, DEBUG, null, hql$str(), hql, valueOf, valueOf2);
    }
    private static final String hql = "HHH000117: HQL: %s, time: %sms, rows: %s";
    protected String hql$str() {
        return hql;
    }
    @Override
    public final void hsqldbSupportsOnlyReadCommittedIsolation() {
        super.log.logf(FQCN, WARN, null, hsqldbSupportsOnlyReadCommittedIsolation$str());
    }
    private static final String hsqldbSupportsOnlyReadCommittedIsolation = "HHH000118: HSQLDB supports only READ_UNCOMMITTED isolation";
    protected String hsqldbSupportsOnlyReadCommittedIsolation$str() {
        return hsqldbSupportsOnlyReadCommittedIsolation;
    }
    @Override
    public final void hydratingEntitiesCount(final int size) {
        super.log.logf(FQCN, WARN, null, hydratingEntitiesCount$str(), size);
    }
    private static final String hydratingEntitiesCount = "HHH000119: On EntityLoadContext#clear, hydratingEntities contained [%s] entries";
    protected String hydratingEntitiesCount$str() {
        return hydratingEntitiesCount;
    }
    @Override
    public final void ignoringTableGeneratorConstraints(final String name) {
        super.log.logf(FQCN, WARN, null, ignoringTableGeneratorConstraints$str(), name);
    }
    private static final String ignoringTableGeneratorConstraints = "HHH000120: Ignoring unique constraints specified on table generator [%s]";
    protected String ignoringTableGeneratorConstraints$str() {
        return ignoringTableGeneratorConstraints;
    }
    @Override
    public final void ignoringUnrecognizedQueryHint(final String hintName) {
        super.log.logf(FQCN, INFO, null, ignoringUnrecognizedQueryHint$str(), hintName);
    }
    private static final String ignoringUnrecognizedQueryHint = "HHH000121: Ignoring unrecognized query hint [%s]";
    protected String ignoringUnrecognizedQueryHint$str() {
        return ignoringUnrecognizedQueryHint;
    }
    @Override
    public final void illegalPropertyGetterArgument(final String name, final String propertyName) {
        super.log.logf(FQCN, ERROR, null, illegalPropertyGetterArgument$str(), name, propertyName);
    }
    private static final String illegalPropertyGetterArgument = "HHH000122: IllegalArgumentException in class: %s, getter method of property: %s";
    protected String illegalPropertyGetterArgument$str() {
        return illegalPropertyGetterArgument;
    }
    @Override
    public final void illegalPropertySetterArgument(final String name, final String propertyName) {
        super.log.logf(FQCN, ERROR, null, illegalPropertySetterArgument$str(), name, propertyName);
    }
    private static final String illegalPropertySetterArgument = "HHH000123: IllegalArgumentException in class: %s, setter method of property: %s";
    protected String illegalPropertySetterArgument$str() {
        return illegalPropertySetterArgument;
    }
    @Override
    public final void immutableAnnotationOnNonRoot(final String className) {
        super.log.logf(FQCN, WARN, null, immutableAnnotationOnNonRoot$str(), className);
    }
    private static final String immutableAnnotationOnNonRoot = "HHH000124: @Immutable used on a non root entity: ignored for %s";
    protected String immutableAnnotationOnNonRoot$str() {
        return immutableAnnotationOnNonRoot;
    }
    @Override
    public final void incompleteMappingMetadataCacheProcessing() {
        super.log.logf(FQCN, WARN, null, incompleteMappingMetadataCacheProcessing$str());
    }
    private static final String incompleteMappingMetadataCacheProcessing = "HHH000125: Mapping metadata cache was not completely processed";
    protected String incompleteMappingMetadataCacheProcessing$str() {
        return incompleteMappingMetadataCacheProcessing;
    }
    @Override
    public final void indexes(final Set keySet) {
        super.log.logf(FQCN, INFO, null, indexes$str(), keySet);
    }
    private static final String indexes = "HHH000126: Indexes: %s";
    protected String indexes$str() {
        return indexes;
    }
    @Override
    public final void couldNotBindJndiListener() {
        super.log.logf(FQCN, DEBUG, null, couldNotBindJndiListener$str());
    }
    private static final String couldNotBindJndiListener = "HHH000127: Could not bind JNDI listener";
    protected String couldNotBindJndiListener$str() {
        return couldNotBindJndiListener;
    }
    @Override
    public final void instantiatingExplicitConnectionProvider(final String providerClassName) {
        super.log.logf(FQCN, INFO, null, instantiatingExplicitConnectionProvider$str(), providerClassName);
    }
    private static final String instantiatingExplicitConnectionProvider = "HHH000130: Instantiating explicit connection provider: %s";
    protected String instantiatingExplicitConnectionProvider$str() {
        return instantiatingExplicitConnectionProvider;
    }
    @Override
    public final void invalidArrayElementType(final String message) {
        super.log.logf(FQCN, ERROR, null, invalidArrayElementType$str(), message);
    }
    private static final String invalidArrayElementType = "HHH000132: Array element type error\n%s";
    protected String invalidArrayElementType$str() {
        return invalidArrayElementType;
    }
    @Override
    public final void invalidDiscriminatorAnnotation(final String className) {
        super.log.logf(FQCN, WARN, null, invalidDiscriminatorAnnotation$str(), className);
    }
    private static final String invalidDiscriminatorAnnotation = "HHH000133: Discriminator column has to be defined in the root entity, it will be ignored in subclass: %s";
    protected String invalidDiscriminatorAnnotation$str() {
        return invalidDiscriminatorAnnotation;
    }
    @Override
    public final void invalidEditOfReadOnlyItem(final Object key) {
        super.log.logf(FQCN, ERROR, null, invalidEditOfReadOnlyItem$str(), key);
    }
    private static final String invalidEditOfReadOnlyItem = "HHH000134: Application attempted to edit read only item: %s";
    protected String invalidEditOfReadOnlyItem$str() {
        return invalidEditOfReadOnlyItem;
    }
    @Override
    public final void invalidJndiName(final String name, final JndiNameException e) {
        super.log.logf(FQCN, ERROR, e, invalidJndiName$str(), name);
    }
    private static final String invalidJndiName = "HHH000135: Invalid JNDI name: %s";
    protected String invalidJndiName$str() {
        return invalidJndiName;
    }
    @Override
    public final void invalidOnDeleteAnnotation(final String entityName) {
        super.log.logf(FQCN, WARN, null, invalidOnDeleteAnnotation$str(), entityName);
    }
    private static final String invalidOnDeleteAnnotation = "HHH000136: Inapropriate use of @OnDelete on entity, annotation ignored: %s";
    protected String invalidOnDeleteAnnotation$str() {
        return invalidOnDeleteAnnotation;
    }
    @Override
    public final void invalidPrimaryKeyJoinColumnAnnotation(final String className) {
        super.log.logf(FQCN, WARN, null, invalidPrimaryKeyJoinColumnAnnotation$str(), className);
    }
    private static final String invalidPrimaryKeyJoinColumnAnnotation = "HHH000137: Root entity should not hold a PrimaryKeyJoinColum(s), will be ignored: %s";
    protected String invalidPrimaryKeyJoinColumnAnnotation$str() {
        return invalidPrimaryKeyJoinColumnAnnotation;
    }
    @Override
    public final void invalidSubStrategy(final String className) {
        super.log.logf(FQCN, WARN, null, invalidSubStrategy$str(), className);
    }
    private static final String invalidSubStrategy = "HHH000138: Mixing inheritance strategy in a entity hierarchy is not allowed, ignoring sub strategy in: %s";
    protected String invalidSubStrategy$str() {
        return invalidSubStrategy;
    }
    @Override
    public final void invalidTableAnnotation(final String className) {
        super.log.logf(FQCN, WARN, null, invalidTableAnnotation$str(), className);
    }
    private static final String invalidTableAnnotation = "HHH000139: Illegal use of @Table in a subclass of a SINGLE_TABLE hierarchy: %s";
    protected String invalidTableAnnotation$str() {
        return invalidTableAnnotation;
    }
    @Override
    public final void jaccContextId(final String contextId) {
        super.log.logf(FQCN, INFO, null, jaccContextId$str(), contextId);
    }
    private static final String jaccContextId = "HHH000140: JACC contextID: %s";
    protected String jaccContextId$str() {
        return jaccContextId;
    }
    @Override
    public final void JavaSqlTypesMappedSameCodeMultipleTimes(final int code, final String old, final String name) {
        super.log.logf(FQCN, INFO, null, JavaSqlTypesMappedSameCodeMultipleTimes$str(), code, old, name);
    }
    private static final String JavaSqlTypesMappedSameCodeMultipleTimes = "HHH000141: java.sql.Types mapped the same code [%s] multiple times; was [%s]; now [%s]";
    protected String JavaSqlTypesMappedSameCodeMultipleTimes$str() {
        return JavaSqlTypesMappedSameCodeMultipleTimes;
    }
    private static final String bytecodeEnhancementFailed = "HHH000142: Bytecode enhancement failed: %s";
    protected String bytecodeEnhancementFailed$str() {
        return bytecodeEnhancementFailed;
    }
    @Override
    public final String bytecodeEnhancementFailed(final String entityName) {
        return String.format(getLoggingLocale(), bytecodeEnhancementFailed$str(), entityName);
    }
    private static final String bytecodeEnhancementFailedBecauseOfDefaultConstructor = "HHH000143: Bytecode enhancement failed because no public, protected or package-private default constructor was found for entity: %s. Private constructors don't work with runtime proxies!";
    protected String bytecodeEnhancementFailedBecauseOfDefaultConstructor$str() {
        return bytecodeEnhancementFailedBecauseOfDefaultConstructor;
    }
    @Override
    public final String bytecodeEnhancementFailedBecauseOfDefaultConstructor(final String entityName) {
        return String.format(getLoggingLocale(), bytecodeEnhancementFailedBecauseOfDefaultConstructor$str(), entityName);
    }
    @Override
    public final void jdbcAutoCommitFalseBreaksEjb3Spec(final String autocommit) {
        super.log.logf(FQCN, WARN, null, jdbcAutoCommitFalseBreaksEjb3Spec$str(), autocommit);
    }
    private static final String jdbcAutoCommitFalseBreaksEjb3Spec = "HHH000144: %s = false breaks the EJB3 specification";
    protected String jdbcAutoCommitFalseBreaksEjb3Spec$str() {
        return jdbcAutoCommitFalseBreaksEjb3Spec;
    }
    private static final String jdbcRollbackFailed = "HHH000151: JDBC rollback failed";
    protected String jdbcRollbackFailed$str() {
        return jdbcRollbackFailed;
    }
    @Override
    public final String jdbcRollbackFailed() {
        return String.format(getLoggingLocale(), jdbcRollbackFailed$str());
    }
    @Override
    public final void jndiInitialContextProperties(final Hashtable hash) {
        super.log.logf(FQCN, INFO, null, jndiInitialContextProperties$str(), hash);
    }
    private static final String jndiInitialContextProperties = "HHH000154: JNDI InitialContext properties:%s";
    protected String jndiInitialContextProperties$str() {
        return jndiInitialContextProperties;
    }
    @Override
    public final void jndiNameDoesNotHandleSessionFactoryReference(final String sfJNDIName, final ClassCastException e) {
        super.log.logf(FQCN, ERROR, e, jndiNameDoesNotHandleSessionFactoryReference$str(), sfJNDIName);
    }
    private static final String jndiNameDoesNotHandleSessionFactoryReference = "HHH000155: JNDI name %s does not handle a session factory reference";
    protected String jndiNameDoesNotHandleSessionFactoryReference$str() {
        return jndiNameDoesNotHandleSessionFactoryReference;
    }
    @Override
    public final void lazyPropertyFetchingAvailable(final String name) {
        super.log.logf(FQCN, INFO, null, lazyPropertyFetchingAvailable$str(), name);
    }
    private static final String lazyPropertyFetchingAvailable = "HHH000157: Lazy property fetching available for: %s";
    protected String lazyPropertyFetchingAvailable$str() {
        return lazyPropertyFetchingAvailable;
    }
    @Override
    public final void loadingCollectionKeyNotFound(final CollectionKey collectionKey) {
        super.log.logf(FQCN, WARN, null, loadingCollectionKeyNotFound$str(), collectionKey);
    }
    private static final String loadingCollectionKeyNotFound = "HHH000159: In CollectionLoadContext#endLoadingCollections, localLoadingCollectionKeys contained [%s], but no LoadingCollectionEntry was found in loadContexts";
    protected String loadingCollectionKeyNotFound$str() {
        return loadingCollectionKeyNotFound;
    }
    @Override
    public final void localLoadingCollectionKeysCount(final int size) {
        super.log.logf(FQCN, WARN, null, localLoadingCollectionKeysCount$str(), size);
    }
    private static final String localLoadingCollectionKeysCount = "HHH000160: On CollectionLoadContext#cleanup, localLoadingCollectionKeys contained [%s] entries";
    protected String localLoadingCollectionKeysCount$str() {
        return localLoadingCollectionKeysCount;
    }
    @Override
    public final void loggingStatistics() {
        super.log.logf(FQCN, INFO, null, loggingStatistics$str());
    }
    private static final String loggingStatistics = "HHH000161: Logging statistics....";
    protected String loggingStatistics$str() {
        return loggingStatistics;
    }
    @Override
    public final void logicalConnectionClosed() {
        super.log.logf(FQCN, DEBUG, null, logicalConnectionClosed$str());
    }
    private static final String logicalConnectionClosed = "HHH000162: *** Logical connection closed ***";
    protected String logicalConnectionClosed$str() {
        return logicalConnectionClosed;
    }
    @Override
    public final void logicalConnectionReleasingPhysicalConnection() {
        super.log.logf(FQCN, DEBUG, null, logicalConnectionReleasingPhysicalConnection$str());
    }
    private static final String logicalConnectionReleasingPhysicalConnection = "HHH000163: Logical connection releasing its physical connection";
    protected String logicalConnectionReleasingPhysicalConnection$str() {
        return logicalConnectionReleasingPhysicalConnection;
    }
    @Override
    public final void maxQueryTime(final long queryExecutionMaxTime) {
        super.log.logf(FQCN, INFO, null, maxQueryTime$str(), queryExecutionMaxTime);
    }
    private static final String maxQueryTime = "HHH000173: Max query time: %sms";
    protected String maxQueryTime$str() {
        return maxQueryTime;
    }
    @Override
    public final void missingArguments(final int anticipatedNumberOfArguments, final int numberOfArguments) {
        super.log.logf(FQCN, WARN, null, missingArguments$str(), anticipatedNumberOfArguments, numberOfArguments);
    }
    private static final String missingArguments = "HHH000174: Function template anticipated %s arguments, but %s arguments encountered";
    protected String missingArguments$str() {
        return missingArguments;
    }
    @Override
    public final void missingEntityAnnotation(final String className) {
        super.log.logf(FQCN, WARN, null, missingEntityAnnotation$str(), className);
    }
    private static final String missingEntityAnnotation = "HHH000175: Class annotated @org.hibernate.annotations.Entity but not javax.persistence.Entity (most likely a user error): %s";
    protected String missingEntityAnnotation$str() {
        return missingEntityAnnotation;
    }
    @Override
    public final void namedQueryError(final String queryName, final HibernateException e) {
        super.log.logf(FQCN, ERROR, e, namedQueryError$str(), queryName);
    }
    private static final String namedQueryError = "HHH000177: Error in named query: %s";
    protected String namedQueryError$str() {
        return namedQueryError;
    }
    @Override
    public final void namingExceptionAccessingFactory(final NamingException exception) {
        super.log.logf(FQCN, WARN, null, namingExceptionAccessingFactory$str(), exception);
    }
    private static final String namingExceptionAccessingFactory = "HHH000178: Naming exception occurred accessing factory: %s";
    protected String namingExceptionAccessingFactory$str() {
        return namingExceptionAccessingFactory;
    }
    @Override
    public final void narrowingProxy(final Class concreteProxyClass) {
        super.log.logf(FQCN, WARN, null, narrowingProxy$str(), concreteProxyClass);
    }
    private static final String narrowingProxy = "HHH000179: Narrowing proxy to %s - this operation breaks ==";
    protected String narrowingProxy$str() {
        return narrowingProxy;
    }
    @Override
    public final void needsLimit() {
        super.log.logf(FQCN, WARN, null, needsLimit$str());
    }
    private static final String needsLimit = "HHH000180: FirstResult/maxResults specified on polymorphic query; applying in memory!";
    protected String needsLimit$str() {
        return needsLimit;
    }
    @Override
    public final void noAppropriateConnectionProvider() {
        super.log.logf(FQCN, WARN, null, noAppropriateConnectionProvider$str());
    }
    private static final String noAppropriateConnectionProvider = "HHH000181: No appropriate connection provider encountered, assuming application will be supplying connections";
    protected String noAppropriateConnectionProvider$str() {
        return noAppropriateConnectionProvider;
    }
    @Override
    public final void noDefaultConstructor(final String name) {
        super.log.logf(FQCN, INFO, null, noDefaultConstructor$str(), name);
    }
    private static final String noDefaultConstructor = "HHH000182: No default (no-argument) constructor for class: %s (class must be instantiated by Interceptor)";
    protected String noDefaultConstructor$str() {
        return noDefaultConstructor;
    }
    @Override
    public final void noPersistentClassesFound(final String query) {
        super.log.logf(FQCN, WARN, null, noPersistentClassesFound$str(), query);
    }
    private static final String noPersistentClassesFound = "HHH000183: no persistent classes found for query class: %s";
    protected String noPersistentClassesFound$str() {
        return noPersistentClassesFound;
    }
    @Override
    public final void noSessionFactoryWithJndiName(final String sfJNDIName, final NameNotFoundException e) {
        super.log.logf(FQCN, ERROR, e, noSessionFactoryWithJndiName$str(), sfJNDIName);
    }
    private static final String noSessionFactoryWithJndiName = "HHH000184: No session factory with JNDI name %s";
    protected String noSessionFactoryWithJndiName$str() {
        return noSessionFactoryWithJndiName;
    }
    @Override
    public final void optimisticLockFailures(final long optimisticFailureCount) {
        super.log.logf(FQCN, INFO, null, optimisticLockFailures$str(), optimisticFailureCount);
    }
    private static final String optimisticLockFailures = "HHH000187: Optimistic lock failures: %s";
    protected String optimisticLockFailures$str() {
        return optimisticLockFailures;
    }
    @Override
    public final void orderByAnnotationIndexedCollection() {
        super.log.logf(FQCN, WARN, null, orderByAnnotationIndexedCollection$str());
    }
    private static final String orderByAnnotationIndexedCollection = "HHH000189: @OrderBy not allowed for an indexed collection, annotation ignored.";
    protected String orderByAnnotationIndexedCollection$str() {
        return orderByAnnotationIndexedCollection;
    }
    @Override
    public final void overridingTransactionStrategyDangerous(final String transactionStrategy) {
        super.log.logf(FQCN, WARN, null, overridingTransactionStrategyDangerous$str(), transactionStrategy);
    }
    private static final String overridingTransactionStrategyDangerous = "HHH000193: Overriding %s is dangerous, this might break the EJB3 specification implementation";
    protected String overridingTransactionStrategyDangerous$str() {
        return overridingTransactionStrategyDangerous;
    }
    @Override
    public final void packageNotFound(final String packageName) {
        super.log.logf(FQCN, DEBUG, null, packageNotFound$str(), packageName);
    }
    private static final String packageNotFound = "HHH000194: Package not found or wo package-info.java: %s";
    protected String packageNotFound$str() {
        return packageNotFound;
    }
    @Override
    public final void parsingXmlError(final int lineNumber, final String message) {
        super.log.logf(FQCN, ERROR, null, parsingXmlError$str(), lineNumber, message);
    }
    private static final String parsingXmlError = "HHH000196: Error parsing XML (%s) : %s";
    protected String parsingXmlError$str() {
        return parsingXmlError;
    }
    @Override
    public final void parsingXmlErrorForFile(final String file, final int lineNumber, final String message) {
        super.log.logf(FQCN, ERROR, null, parsingXmlErrorForFile$str(), file, lineNumber, message);
    }
    private static final String parsingXmlErrorForFile = "HHH000197: Error parsing XML: %s(%s) %s";
    protected String parsingXmlErrorForFile$str() {
        return parsingXmlErrorForFile;
    }
    @Override
    public final void parsingXmlWarning(final int lineNumber, final String message) {
        super.log.logf(FQCN, ERROR, null, parsingXmlWarning$str(), lineNumber, message);
    }
    private static final String parsingXmlWarning = "HHH000198: Warning parsing XML (%s) : %s";
    protected String parsingXmlWarning$str() {
        return parsingXmlWarning;
    }
    @Override
    public final void parsingXmlWarningForFile(final String file, final int lineNumber, final String message) {
        super.log.logf(FQCN, WARN, null, parsingXmlWarningForFile$str(), file, lineNumber, message);
    }
    private static final String parsingXmlWarningForFile = "HHH000199: Warning parsing XML: %s(%s) %s";
    protected String parsingXmlWarningForFile$str() {
        return parsingXmlWarningForFile;
    }
    @Override
    public final void persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly() {
        super.log.logf(FQCN, WARN, null, persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str());
    }
    private static final String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly = "HHH000200: Persistence provider caller does not implement the EJB3 spec correctly.PersistenceUnitInfo.getNewTempClassLoader() is null.";
    protected String persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly$str() {
        return persistenceProviderCallerDoesNotImplementEjb3SpecCorrectly;
    }
    @Override
    public final void pooledOptimizerReportedInitialValue(final IntegralDataTypeHolder value) {
        super.log.logf(FQCN, INFO, null, pooledOptimizerReportedInitialValue$str(), value);
    }
    private static final String pooledOptimizerReportedInitialValue = "HHH000201: Pooled optimizer source reported [%s] as the initial value; use of 1 or greater highly recommended";
    protected String pooledOptimizerReportedInitialValue$str() {
        return pooledOptimizerReportedInitialValue;
    }
    @Override
    public final void preparedStatementAlreadyInBatch(final String sql) {
        super.log.logf(FQCN, ERROR, null, preparedStatementAlreadyInBatch$str(), sql);
    }
    private static final String preparedStatementAlreadyInBatch = "HHH000202: PreparedStatement was already in the batch, [%s].";
    protected String preparedStatementAlreadyInBatch$str() {
        return preparedStatementAlreadyInBatch;
    }
    @Override
    public final void processEqualityExpression() {
        super.log.logf(FQCN, WARN, null, processEqualityExpression$str());
    }
    private static final String processEqualityExpression = "HHH000203: processEqualityExpression() : No expression to process!";
    protected String processEqualityExpression$str() {
        return processEqualityExpression;
    }
    @Override
    public final void processingPersistenceUnitInfoName(final String persistenceUnitName) {
        super.log.logf(FQCN, INFO, null, processingPersistenceUnitInfoName$str(), persistenceUnitName);
    }
    private static final String processingPersistenceUnitInfoName = "HHH000204: Processing PersistenceUnitInfo [name: %s]";
    protected String processingPersistenceUnitInfoName$str() {
        return processingPersistenceUnitInfoName;
    }
    @Override
    public final void propertiesLoaded(final Properties maskOut) {
        super.log.logf(FQCN, INFO, null, propertiesLoaded$str(), maskOut);
    }
    private static final String propertiesLoaded = "HHH000205: Loaded properties from resource hibernate.properties: %s";
    protected String propertiesLoaded$str() {
        return propertiesLoaded;
    }
    @Override
    public final void propertiesNotFound() {
        super.log.logf(FQCN, DEBUG, null, propertiesNotFound$str());
    }
    private static final String propertiesNotFound = "HHH000206: hibernate.properties not found";
    protected String propertiesNotFound$str() {
        return propertiesNotFound;
    }
    @Override
    public final void propertyNotFound(final String property) {
        super.log.logf(FQCN, WARN, null, propertyNotFound$str(), property);
    }
    private static final String propertyNotFound = "HHH000207: Property %s not found in class but described in <mapping-file/> (possible typo error)";
    protected String propertyNotFound$str() {
        return propertyNotFound;
    }
    @Override
    public final void proxoolProviderClassNotFound(final String proxoolProviderClassName) {
        super.log.logf(FQCN, WARN, null, proxoolProviderClassNotFound$str(), proxoolProviderClassName);
    }
    private static final String proxoolProviderClassNotFound = "HHH000209: proxool properties were encountered, but the %s provider class was not found on the classpath; these properties are going to be ignored.";
    protected String proxoolProviderClassNotFound$str() {
        return proxoolProviderClassNotFound;
    }
    @Override
    public final void queriesExecuted(final long queryExecutionCount) {
        super.log.logf(FQCN, INFO, null, queriesExecuted$str(), queryExecutionCount);
    }
    private static final String queriesExecuted = "HHH000210: Queries executed to database: %s";
    protected String queriesExecuted$str() {
        return queriesExecuted;
    }
    @Override
    public final void queryCacheHits(final long queryCacheHitCount) {
        super.log.logf(FQCN, INFO, null, queryCacheHits$str(), queryCacheHitCount);
    }
    private static final String queryCacheHits = "HHH000213: Query cache hits: %s";
    protected String queryCacheHits$str() {
        return queryCacheHits;
    }
    @Override
    public final void queryCacheMisses(final long queryCacheMissCount) {
        super.log.logf(FQCN, INFO, null, queryCacheMisses$str(), queryCacheMissCount);
    }
    private static final String queryCacheMisses = "HHH000214: Query cache misses: %s";
    protected String queryCacheMisses$str() {
        return queryCacheMisses;
    }
    @Override
    public final void queryCachePuts(final long queryCachePutCount) {
        super.log.logf(FQCN, INFO, null, queryCachePuts$str(), queryCachePutCount);
    }
    private static final String queryCachePuts = "HHH000215: Query cache puts: %s";
    protected String queryCachePuts$str() {
        return queryCachePuts;
    }
    @Override
    public final void rdmsOs2200Dialect() {
        super.log.logf(FQCN, INFO, null, rdmsOs2200Dialect$str());
    }
    private static final String rdmsOs2200Dialect = "HHH000218: RDMSOS2200Dialect version: 1.0";
    protected String rdmsOs2200Dialect$str() {
        return rdmsOs2200Dialect;
    }
    @Override
    public final void readingCachedMappings(final File cachedFile) {
        super.log.logf(FQCN, INFO, null, readingCachedMappings$str(), cachedFile);
    }
    private static final String readingCachedMappings = "HHH000219: Reading mappings from cache file: %s";
    protected String readingCachedMappings$str() {
        return readingCachedMappings;
    }
    @Override
    public final void readingMappingsFromFile(final String path) {
        super.log.logf(FQCN, INFO, null, readingMappingsFromFile$str(), path);
    }
    private static final String readingMappingsFromFile = "HHH000220: Reading mappings from file: %s";
    protected String readingMappingsFromFile$str() {
        return readingMappingsFromFile;
    }
    @Override
    public final void readingMappingsFromResource(final String resourceName) {
        super.log.logf(FQCN, INFO, null, readingMappingsFromResource$str(), resourceName);
    }
    private static final String readingMappingsFromResource = "HHH000221: Reading mappings from resource: %s";
    protected String readingMappingsFromResource$str() {
        return readingMappingsFromResource;
    }
    @Override
    public final void readOnlyCacheConfiguredForMutableCollection(final String name) {
        super.log.logf(FQCN, WARN, null, readOnlyCacheConfiguredForMutableCollection$str(), name);
    }
    private static final String readOnlyCacheConfiguredForMutableCollection = "HHH000222: read-only cache configured for mutable collection [%s]";
    protected String readOnlyCacheConfiguredForMutableCollection$str() {
        return readOnlyCacheConfiguredForMutableCollection;
    }
    @Override
    public final void recognizedObsoleteHibernateNamespace(final String oldHibernateNamespace, final String hibernateNamespace) {
        super.log.logf(FQCN, WARN, null, recognizedObsoleteHibernateNamespace$str(), oldHibernateNamespace, hibernateNamespace);
    }
    private static final String recognizedObsoleteHibernateNamespace = "HHH000223: Recognized obsolete hibernate namespace %s. Use namespace %s instead. Refer to Hibernate 3.6 Migration Guide!";
    protected String recognizedObsoleteHibernateNamespace$str() {
        return recognizedObsoleteHibernateNamespace;
    }
    @Override
    public final void renamedProperty(final Object propertyName, final Object newPropertyName) {
        super.log.logf(FQCN, WARN, null, renamedProperty$str(), propertyName, newPropertyName);
    }
    private static final String renamedProperty = "HHH000225: Property [%s] has been renamed to [%s]; update your properties appropriately";
    protected String renamedProperty$str() {
        return renamedProperty;
    }
    @Override
    public final void requiredDifferentProvider(final String provider) {
        super.log.logf(FQCN, INFO, null, requiredDifferentProvider$str(), provider);
    }
    private static final String requiredDifferentProvider = "HHH000226: Required a different provider: %s";
    protected String requiredDifferentProvider$str() {
        return requiredDifferentProvider;
    }
    @Override
    public final void runningHbm2ddlSchemaExport() {
        super.log.logf(FQCN, INFO, null, runningHbm2ddlSchemaExport$str());
    }
    private static final String runningHbm2ddlSchemaExport = "HHH000227: Running hbm2ddl schema export";
    protected String runningHbm2ddlSchemaExport$str() {
        return runningHbm2ddlSchemaExport;
    }
    @Override
    public final void runningHbm2ddlSchemaUpdate() {
        super.log.logf(FQCN, INFO, null, runningHbm2ddlSchemaUpdate$str());
    }
    private static final String runningHbm2ddlSchemaUpdate = "HHH000228: Running hbm2ddl schema update";
    protected String runningHbm2ddlSchemaUpdate$str() {
        return runningHbm2ddlSchemaUpdate;
    }
    @Override
    public final void runningSchemaValidator() {
        super.log.logf(FQCN, INFO, null, runningSchemaValidator$str());
    }
    private static final String runningSchemaValidator = "HHH000229: Running schema validator";
    protected String runningSchemaValidator$str() {
        return runningSchemaValidator;
    }
    @Override
    public final void schemaExportComplete() {
        super.log.logf(FQCN, INFO, null, schemaExportComplete$str());
    }
    private static final String schemaExportComplete = "HHH000230: Schema export complete";
    protected String schemaExportComplete$str() {
        return schemaExportComplete;
    }
    @Override
    public final void schemaExportUnsuccessful(final Exception e) {
        super.log.logf(FQCN, ERROR, e, schemaExportUnsuccessful$str());
    }
    private static final String schemaExportUnsuccessful = "HHH000231: Schema export unsuccessful";
    protected String schemaExportUnsuccessful$str() {
        return schemaExportUnsuccessful;
    }
    @Override
    public final void schemaUpdateComplete() {
        super.log.logf(FQCN, INFO, null, schemaUpdateComplete$str());
    }
    private static final String schemaUpdateComplete = "HHH000232: Schema update complete";
    protected String schemaUpdateComplete$str() {
        return schemaUpdateComplete;
    }
    @Override
    public final void scopingTypesToSessionFactoryAfterAlreadyScoped(final SessionFactoryImplementor factory, final SessionFactoryImplementor factory2) {
        super.log.logf(FQCN, WARN, null, scopingTypesToSessionFactoryAfterAlreadyScoped$str(), factory, factory2);
    }
    private static final String scopingTypesToSessionFactoryAfterAlreadyScoped = "HHH000233: Scoping types to session factory %s after already scoped %s";
    protected String scopingTypesToSessionFactoryAfterAlreadyScoped$str() {
        return scopingTypesToSessionFactoryAfterAlreadyScoped;
    }
    @Override
    public final void searchingForMappingDocuments(final String name) {
        super.log.logf(FQCN, INFO, null, searchingForMappingDocuments$str(), name);
    }
    private static final String searchingForMappingDocuments = "HHH000235: Searching for mapping documents in jar: %s";
    protected String searchingForMappingDocuments$str() {
        return searchingForMappingDocuments;
    }
    @Override
    public final void secondLevelCacheHits(final long secondLevelCacheHitCount) {
        super.log.logf(FQCN, INFO, null, secondLevelCacheHits$str(), secondLevelCacheHitCount);
    }
    private static final String secondLevelCacheHits = "HHH000237: Second level cache hits: %s";
    protected String secondLevelCacheHits$str() {
        return secondLevelCacheHits;
    }
    @Override
    public final void secondLevelCacheMisses(final long secondLevelCacheMissCount) {
        super.log.logf(FQCN, INFO, null, secondLevelCacheMisses$str(), secondLevelCacheMissCount);
    }
    private static final String secondLevelCacheMisses = "HHH000238: Second level cache misses: %s";
    protected String secondLevelCacheMisses$str() {
        return secondLevelCacheMisses;
    }
    @Override
    public final void secondLevelCachePuts(final long secondLevelCachePutCount) {
        super.log.logf(FQCN, INFO, null, secondLevelCachePuts$str(), secondLevelCachePutCount);
    }
    private static final String secondLevelCachePuts = "HHH000239: Second level cache puts: %s";
    protected String secondLevelCachePuts$str() {
        return secondLevelCachePuts;
    }
    @Override
    public final void serviceProperties(final Properties properties) {
        super.log.logf(FQCN, INFO, null, serviceProperties$str(), properties);
    }
    private static final String serviceProperties = "HHH000240: Service properties: %s";
    protected String serviceProperties$str() {
        return serviceProperties;
    }
    @Override
    public final void sessionsClosed(final long sessionCloseCount) {
        super.log.logf(FQCN, INFO, null, sessionsClosed$str(), sessionCloseCount);
    }
    private static final String sessionsClosed = "HHH000241: Sessions closed: %s";
    protected String sessionsClosed$str() {
        return sessionsClosed;
    }
    @Override
    public final void sessionsOpened(final long sessionOpenCount) {
        super.log.logf(FQCN, INFO, null, sessionsOpened$str(), sessionOpenCount);
    }
    private static final String sessionsOpened = "HHH000242: Sessions opened: %s";
    protected String sessionsOpened$str() {
        return sessionsOpened;
    }
    @Override
    public final void sortAnnotationIndexedCollection() {
        super.log.logf(FQCN, WARN, null, sortAnnotationIndexedCollection$str());
    }
    private static final String sortAnnotationIndexedCollection = "HHH000244: @Sort not allowed for an indexed collection, annotation ignored.";
    protected String sortAnnotationIndexedCollection$str() {
        return sortAnnotationIndexedCollection;
    }
    @Override
    public final void splitQueries(final String sourceQuery, final int length) {
        super.log.logf(FQCN, WARN, null, splitQueries$str(), sourceQuery, length);
    }
    private static final String splitQueries = "HHH000245: Manipulation query [%s] resulted in [%s] split queries";
    protected String splitQueries$str() {
        return splitQueries;
    }
    @Override
    public final void sqlWarning(final int errorCode, final String sqlState) {
        super.log.logf(FQCN, WARN, null, sqlWarning$str(), errorCode, sqlState);
    }
    private static final String sqlWarning = "HHH000247: SQL Error: %s, SQLState: %s";
    protected String sqlWarning$str() {
        return sqlWarning;
    }
    @Override
    public final void startingQueryCache(final String region) {
        super.log.logf(FQCN, INFO, null, startingQueryCache$str(), region);
    }
    private static final String startingQueryCache = "HHH000248: Starting query cache at region: %s";
    protected String startingQueryCache$str() {
        return startingQueryCache;
    }
    @Override
    public final void startingServiceAtJndiName(final String boundName) {
        super.log.logf(FQCN, INFO, null, startingServiceAtJndiName$str(), boundName);
    }
    private static final String startingServiceAtJndiName = "HHH000249: Starting service at JNDI name: %s";
    protected String startingServiceAtJndiName$str() {
        return startingServiceAtJndiName;
    }
    @Override
    public final void startingUpdateTimestampsCache(final String region) {
        super.log.logf(FQCN, INFO, null, startingUpdateTimestampsCache$str(), region);
    }
    private static final String startingUpdateTimestampsCache = "HHH000250: Starting update timestamps cache at region: %s";
    protected String startingUpdateTimestampsCache$str() {
        return startingUpdateTimestampsCache;
    }
    @Override
    public final void startTime(final long startTime) {
        super.log.logf(FQCN, INFO, null, startTime$str(), startTime);
    }
    private static final String startTime = "HHH000251: Start time: %s";
    protected String startTime$str() {
        return startTime;
    }
    @Override
    public final void statementsClosed(final long closeStatementCount) {
        super.log.logf(FQCN, INFO, null, statementsClosed$str(), closeStatementCount);
    }
    private static final String statementsClosed = "HHH000252: Statements closed: %s";
    protected String statementsClosed$str() {
        return statementsClosed;
    }
    @Override
    public final void statementsPrepared(final long prepareStatementCount) {
        super.log.logf(FQCN, INFO, null, statementsPrepared$str(), prepareStatementCount);
    }
    private static final String statementsPrepared = "HHH000253: Statements prepared: %s";
    protected String statementsPrepared$str() {
        return statementsPrepared;
    }
    @Override
    public final void stoppingService() {
        super.log.logf(FQCN, INFO, null, stoppingService$str());
    }
    private static final String stoppingService = "HHH000255: Stopping service";
    protected String stoppingService$str() {
        return stoppingService;
    }
    @Override
    public final void subResolverException(final String message) {
        super.log.logf(FQCN, INFO, null, subResolverException$str(), message);
    }
    private static final String subResolverException = "HHH000257: sub-resolver threw unexpected exception, continuing to next : %s";
    protected String subResolverException$str() {
        return subResolverException;
    }
    @Override
    public final void successfulTransactions(final long committedTransactionCount) {
        super.log.logf(FQCN, INFO, null, successfulTransactions$str(), committedTransactionCount);
    }
    private static final String successfulTransactions = "HHH000258: Successful transactions: %s";
    protected String successfulTransactions$str() {
        return successfulTransactions;
    }
    @Override
    public final void synchronizationAlreadyRegistered(final Synchronization synchronization) {
        super.log.logf(FQCN, INFO, null, synchronizationAlreadyRegistered$str(), synchronization);
    }
    private static final String synchronizationAlreadyRegistered = "HHH000259: Synchronization [%s] was already registered";
    protected String synchronizationAlreadyRegistered$str() {
        return synchronizationAlreadyRegistered;
    }
    @Override
    public final void synchronizationFailed(final Synchronization synchronization, final Throwable t) {
        super.log.logf(FQCN, ERROR, null, synchronizationFailed$str(), synchronization, t);
    }
    private static final String synchronizationFailed = "HHH000260: Exception calling user Synchronization [%s] : %s";
    protected String synchronizationFailed$str() {
        return synchronizationFailed;
    }
    @Override
    public final void tableFound(final String string) {
        super.log.logf(FQCN, INFO, null, tableFound$str(), string);
    }
    private static final String tableFound = "HHH000261: Table found: %s";
    protected String tableFound$str() {
        return tableFound;
    }
    @Override
    public final void tableNotFound(final String name) {
        super.log.logf(FQCN, INFO, null, tableNotFound$str(), name);
    }
    private static final String tableNotFound = "HHH000262: Table not found: %s";
    protected String tableNotFound$str() {
        return tableNotFound;
    }
    @Override
    public final void multipleTablesFound(final String name) {
        super.log.logf(FQCN, INFO, null, multipleTablesFound$str(), name);
    }
    private static final String multipleTablesFound = "HHH000263: More than one table found: %s";
    protected String multipleTablesFound$str() {
        return multipleTablesFound;
    }
    @Override
    public final void transactions(final long transactionCount) {
        super.log.logf(FQCN, INFO, null, transactions$str(), transactionCount);
    }
    private static final String transactions = "HHH000266: Transactions: %s";
    protected String transactions$str() {
        return transactions;
    }
    @Override
    public final void transactionStartedOnNonRootSession() {
        super.log.logf(FQCN, WARN, null, transactionStartedOnNonRootSession$str());
    }
    private static final String transactionStartedOnNonRootSession = "HHH000267: Transaction started on non-root session";
    protected String transactionStartedOnNonRootSession$str() {
        return transactionStartedOnNonRootSession;
    }
    @Override
    public final void transactionStrategy(final String strategyClassName) {
        super.log.logf(FQCN, INFO, null, transactionStrategy$str(), strategyClassName);
    }
    private static final String transactionStrategy = "HHH000268: Transaction strategy: %s";
    protected String transactionStrategy$str() {
        return transactionStrategy;
    }
    @Override
    public final void typeDefinedNoRegistrationKeys(final BasicType type) {
        super.log.logf(FQCN, WARN, null, typeDefinedNoRegistrationKeys$str(), type);
    }
    private static final String typeDefinedNoRegistrationKeys = "HHH000269: Type [%s] defined no registration keys; ignoring";
    protected String typeDefinedNoRegistrationKeys$str() {
        return typeDefinedNoRegistrationKeys;
    }
    @Override
    public final void typeRegistrationOverridesPrevious(final String key, final Type old) {
        super.log.logf(FQCN, DEBUG, null, typeRegistrationOverridesPrevious$str(), key, old);
    }
    private static final String typeRegistrationOverridesPrevious = "HHH000270: Type registration [%s] overrides previous : %s";
    protected String typeRegistrationOverridesPrevious$str() {
        return typeRegistrationOverridesPrevious;
    }
    @Override
    public final void unableToAccessEjb3Configuration(final NamingException e) {
        super.log.logf(FQCN, WARN, e, unableToAccessEjb3Configuration$str());
    }
    private static final String unableToAccessEjb3Configuration = "HHH000271: Naming exception occurred accessing Ejb3Configuration";
    protected String unableToAccessEjb3Configuration$str() {
        return unableToAccessEjb3Configuration;
    }
    @Override
    public final void unableToAccessSessionFactory(final String sfJNDIName, final NamingException e) {
        super.log.logf(FQCN, ERROR, e, unableToAccessSessionFactory$str(), sfJNDIName);
    }
    private static final String unableToAccessSessionFactory = "HHH000272: Error while accessing session factory with JNDI name %s";
    protected String unableToAccessSessionFactory$str() {
        return unableToAccessSessionFactory;
    }
    @Override
    public final void unableToAccessTypeInfoResultSet(final String string) {
        super.log.logf(FQCN, WARN, null, unableToAccessTypeInfoResultSet$str(), string);
    }
    private static final String unableToAccessTypeInfoResultSet = "HHH000273: Error accessing type info result set : %s";
    protected String unableToAccessTypeInfoResultSet$str() {
        return unableToAccessTypeInfoResultSet;
    }
    @Override
    public final void unableToApplyConstraints(final String className, final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToApplyConstraints$str(), className);
    }
    private static final String unableToApplyConstraints = "HHH000274: Unable to apply constraints on DDL for %s";
    protected String unableToApplyConstraints$str() {
        return unableToApplyConstraints;
    }
    @Override
    public final void unableToBindEjb3ConfigurationToJndi(final JndiException e) {
        super.log.logf(FQCN, WARN, e, unableToBindEjb3ConfigurationToJndi$str());
    }
    private static final String unableToBindEjb3ConfigurationToJndi = "HHH000276: Could not bind Ejb3Configuration to JNDI";
    protected String unableToBindEjb3ConfigurationToJndi$str() {
        return unableToBindEjb3ConfigurationToJndi;
    }
    @Override
    public final void unableToBindFactoryToJndi(final JndiException e) {
        super.log.logf(FQCN, WARN, e, unableToBindFactoryToJndi$str());
    }
    private static final String unableToBindFactoryToJndi = "HHH000277: Could not bind factory to JNDI";
    protected String unableToBindFactoryToJndi$str() {
        return unableToBindFactoryToJndi;
    }
    @Override
    public final void unableToBindValueToParameter(final String nullSafeToString, final int index, final String message) {
        super.log.logf(FQCN, INFO, null, unableToBindValueToParameter$str(), nullSafeToString, index, message);
    }
    private static final String unableToBindValueToParameter = "HHH000278: Could not bind value '%s' to parameter: %s; %s";
    protected String unableToBindValueToParameter$str() {
        return unableToBindValueToParameter;
    }
    @Override
    public final void unableToBuildEnhancementMetamodel(final String className) {
        super.log.logf(FQCN, ERROR, null, unableToBuildEnhancementMetamodel$str(), className);
    }
    private static final String unableToBuildEnhancementMetamodel = "HHH000279: Unable to build enhancement metamodel for %s";
    protected String unableToBuildEnhancementMetamodel$str() {
        return unableToBuildEnhancementMetamodel;
    }
    @Override
    public final void unableToBuildSessionFactoryUsingMBeanClasspath(final String message) {
        super.log.logf(FQCN, INFO, null, unableToBuildSessionFactoryUsingMBeanClasspath$str(), message);
    }
    private static final String unableToBuildSessionFactoryUsingMBeanClasspath = "HHH000280: Could not build SessionFactory using the MBean classpath - will try again using client classpath: %s";
    protected String unableToBuildSessionFactoryUsingMBeanClasspath$str() {
        return unableToBuildSessionFactoryUsingMBeanClasspath;
    }
    @Override
    public final void unableToCleanUpCallableStatement(final SQLException e) {
        super.log.logf(FQCN, WARN, e, unableToCleanUpCallableStatement$str());
    }
    private static final String unableToCleanUpCallableStatement = "HHH000281: Unable to clean up callable statement";
    protected String unableToCleanUpCallableStatement$str() {
        return unableToCleanUpCallableStatement;
    }
    @Override
    public final void unableToCleanUpPreparedStatement(final SQLException e) {
        super.log.logf(FQCN, WARN, e, unableToCleanUpPreparedStatement$str());
    }
    private static final String unableToCleanUpPreparedStatement = "HHH000282: Unable to clean up prepared statement";
    protected String unableToCleanUpPreparedStatement$str() {
        return unableToCleanUpPreparedStatement;
    }
    @Override
    public final void unableToCleanupTemporaryIdTable(final Throwable t) {
        super.log.logf(FQCN, WARN, null, unableToCleanupTemporaryIdTable$str(), t);
    }
    private static final String unableToCleanupTemporaryIdTable = "HHH000283: Unable to cleanup temporary id table after use [%s]";
    protected String unableToCleanupTemporaryIdTable$str() {
        return unableToCleanupTemporaryIdTable;
    }
    @Override
    public final void unableToCloseConnection(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToCloseConnection$str());
    }
    private static final String unableToCloseConnection = "HHH000284: Error closing connection";
    protected String unableToCloseConnection$str() {
        return unableToCloseConnection;
    }
    @Override
    public final void unableToCloseInitialContext(final String string) {
        super.log.logf(FQCN, INFO, null, unableToCloseInitialContext$str(), string);
    }
    private static final String unableToCloseInitialContext = "HHH000285: Error closing InitialContext [%s]";
    protected String unableToCloseInitialContext$str() {
        return unableToCloseInitialContext;
    }
    @Override
    public final void unableToCloseInputFiles(final String name, final IOException e) {
        super.log.logf(FQCN, ERROR, e, unableToCloseInputFiles$str(), name);
    }
    private static final String unableToCloseInputFiles = "HHH000286: Error closing input files: %s";
    protected String unableToCloseInputFiles$str() {
        return unableToCloseInputFiles;
    }
    @Override
    public final void unableToCloseInputStream(final IOException e) {
        super.log.logf(FQCN, WARN, e, unableToCloseInputStream$str());
    }
    private static final String unableToCloseInputStream = "HHH000287: Could not close input stream";
    protected String unableToCloseInputStream$str() {
        return unableToCloseInputStream;
    }
    @Override
    public final void unableToCloseInputStreamForResource(final String resourceName, final IOException e) {
        super.log.logf(FQCN, WARN, e, unableToCloseInputStreamForResource$str(), resourceName);
    }
    private static final String unableToCloseInputStreamForResource = "HHH000288: Could not close input stream for %s";
    protected String unableToCloseInputStreamForResource$str() {
        return unableToCloseInputStreamForResource;
    }
    @Override
    public final void unableToCloseIterator(final SQLException e) {
        super.log.logf(FQCN, INFO, e, unableToCloseIterator$str());
    }
    private static final String unableToCloseIterator = "HHH000289: Unable to close iterator";
    protected String unableToCloseIterator$str() {
        return unableToCloseIterator;
    }
    @Override
    public final void unableToCloseJar(final String message) {
        super.log.logf(FQCN, ERROR, null, unableToCloseJar$str(), message);
    }
    private static final String unableToCloseJar = "HHH000290: Could not close jar: %s";
    protected String unableToCloseJar$str() {
        return unableToCloseJar;
    }
    @Override
    public final void unableToCloseOutputFile(final String outputFile, final IOException e) {
        super.log.logf(FQCN, ERROR, e, unableToCloseOutputFile$str(), outputFile);
    }
    private static final String unableToCloseOutputFile = "HHH000291: Error closing output file: %s";
    protected String unableToCloseOutputFile$str() {
        return unableToCloseOutputFile;
    }
    @Override
    public final void unableToCloseOutputStream(final IOException e) {
        super.log.logf(FQCN, WARN, e, unableToCloseOutputStream$str());
    }
    private static final String unableToCloseOutputStream = "HHH000292: IOException occurred closing output stream";
    protected String unableToCloseOutputStream$str() {
        return unableToCloseOutputStream;
    }
    @Override
    public final void unableToCloseSession(final HibernateException e) {
        super.log.logf(FQCN, ERROR, e, unableToCloseSession$str());
    }
    private static final String unableToCloseSession = "HHH000294: Could not close session";
    protected String unableToCloseSession$str() {
        return unableToCloseSession;
    }
    @Override
    public final void unableToCloseSessionDuringRollback(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToCloseSessionDuringRollback$str());
    }
    private static final String unableToCloseSessionDuringRollback = "HHH000295: Could not close session during rollback";
    protected String unableToCloseSessionDuringRollback$str() {
        return unableToCloseSessionDuringRollback;
    }
    @Override
    public final void unableToCloseStream(final IOException e) {
        super.log.logf(FQCN, WARN, e, unableToCloseStream$str());
    }
    private static final String unableToCloseStream = "HHH000296: IOException occurred closing stream";
    protected String unableToCloseStream$str() {
        return unableToCloseStream;
    }
    @Override
    public final void unableToCloseStreamError(final IOException error) {
        super.log.logf(FQCN, ERROR, null, unableToCloseStreamError$str(), error);
    }
    private static final String unableToCloseStreamError = "HHH000297: Could not close stream on hibernate.properties: %s";
    protected String unableToCloseStreamError$str() {
        return unableToCloseStreamError;
    }
    private static final String unableToCommitJta = "HHH000298: JTA commit failed";
    protected String unableToCommitJta$str() {
        return unableToCommitJta;
    }
    @Override
    public final String unableToCommitJta() {
        return String.format(getLoggingLocale(), unableToCommitJta$str());
    }
    @Override
    public final void unableToCompleteSchemaUpdate(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToCompleteSchemaUpdate$str());
    }
    private static final String unableToCompleteSchemaUpdate = "HHH000299: Could not complete schema update";
    protected String unableToCompleteSchemaUpdate$str() {
        return unableToCompleteSchemaUpdate;
    }
    @Override
    public final void unableToCompleteSchemaValidation(final SQLException e) {
        super.log.logf(FQCN, ERROR, e, unableToCompleteSchemaValidation$str());
    }
    private static final String unableToCompleteSchemaValidation = "HHH000300: Could not complete schema validation";
    protected String unableToCompleteSchemaValidation$str() {
        return unableToCompleteSchemaValidation;
    }
    @Override
    public final void unableToConfigureSqlExceptionConverter(final HibernateException e) {
        super.log.logf(FQCN, WARN, null, unableToConfigureSqlExceptionConverter$str(), e);
    }
    private static final String unableToConfigureSqlExceptionConverter = "HHH000301: Unable to configure SQLExceptionConverter : %s";
    protected String unableToConfigureSqlExceptionConverter$str() {
        return unableToConfigureSqlExceptionConverter;
    }
    @Override
    public final void unableToConstructCurrentSessionContext(final String impl, final Throwable e) {
        super.log.logf(FQCN, ERROR, e, unableToConstructCurrentSessionContext$str(), impl);
    }
    private static final String unableToConstructCurrentSessionContext = "HHH000302: Unable to construct current session context [%s]";
    protected String unableToConstructCurrentSessionContext$str() {
        return unableToConstructCurrentSessionContext;
    }
    @Override
    public final void unableToConstructSqlExceptionConverter(final Throwable t) {
        super.log.logf(FQCN, WARN, null, unableToConstructSqlExceptionConverter$str(), t);
    }
    private static final String unableToConstructSqlExceptionConverter = "HHH000303: Unable to construct instance of specified SQLExceptionConverter : %s";
    protected String unableToConstructSqlExceptionConverter$str() {
        return unableToConstructSqlExceptionConverter;
    }
    @Override
    public final void unableToCopySystemProperties() {
        super.log.logf(FQCN, WARN, null, unableToCopySystemProperties$str());
    }
    private static final String unableToCopySystemProperties = "HHH000304: Could not copy system properties, system properties will be ignored";
    protected String unableToCopySystemProperties$str() {
        return unableToCopySystemProperties;
    }
    @Override
    public final void unableToCreateProxyFactory(final String entityName, final HibernateException e) {
        super.log.logf(FQCN, WARN, e, unableToCreateProxyFactory$str(), entityName);
    }
    private static final String unableToCreateProxyFactory = "HHH000305: Could not create proxy factory for:%s";
    protected String unableToCreateProxyFactory$str() {
        return unableToCreateProxyFactory;
    }
    @Override
    public final void unableToCreateSchema(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToCreateSchema$str());
    }
    private static final String unableToCreateSchema = "HHH000306: Error creating schema ";
    protected String unableToCreateSchema$str() {
        return unableToCreateSchema;
    }
    @Override
    public final void unableToDeserializeCache(final String path, final SerializationException error) {
        super.log.logf(FQCN, WARN, null, unableToDeserializeCache$str(), path, error);
    }
    private static final String unableToDeserializeCache = "HHH000307: Could not deserialize cache file: %s : %s";
    protected String unableToDeserializeCache$str() {
        return unableToDeserializeCache;
    }
    @Override
    public final void unableToDestroyCache(final String message) {
        super.log.logf(FQCN, WARN, null, unableToDestroyCache$str(), message);
    }
    private static final String unableToDestroyCache = "HHH000308: Unable to destroy cache: %s";
    protected String unableToDestroyCache$str() {
        return unableToDestroyCache;
    }
    @Override
    public final void unableToDestroyQueryCache(final String region, final String message) {
        super.log.logf(FQCN, WARN, null, unableToDestroyQueryCache$str(), region, message);
    }
    private static final String unableToDestroyQueryCache = "HHH000309: Unable to destroy query cache: %s: %s";
    protected String unableToDestroyQueryCache$str() {
        return unableToDestroyQueryCache;
    }
    @Override
    public final void unableToDestroyUpdateTimestampsCache(final String region, final String message) {
        super.log.logf(FQCN, WARN, null, unableToDestroyUpdateTimestampsCache$str(), region, message);
    }
    private static final String unableToDestroyUpdateTimestampsCache = "HHH000310: Unable to destroy update timestamps cache: %s: %s";
    protected String unableToDestroyUpdateTimestampsCache$str() {
        return unableToDestroyUpdateTimestampsCache;
    }
    @Override
    public final void unableToDetermineLockModeValue(final String hintName, final Object value) {
        super.log.logf(FQCN, INFO, null, unableToDetermineLockModeValue$str(), hintName, value);
    }
    private static final String unableToDetermineLockModeValue = "HHH000311: Unable to determine lock mode value : %s -> %s";
    protected String unableToDetermineLockModeValue$str() {
        return unableToDetermineLockModeValue;
    }
    private static final String unableToDetermineTransactionStatus = "HHH000312: Could not determine transaction status";
    protected String unableToDetermineTransactionStatus$str() {
        return unableToDetermineTransactionStatus;
    }
    @Override
    public final String unableToDetermineTransactionStatus() {
        return String.format(getLoggingLocale(), unableToDetermineTransactionStatus$str());
    }
    private static final String unableToDetermineTransactionStatusAfterCommit = "HHH000313: Could not determine transaction status after commit";
    protected String unableToDetermineTransactionStatusAfterCommit$str() {
        return unableToDetermineTransactionStatusAfterCommit;
    }
    @Override
    public final String unableToDetermineTransactionStatusAfterCommit() {
        return String.format(getLoggingLocale(), unableToDetermineTransactionStatusAfterCommit$str());
    }
    @Override
    public final void unableToDropTemporaryIdTable(final String message) {
        super.log.logf(FQCN, WARN, null, unableToDropTemporaryIdTable$str(), message);
    }
    private static final String unableToDropTemporaryIdTable = "HHH000314: Unable to evictData temporary id table after use [%s]";
    protected String unableToDropTemporaryIdTable$str() {
        return unableToDropTemporaryIdTable;
    }
    @Override
    public final void unableToExecuteBatch(final Exception e, final String sql) {
        super.log.logf(FQCN, ERROR, null, unableToExecuteBatch$str(), e, sql);
    }
    private static final String unableToExecuteBatch = "HHH000315: Exception executing batch [%s], SQL: %s";
    protected String unableToExecuteBatch$str() {
        return unableToExecuteBatch;
    }
    @Override
    public final void unableToExecuteResolver(final DialectResolver abstractDialectResolver, final String message) {
        super.log.logf(FQCN, WARN, null, unableToExecuteResolver$str(), abstractDialectResolver, message);
    }
    private static final String unableToExecuteResolver = "HHH000316: Error executing resolver [%s] : %s";
    protected String unableToExecuteResolver$str() {
        return unableToExecuteResolver;
    }
    @Override
    public final void unableToFindPersistenceXmlInClasspath() {
        super.log.logf(FQCN, INFO, null, unableToFindPersistenceXmlInClasspath$str());
    }
    private static final String unableToFindPersistenceXmlInClasspath = "HHH000318: Could not find any META-INF/persistence.xml file in the classpath";
    protected String unableToFindPersistenceXmlInClasspath$str() {
        return unableToFindPersistenceXmlInClasspath;
    }
    @Override
    public final void unableToGetDatabaseMetadata(final SQLException e) {
        super.log.logf(FQCN, ERROR, e, unableToGetDatabaseMetadata$str());
    }
    private static final String unableToGetDatabaseMetadata = "HHH000319: Could not get database metadata";
    protected String unableToGetDatabaseMetadata$str() {
        return unableToGetDatabaseMetadata;
    }
    @Override
    public final void unableToInstantiateConfiguredSchemaNameResolver(final String resolverClassName, final String message) {
        super.log.logf(FQCN, WARN, null, unableToInstantiateConfiguredSchemaNameResolver$str(), resolverClassName, message);
    }
    private static final String unableToInstantiateConfiguredSchemaNameResolver = "HHH000320: Unable to instantiate configured schema name resolver [%s] %s";
    protected String unableToInstantiateConfiguredSchemaNameResolver$str() {
        return unableToInstantiateConfiguredSchemaNameResolver;
    }
    @Override
    public final void unableToLocateCustomOptimizerClass(final String type) {
        super.log.logf(FQCN, WARN, null, unableToLocateCustomOptimizerClass$str(), type);
    }
    private static final String unableToLocateCustomOptimizerClass = "HHH000321: Unable to interpret specified optimizer [%s], falling back to noop";
    protected String unableToLocateCustomOptimizerClass$str() {
        return unableToLocateCustomOptimizerClass;
    }
    @Override
    public final void unableToInstantiateOptimizer(final String type) {
        super.log.logf(FQCN, WARN, null, unableToInstantiateOptimizer$str(), type);
    }
    private static final String unableToInstantiateOptimizer = "HHH000322: Unable to instantiate specified optimizer [%s], falling back to noop";
    protected String unableToInstantiateOptimizer$str() {
        return unableToInstantiateOptimizer;
    }
    @Override
    public final void unableToInstantiateUuidGenerationStrategy(final Exception ignore) {
        super.log.logf(FQCN, WARN, null, unableToInstantiateUuidGenerationStrategy$str(), ignore);
    }
    private static final String unableToInstantiateUuidGenerationStrategy = "HHH000325: Unable to instantiate UUID generation strategy class : %s";
    protected String unableToInstantiateUuidGenerationStrategy$str() {
        return unableToInstantiateUuidGenerationStrategy;
    }
    @Override
    public final void unableToJoinTransaction(final String transactionStrategy) {
        super.log.logf(FQCN, WARN, null, unableToJoinTransaction$str(), transactionStrategy);
    }
    private static final String unableToJoinTransaction = "HHH000326: Cannot join transaction: do not override %s";
    protected String unableToJoinTransaction$str() {
        return unableToJoinTransaction;
    }
    @Override
    public final void unableToLoadCommand(final HibernateException e) {
        super.log.logf(FQCN, INFO, e, unableToLoadCommand$str());
    }
    private static final String unableToLoadCommand = "HHH000327: Error performing load command";
    protected String unableToLoadCommand$str() {
        return unableToLoadCommand;
    }
    @Override
    public final void unableToLoadDerbyDriver(final String message) {
        super.log.logf(FQCN, WARN, null, unableToLoadDerbyDriver$str(), message);
    }
    private static final String unableToLoadDerbyDriver = "HHH000328: Unable to load/access derby driver class sysinfo to check versions : %s";
    protected String unableToLoadDerbyDriver$str() {
        return unableToLoadDerbyDriver;
    }
    @Override
    public final void unableToLoadProperties() {
        super.log.logf(FQCN, ERROR, null, unableToLoadProperties$str());
    }
    private static final String unableToLoadProperties = "HHH000329: Problem loading properties from hibernate.properties";
    protected String unableToLoadProperties$str() {
        return unableToLoadProperties;
    }
    private static final String unableToLocateConfigFile = "HHH000330: Unable to locate config file: %s";
    protected String unableToLocateConfigFile$str() {
        return unableToLocateConfigFile;
    }
    @Override
    public final String unableToLocateConfigFile(final String path) {
        return String.format(getLoggingLocale(), unableToLocateConfigFile$str(), path);
    }
    @Override
    public final void unableToLocateConfiguredSchemaNameResolver(final String resolverClassName, final String message) {
        super.log.logf(FQCN, WARN, null, unableToLocateConfiguredSchemaNameResolver$str(), resolverClassName, message);
    }
    private static final String unableToLocateConfiguredSchemaNameResolver = "HHH000331: Unable to locate configured schema name resolver class [%s] %s";
    protected String unableToLocateConfiguredSchemaNameResolver$str() {
        return unableToLocateConfiguredSchemaNameResolver;
    }
    @Override
    public final void unableToLocateMBeanServer() {
        super.log.logf(FQCN, WARN, null, unableToLocateMBeanServer$str());
    }
    private static final String unableToLocateMBeanServer = "HHH000332: Unable to locate MBeanServer on JMX service shutdown";
    protected String unableToLocateMBeanServer$str() {
        return unableToLocateMBeanServer;
    }
    @Override
    public final void unableToLocateUuidGenerationStrategy(final String strategyClassName) {
        super.log.logf(FQCN, WARN, null, unableToLocateUuidGenerationStrategy$str(), strategyClassName);
    }
    private static final String unableToLocateUuidGenerationStrategy = "HHH000334: Unable to locate requested UUID generation strategy class : %s";
    protected String unableToLocateUuidGenerationStrategy$str() {
        return unableToLocateUuidGenerationStrategy;
    }
    @Override
    public final void unableToLogSqlWarnings(final SQLException sqle) {
        super.log.logf(FQCN, WARN, null, unableToLogSqlWarnings$str(), sqle);
    }
    private static final String unableToLogSqlWarnings = "HHH000335: Unable to log SQLWarnings : %s";
    protected String unableToLogSqlWarnings$str() {
        return unableToLogSqlWarnings;
    }
    @Override
    public final void unableToLogWarnings(final SQLException e) {
        super.log.logf(FQCN, WARN, e, unableToLogWarnings$str());
    }
    private static final String unableToLogWarnings = "HHH000336: Could not log warnings";
    protected String unableToLogWarnings$str() {
        return unableToLogWarnings;
    }
    @Override
    public final void unableToMarkForRollbackOnPersistenceException(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToMarkForRollbackOnPersistenceException$str());
    }
    private static final String unableToMarkForRollbackOnPersistenceException = "HHH000337: Unable to mark for rollback on PersistenceException: ";
    protected String unableToMarkForRollbackOnPersistenceException$str() {
        return unableToMarkForRollbackOnPersistenceException;
    }
    @Override
    public final void unableToMarkForRollbackOnTransientObjectException(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToMarkForRollbackOnTransientObjectException$str());
    }
    private static final String unableToMarkForRollbackOnTransientObjectException = "HHH000338: Unable to mark for rollback on TransientObjectException: ";
    protected String unableToMarkForRollbackOnTransientObjectException$str() {
        return unableToMarkForRollbackOnTransientObjectException;
    }
    @Override
    public final void unableToObtainConnectionMetadata(final SQLException error) {
        super.log.logf(FQCN, WARN, null, unableToObtainConnectionMetadata$str(), error);
    }
    private static final String unableToObtainConnectionMetadata = "HHH000339: Could not obtain connection metadata: %s";
    protected String unableToObtainConnectionMetadata$str() {
        return unableToObtainConnectionMetadata;
    }
    @Override
    public final void unableToObtainConnectionToQueryMetadata(final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToObtainConnectionToQueryMetadata$str());
    }
    private static final String unableToObtainConnectionToQueryMetadata = "HHH000342: Could not obtain connection to query metadata";
    protected String unableToObtainConnectionToQueryMetadata$str() {
        return unableToObtainConnectionToQueryMetadata;
    }
    @Override
    public final void unableToObtainInitialContext(final NamingException e) {
        super.log.logf(FQCN, ERROR, e, unableToObtainInitialContext$str());
    }
    private static final String unableToObtainInitialContext = "HHH000343: Could not obtain initial context";
    protected String unableToObtainInitialContext$str() {
        return unableToObtainInitialContext;
    }
    @Override
    public final void unableToParseMetadata(final String packageName) {
        super.log.logf(FQCN, ERROR, null, unableToParseMetadata$str(), packageName);
    }
    private static final String unableToParseMetadata = "HHH000344: Could not parse the package-level metadata [%s]";
    protected String unableToParseMetadata$str() {
        return unableToParseMetadata;
    }
    private static final String unableToPerformJdbcCommit = "HHH000345: JDBC commit failed";
    protected String unableToPerformJdbcCommit$str() {
        return unableToPerformJdbcCommit;
    }
    @Override
    public final String unableToPerformJdbcCommit() {
        return String.format(getLoggingLocale(), unableToPerformJdbcCommit$str());
    }
    @Override
    public final void unableToPerformManagedFlush(final String message) {
        super.log.logf(FQCN, ERROR, null, unableToPerformManagedFlush$str(), message);
    }
    private static final String unableToPerformManagedFlush = "HHH000346: Error during managed flush [%s]";
    protected String unableToPerformManagedFlush$str() {
        return unableToPerformManagedFlush;
    }
    private static final String unableToQueryDatabaseMetadata = "HHH000347: Unable to query java.sql.DatabaseMetaData";
    protected String unableToQueryDatabaseMetadata$str() {
        return unableToQueryDatabaseMetadata;
    }
    @Override
    public final String unableToQueryDatabaseMetadata() {
        return String.format(getLoggingLocale(), unableToQueryDatabaseMetadata$str());
    }
    @Override
    public final void unableToReadClass(final String message) {
        super.log.logf(FQCN, ERROR, null, unableToReadClass$str(), message);
    }
    private static final String unableToReadClass = "HHH000348: Unable to read class: %s";
    protected String unableToReadClass$str() {
        return unableToReadClass;
    }
    @Override
    public final void unableToReadColumnValueFromResultSet(final String name, final String message) {
        super.log.logf(FQCN, INFO, null, unableToReadColumnValueFromResultSet$str(), name, message);
    }
    private static final String unableToReadColumnValueFromResultSet = "HHH000349: Could not read column value from result set: %s; %s";
    protected String unableToReadColumnValueFromResultSet$str() {
        return unableToReadColumnValueFromResultSet;
    }
    private static final String unableToReadHiValue = "HHH000350: Could not read a hi value - you need to populate the table: %s";
    protected String unableToReadHiValue$str() {
        return unableToReadHiValue;
    }
    @Override
    public final String unableToReadHiValue(final String tableName) {
        return String.format(getLoggingLocale(), unableToReadHiValue$str(), tableName);
    }
    @Override
    public final void unableToReadOrInitHiValue(final SQLException e) {
        super.log.logf(FQCN, ERROR, e, unableToReadOrInitHiValue$str());
    }
    private static final String unableToReadOrInitHiValue = "HHH000351: Could not read or init a hi value";
    protected String unableToReadOrInitHiValue$str() {
        return unableToReadOrInitHiValue;
    }
    @Override
    public final void unableToReleaseBatchStatement() {
        super.log.logf(FQCN, ERROR, null, unableToReleaseBatchStatement$str());
    }
    private static final String unableToReleaseBatchStatement = "HHH000352: Unable to release batch statement...";
    protected String unableToReleaseBatchStatement$str() {
        return unableToReleaseBatchStatement;
    }
    @Override
    public final void unableToReleaseCacheLock(final CacheException ce) {
        super.log.logf(FQCN, ERROR, null, unableToReleaseCacheLock$str(), ce);
    }
    private static final String unableToReleaseCacheLock = "HHH000353: Could not release a cache lock : %s";
    protected String unableToReleaseCacheLock$str() {
        return unableToReleaseCacheLock;
    }
    @Override
    public final void unableToReleaseContext(final String message) {
        super.log.logf(FQCN, INFO, null, unableToReleaseContext$str(), message);
    }
    private static final String unableToReleaseContext = "HHH000354: Unable to release initial context: %s";
    protected String unableToReleaseContext$str() {
        return unableToReleaseContext;
    }
    @Override
    public final void unableToReleaseCreatedMBeanServer(final String string) {
        super.log.logf(FQCN, WARN, null, unableToReleaseCreatedMBeanServer$str(), string);
    }
    private static final String unableToReleaseCreatedMBeanServer = "HHH000355: Unable to release created MBeanServer : %s";
    protected String unableToReleaseCreatedMBeanServer$str() {
        return unableToReleaseCreatedMBeanServer;
    }
    @Override
    public final void unableToReleaseIsolatedConnection(final Throwable ignore) {
        super.log.logf(FQCN, INFO, null, unableToReleaseIsolatedConnection$str(), ignore);
    }
    private static final String unableToReleaseIsolatedConnection = "HHH000356: Unable to release isolated connection [%s]";
    protected String unableToReleaseIsolatedConnection$str() {
        return unableToReleaseIsolatedConnection;
    }
    @Override
    public final void unableToReleaseTypeInfoResultSet() {
        super.log.logf(FQCN, WARN, null, unableToReleaseTypeInfoResultSet$str());
    }
    private static final String unableToReleaseTypeInfoResultSet = "HHH000357: Unable to release type info result set";
    protected String unableToReleaseTypeInfoResultSet$str() {
        return unableToReleaseTypeInfoResultSet;
    }
    @Override
    public final void unableToRemoveBagJoinFetch() {
        super.log.logf(FQCN, WARN, null, unableToRemoveBagJoinFetch$str());
    }
    private static final String unableToRemoveBagJoinFetch = "HHH000358: Unable to erase previously added bag join fetch";
    protected String unableToRemoveBagJoinFetch$str() {
        return unableToRemoveBagJoinFetch;
    }
    @Override
    public final void unableToResolveAggregateFunction(final String name) {
        super.log.logf(FQCN, INFO, null, unableToResolveAggregateFunction$str(), name);
    }
    private static final String unableToResolveAggregateFunction = "HHH000359: Could not resolve aggregate function [%s]; using standard definition";
    protected String unableToResolveAggregateFunction$str() {
        return unableToResolveAggregateFunction;
    }
    @Override
    public final void unableToResolveMappingFile(final String xmlFile) {
        super.log.logf(FQCN, INFO, null, unableToResolveMappingFile$str(), xmlFile);
    }
    private static final String unableToResolveMappingFile = "HHH000360: Unable to resolve mapping file [%s]";
    protected String unableToResolveMappingFile$str() {
        return unableToResolveMappingFile;
    }
    @Override
    public final void unableToRetrieveCache(final String namespace, final String message) {
        super.log.logf(FQCN, INFO, null, unableToRetrieveCache$str(), namespace, message);
    }
    private static final String unableToRetrieveCache = "HHH000361: Unable to retrieve cache from JNDI [%s]: %s";
    protected String unableToRetrieveCache$str() {
        return unableToRetrieveCache;
    }
    @Override
    public final void unableToRetrieveTypeInfoResultSet(final String string) {
        super.log.logf(FQCN, WARN, null, unableToRetrieveTypeInfoResultSet$str(), string);
    }
    private static final String unableToRetrieveTypeInfoResultSet = "HHH000362: Unable to retrieve type info result set : %s";
    protected String unableToRetrieveTypeInfoResultSet$str() {
        return unableToRetrieveTypeInfoResultSet;
    }
    @Override
    public final void unableToRollbackConnection(final Exception ignore) {
        super.log.logf(FQCN, INFO, null, unableToRollbackConnection$str(), ignore);
    }
    private static final String unableToRollbackConnection = "HHH000363: Unable to rollback connection on exception [%s]";
    protected String unableToRollbackConnection$str() {
        return unableToRollbackConnection;
    }
    @Override
    public final void unableToRollbackIsolatedTransaction(final Exception e, final Exception ignore) {
        super.log.logf(FQCN, INFO, null, unableToRollbackIsolatedTransaction$str(), e, ignore);
    }
    private static final String unableToRollbackIsolatedTransaction = "HHH000364: Unable to rollback isolated transaction on error [%s] : [%s]";
    protected String unableToRollbackIsolatedTransaction$str() {
        return unableToRollbackIsolatedTransaction;
    }
    private static final String unableToRollbackJta = "HHH000365: JTA rollback failed";
    protected String unableToRollbackJta$str() {
        return unableToRollbackJta;
    }
    @Override
    public final String unableToRollbackJta() {
        return String.format(getLoggingLocale(), unableToRollbackJta$str());
    }
    @Override
    public final void unableToRunSchemaUpdate(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToRunSchemaUpdate$str());
    }
    private static final String unableToRunSchemaUpdate = "HHH000366: Error running schema update";
    protected String unableToRunSchemaUpdate$str() {
        return unableToRunSchemaUpdate;
    }
    @Override
    public final void unableToSetTransactionToRollbackOnly(final SystemException e) {
        super.log.logf(FQCN, ERROR, e, unableToSetTransactionToRollbackOnly$str());
    }
    private static final String unableToSetTransactionToRollbackOnly = "HHH000367: Could not set transaction to rollback only";
    protected String unableToSetTransactionToRollbackOnly$str() {
        return unableToSetTransactionToRollbackOnly;
    }
    @Override
    public final void unableToStopHibernateService(final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToStopHibernateService$str());
    }
    private static final String unableToStopHibernateService = "HHH000368: Exception while stopping service";
    protected String unableToStopHibernateService$str() {
        return unableToStopHibernateService;
    }
    @Override
    public final void unableToStopService(final Class class1, final Exception e) {
        super.log.logf(FQCN, INFO, e, unableToStopService$str(), class1);
    }
    private static final String unableToStopService = "HHH000369: Error stopping service [%s]";
    protected String unableToStopService$str() {
        return unableToStopService;
    }
    @Override
    public final void unableToSwitchToMethodUsingColumnIndex(final Method method) {
        super.log.logf(FQCN, WARN, null, unableToSwitchToMethodUsingColumnIndex$str(), method);
    }
    private static final String unableToSwitchToMethodUsingColumnIndex = "HHH000370: Exception switching from method: [%s] to a method using the column index. Reverting to using: [%<s]";
    protected String unableToSwitchToMethodUsingColumnIndex$str() {
        return unableToSwitchToMethodUsingColumnIndex;
    }
    @Override
    public final void unableToSynchronizeDatabaseStateWithSession(final HibernateException he) {
        super.log.logf(FQCN, ERROR, null, unableToSynchronizeDatabaseStateWithSession$str(), he);
    }
    private static final String unableToSynchronizeDatabaseStateWithSession = "HHH000371: Could not synchronize database state with session: %s";
    protected String unableToSynchronizeDatabaseStateWithSession$str() {
        return unableToSynchronizeDatabaseStateWithSession;
    }
    @Override
    public final void unableToToggleAutoCommit(final Exception e) {
        super.log.logf(FQCN, ERROR, e, unableToToggleAutoCommit$str());
    }
    private static final String unableToToggleAutoCommit = "HHH000372: Could not toggle autocommit";
    protected String unableToToggleAutoCommit$str() {
        return unableToToggleAutoCommit;
    }
    @Override
    public final void unableToTransformClass(final String message) {
        super.log.logf(FQCN, ERROR, null, unableToTransformClass$str(), message);
    }
    private static final String unableToTransformClass = "HHH000373: Unable to transform class: %s";
    protected String unableToTransformClass$str() {
        return unableToTransformClass;
    }
    @Override
    public final void unableToUnbindFactoryFromJndi(final JndiException e) {
        super.log.logf(FQCN, WARN, e, unableToUnbindFactoryFromJndi$str());
    }
    private static final String unableToUnbindFactoryFromJndi = "HHH000374: Could not unbind factory from JNDI";
    protected String unableToUnbindFactoryFromJndi$str() {
        return unableToUnbindFactoryFromJndi;
    }
    private static final String unableToUpdateHiValue = "HHH000375: Could not update hi value in: %s";
    protected String unableToUpdateHiValue$str() {
        return unableToUpdateHiValue;
    }
    @Override
    public final String unableToUpdateHiValue(final String tableName) {
        return String.format(getLoggingLocale(), unableToUpdateHiValue$str(), tableName);
    }
    @Override
    public final void unableToUpdateQueryHiValue(final String tableName, final SQLException e) {
        super.log.logf(FQCN, ERROR, e, unableToUpdateQueryHiValue$str(), tableName);
    }
    private static final String unableToUpdateQueryHiValue = "HHH000376: Could not updateQuery hi value in: %s";
    protected String unableToUpdateQueryHiValue$str() {
        return unableToUpdateQueryHiValue;
    }
    @Override
    public final void unableToWrapResultSet(final SQLException e) {
        super.log.logf(FQCN, INFO, e, unableToWrapResultSet$str());
    }
    private static final String unableToWrapResultSet = "HHH000377: Error wrapping result set";
    protected String unableToWrapResultSet$str() {
        return unableToWrapResultSet;
    }
    @Override
    public final void unableToWriteCachedFile(final String path, final String message) {
        super.log.logf(FQCN, WARN, null, unableToWriteCachedFile$str(), path, message);
    }
    private static final String unableToWriteCachedFile = "HHH000378: I/O reported error writing cached file : %s: %s";
    protected String unableToWriteCachedFile$str() {
        return unableToWriteCachedFile;
    }
    @Override
    public final void unexpectedLiteralTokenType(final int type) {
        super.log.logf(FQCN, WARN, null, unexpectedLiteralTokenType$str(), type);
    }
    private static final String unexpectedLiteralTokenType = "HHH000380: Unexpected literal token type [%s] passed for numeric processing";
    protected String unexpectedLiteralTokenType$str() {
        return unexpectedLiteralTokenType;
    }
    @Override
    public final void unexpectedRowCounts() {
        super.log.logf(FQCN, WARN, null, unexpectedRowCounts$str());
    }
    private static final String unexpectedRowCounts = "HHH000381: JDBC driver did not return the expected number of row counts";
    protected String unexpectedRowCounts$str() {
        return unexpectedRowCounts;
    }
    @Override
    public final void unknownBytecodeProvider(final String providerName, final String defaultProvider) {
        super.log.logf(FQCN, WARN, null, unknownBytecodeProvider$str(), providerName, defaultProvider);
    }
    private static final String unknownBytecodeProvider = "HHH000382: unrecognized bytecode provider [%s], using [%s] by default";
    protected String unknownBytecodeProvider$str() {
        return unknownBytecodeProvider;
    }
    @Override
    public final void unknownIngresVersion(final int databaseMajorVersion) {
        super.log.logf(FQCN, WARN, null, unknownIngresVersion$str(), databaseMajorVersion);
    }
    private static final String unknownIngresVersion = "HHH000383: Unknown Ingres major version [%s]; using Ingres 9.2 dialect";
    protected String unknownIngresVersion$str() {
        return unknownIngresVersion;
    }
    @Override
    public final void unknownOracleVersion(final int databaseMajorVersion) {
        super.log.logf(FQCN, WARN, null, unknownOracleVersion$str(), databaseMajorVersion);
    }
    private static final String unknownOracleVersion = "HHH000384: Unknown Oracle major version [%s]";
    protected String unknownOracleVersion$str() {
        return unknownOracleVersion;
    }
    @Override
    public final void unknownSqlServerVersion(final int databaseMajorVersion, final Class<? extends Dialect> dialectClass) {
        super.log.logf(FQCN, WARN, null, unknownSqlServerVersion$str(), databaseMajorVersion, dialectClass);
    }
    private static final String unknownSqlServerVersion = "HHH000385: Unknown Microsoft SQL Server major version [%s] using [%s] dialect";
    protected String unknownSqlServerVersion$str() {
        return unknownSqlServerVersion;
    }
    @Override
    public final void unregisteredResultSetWithoutStatement() {
        super.log.logf(FQCN, WARN, null, unregisteredResultSetWithoutStatement$str());
    }
    private static final String unregisteredResultSetWithoutStatement = "HHH000386: ResultSet had no statement associated with it, but was not yet registered";
    protected String unregisteredResultSetWithoutStatement$str() {
        return unregisteredResultSetWithoutStatement;
    }
    @Override
    public final void unregisteredStatement() {
        super.log.logf(FQCN, DEBUG, null, unregisteredStatement$str());
    }
    private static final String unregisteredStatement = "HHH000387: ResultSet's statement was not registered";
    protected String unregisteredStatement$str() {
        return unregisteredStatement;
    }
    @Override
    public final void unsuccessful(final String sql) {
        super.log.logf(FQCN, ERROR, null, unsuccessful$str(), sql);
    }
    private static final String unsuccessful = "HHH000388: Unsuccessful: %s";
    protected String unsuccessful$str() {
        return unsuccessful;
    }
    @Override
    public final void unsuccessfulCreate(final String string) {
        super.log.logf(FQCN, ERROR, null, unsuccessfulCreate$str(), string);
    }
    private static final String unsuccessfulCreate = "HHH000389: Unsuccessful: %s";
    protected String unsuccessfulCreate$str() {
        return unsuccessfulCreate;
    }
    @Override
    public final void unsupportedAfterStatement() {
        super.log.logf(FQCN, WARN, null, unsupportedAfterStatement$str());
    }
    private static final String unsupportedAfterStatement = "HHH000390: Overriding release mode as connection provider does not support 'after_statement'";
    protected String unsupportedAfterStatement$str() {
        return unsupportedAfterStatement;
    }
    @Override
    public final void unsupportedIngresVersion() {
        super.log.logf(FQCN, WARN, null, unsupportedIngresVersion$str());
    }
    private static final String unsupportedIngresVersion = "HHH000391: Ingres 10 is not yet fully supported; using Ingres 9.3 dialect";
    protected String unsupportedIngresVersion$str() {
        return unsupportedIngresVersion;
    }
    @Override
    public final void unsupportedInitialValue(final String propertyName) {
        super.log.logf(FQCN, WARN, null, unsupportedInitialValue$str(), propertyName);
    }
    private static final String unsupportedInitialValue = "HHH000392: Hibernate does not support SequenceGenerator.initialValue() unless '%s' set";
    protected String unsupportedInitialValue$str() {
        return unsupportedInitialValue;
    }
    @Override
    public final void unsupportedMultiTableBulkHqlJpaql(final int majorVersion, final int minorVersion, final int buildId) {
        super.log.logf(FQCN, WARN, null, unsupportedMultiTableBulkHqlJpaql$str(), majorVersion, minorVersion, buildId);
    }
    private static final String unsupportedMultiTableBulkHqlJpaql = "HHH000393: The %s.%s.%s version of H2 implements temporary table creation such that it commits current transaction; multi-table, bulk hql/jpaql will not work properly";
    protected String unsupportedMultiTableBulkHqlJpaql$str() {
        return unsupportedMultiTableBulkHqlJpaql;
    }
    @Override
    public final void unsupportedOracleVersion() {
        super.log.logf(FQCN, WARN, null, unsupportedOracleVersion$str());
    }
    private static final String unsupportedOracleVersion = "HHH000394: Oracle 11g is not yet fully supported; using Oracle 10g dialect";
    protected String unsupportedOracleVersion$str() {
        return unsupportedOracleVersion;
    }
    @Override
    public final void updatingSchema() {
        super.log.logf(FQCN, INFO, null, updatingSchema$str());
    }
    private static final String updatingSchema = "HHH000396: Updating schema";
    protected String updatingSchema$str() {
        return updatingSchema;
    }
    @Override
    public final void usingDefaultIdGeneratorSegmentValue(final String tableName, final String segmentColumnName, final String defaultToUse) {
        super.log.logf(FQCN, INFO, null, usingDefaultIdGeneratorSegmentValue$str(), tableName, segmentColumnName, defaultToUse);
    }
    private static final String usingDefaultIdGeneratorSegmentValue = "HHH000398: Explicit segment value for id generator [%s.%s] suggested; using default [%s]";
    protected String usingDefaultIdGeneratorSegmentValue$str() {
        return usingDefaultIdGeneratorSegmentValue;
    }
    @Override
    public final void usingDefaultTransactionStrategy() {
        super.log.logf(FQCN, INFO, null, usingDefaultTransactionStrategy$str());
    }
    private static final String usingDefaultTransactionStrategy = "HHH000399: Using default transaction strategy (direct JDBC transactions)";
    protected String usingDefaultTransactionStrategy$str() {
        return usingDefaultTransactionStrategy;
    }
    @Override
    public final void usingDialect(final Dialect dialect) {
        super.log.logf(FQCN, INFO, null, usingDialect$str(), dialect);
    }
    private static final String usingDialect = "HHH000400: Using dialect: %s";
    protected String usingDialect$str() {
        return usingDialect;
    }
    @Override
    public final void usingOldDtd() {
        super.log.logf(FQCN, ERROR, null, usingOldDtd$str());
    }
    private static final String usingOldDtd = "HHH000404: Don't use old DTDs, read the Hibernate 3.x Migration Guide!";
    protected String usingOldDtd$str() {
        return usingOldDtd;
    }
    @Override
    public final void usingReflectionOptimizer() {
        super.log.logf(FQCN, INFO, null, usingReflectionOptimizer$str());
    }
    private static final String usingReflectionOptimizer = "HHH000406: Using bytecode reflection optimizer";
    protected String usingReflectionOptimizer$str() {
        return usingReflectionOptimizer;
    }
    @Override
    public final void usingStreams() {
        super.log.logf(FQCN, INFO, null, usingStreams$str());
    }
    private static final String usingStreams = "HHH000407: Using java.io streams to persist binary types";
    protected String usingStreams$str() {
        return usingStreams;
    }
    @Override
    public final void usingUuidHexGenerator(final String name, final String name2) {
        super.log.logf(FQCN, WARN, null, usingUuidHexGenerator$str(), name, name2);
    }
    private static final String usingUuidHexGenerator = "HHH000409: Using %s which does not generate IETF RFC 4122 compliant UUID values; consider using %s instead";
    protected String usingUuidHexGenerator$str() {
        return usingUuidHexGenerator;
    }
    @Override
    public final void validatorNotFound() {
        super.log.logf(FQCN, INFO, null, validatorNotFound$str());
    }
    private static final String validatorNotFound = "HHH000410: Hibernate Validator not found: ignoring";
    protected String validatorNotFound$str() {
        return validatorNotFound;
    }
    @Override
    public final void version(final String versionString) {
        super.log.logf(FQCN, INFO, null, version$str(), versionString);
    }
    private static final String version = "HHH000412: Hibernate ORM core version %s";
    protected String version$str() {
        return version;
    }
    @Override
    public final void warningsCreatingTempTable(final SQLWarning warning) {
        super.log.logf(FQCN, WARN, null, warningsCreatingTempTable$str(), warning);
    }
    private static final String warningsCreatingTempTable = "HHH000413: Warnings creating temp table : %s";
    protected String warningsCreatingTempTable$str() {
        return warningsCreatingTempTable;
    }
    @Override
    public final void willNotRegisterListeners() {
        super.log.logf(FQCN, INFO, null, willNotRegisterListeners$str());
    }
    private static final String willNotRegisterListeners = "HHH000414: Property hibernate.search.autoregister_listeners is set to false. No attempt will be made to register Hibernate Search event listeners.";
    protected String willNotRegisterListeners$str() {
        return willNotRegisterListeners;
    }
    @Override
    public final void writeLocksNotSupported(final String entityName) {
        super.log.logf(FQCN, WARN, null, writeLocksNotSupported$str(), entityName);
    }
    private static final String writeLocksNotSupported = "HHH000416: Write locks via update not supported for non-versioned entities [%s]";
    protected String writeLocksNotSupported$str() {
        return writeLocksNotSupported;
    }
    @Override
    public final void writingGeneratedSchemaToFile(final String outputFile) {
        super.log.logf(FQCN, INFO, null, writingGeneratedSchemaToFile$str(), outputFile);
    }
    private static final String writingGeneratedSchemaToFile = "HHH000417: Writing generated schema to file: %s";
    protected String writingGeneratedSchemaToFile$str() {
        return writingGeneratedSchemaToFile;
    }
    @Override
    public final void addingOverrideFor(final String name, final String name2) {
        super.log.logf(FQCN, INFO, null, addingOverrideFor$str(), name, name2);
    }
    private static final String addingOverrideFor = "HHH000418: Adding override for %s: %s";
    protected String addingOverrideFor$str() {
        return addingOverrideFor;
    }
    @Override
    public final void resolvedSqlTypeDescriptorForDifferentSqlCode(final String name, final String valueOf, final String name2, final String valueOf2) {
        super.log.logf(FQCN, WARN, null, resolvedSqlTypeDescriptorForDifferentSqlCode$str(), name, valueOf, name2, valueOf2);
    }
    private static final String resolvedSqlTypeDescriptorForDifferentSqlCode = "HHH000419: Resolved SqlTypeDescriptor is for a different SQL code. %s has sqlCode=%s; type override %s has sqlCode=%s";
    protected String resolvedSqlTypeDescriptorForDifferentSqlCode$str() {
        return resolvedSqlTypeDescriptorForDifferentSqlCode;
    }
    @Override
    public final void closingUnreleasedBatch() {
        super.log.logf(FQCN, DEBUG, null, closingUnreleasedBatch$str());
    }
    private static final String closingUnreleasedBatch = "HHH000420: Closing un-released batch";
    protected String closingUnreleasedBatch$str() {
        return closingUnreleasedBatch;
    }
    @Override
    public final void disablingContextualLOBCreation(final String nonContextualLobCreation) {
        super.log.logf(FQCN, DEBUG, null, disablingContextualLOBCreation$str(), nonContextualLobCreation);
    }
    private static final String disablingContextualLOBCreation = "HHH000421: Disabling contextual LOB creation as %s is true";
    protected String disablingContextualLOBCreation$str() {
        return disablingContextualLOBCreation;
    }
    @Override
    public final void disablingContextualLOBCreationSinceConnectionNull() {
        super.log.logf(FQCN, DEBUG, null, disablingContextualLOBCreationSinceConnectionNull$str());
    }
    private static final String disablingContextualLOBCreationSinceConnectionNull = "HHH000422: Disabling contextual LOB creation as connection was null";
    protected String disablingContextualLOBCreationSinceConnectionNull$str() {
        return disablingContextualLOBCreationSinceConnectionNull;
    }
    @Override
    public final void disablingContextualLOBCreationSinceOldJdbcVersion(final int jdbcMajorVersion) {
        super.log.logf(FQCN, DEBUG, null, disablingContextualLOBCreationSinceOldJdbcVersion$str(), jdbcMajorVersion);
    }
    private static final String disablingContextualLOBCreationSinceOldJdbcVersion = "HHH000423: Disabling contextual LOB creation as JDBC driver reported JDBC version [%s] less than 4";
    protected String disablingContextualLOBCreationSinceOldJdbcVersion$str() {
        return disablingContextualLOBCreationSinceOldJdbcVersion;
    }
    @Override
    public final void disablingContextualLOBCreationSinceCreateClobFailed(final Throwable t) {
        super.log.logf(FQCN, DEBUG, null, disablingContextualLOBCreationSinceCreateClobFailed$str(), t);
    }
    private static final String disablingContextualLOBCreationSinceCreateClobFailed = "HHH000424: Disabling contextual LOB creation as createClob() method threw error : %s";
    protected String disablingContextualLOBCreationSinceCreateClobFailed$str() {
        return disablingContextualLOBCreationSinceCreateClobFailed;
    }
    @Override
    public final void unableToCloseSessionButSwallowingError(final HibernateException e) {
        super.log.logf(FQCN, INFO, null, unableToCloseSessionButSwallowingError$str(), e);
    }
    private static final String unableToCloseSessionButSwallowingError = "HHH000425: Could not close session; swallowing exception[%s] as transaction completed";
    protected String unableToCloseSessionButSwallowingError$str() {
        return unableToCloseSessionButSwallowingError;
    }
    @Override
    public final void setManagerLookupClass() {
        super.log.logf(FQCN, WARN, null, setManagerLookupClass$str());
    }
    private static final String setManagerLookupClass = "HHH000426: You should set hibernate.transaction.jta.platform if cache is enabled";
    protected String setManagerLookupClass$str() {
        return setManagerLookupClass;
    }
    @Override
    public final void legacyTransactionManagerStrategy(final String name, final String jtaPlatform) {
        super.log.logf(FQCN, INFO, null, legacyTransactionManagerStrategy$str(), name, jtaPlatform);
    }
    private static final String legacyTransactionManagerStrategy = "HHH000428: Encountered legacy TransactionManagerLookup specified; convert to newer %s contract specified via %s setting";
    protected String legacyTransactionManagerStrategy$str() {
        return legacyTransactionManagerStrategy;
    }
    @Override
    public final void entityIdentifierValueBindingExists(final String name) {
        super.log.logf(FQCN, WARN, null, entityIdentifierValueBindingExists$str(), name);
    }
    private static final String entityIdentifierValueBindingExists = "HHH000429: Setting entity-identifier value binding where one already existed : %s.";
    protected String entityIdentifierValueBindingExists$str() {
        return entityIdentifierValueBindingExists;
    }
    @Override
    public final void deprecatedDerbyDialect() {
        super.log.logf(FQCN, WARN, null, deprecatedDerbyDialect$str());
    }
    private static final String deprecatedDerbyDialect = "HHH000430: The DerbyDialect dialect has been deprecated; use one of the version-specific dialects instead";
    protected String deprecatedDerbyDialect$str() {
        return deprecatedDerbyDialect;
    }
    @Override
    public final void undeterminedH2Version() {
        super.log.logf(FQCN, WARN, null, undeterminedH2Version$str());
    }
    private static final String undeterminedH2Version = "HHH000431: Unable to determine H2 database version, certain features may not work";
    protected String undeterminedH2Version$str() {
        return undeterminedH2Version;
    }
    @Override
    public final void noColumnsSpecifiedForIndex(final String indexName, final String tableName) {
        super.log.logf(FQCN, WARN, null, noColumnsSpecifiedForIndex$str(), indexName, tableName);
    }
    private static final String noColumnsSpecifiedForIndex = "HHH000432: There were not column names specified for index %s on table %s";
    protected String noColumnsSpecifiedForIndex$str() {
        return noColumnsSpecifiedForIndex;
    }
    @Override
    public final void timestampCachePuts(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, INFO, null, timestampCachePuts$str(), updateTimestampsCachePutCount);
    }
    private static final String timestampCachePuts = "HHH000433: update timestamps cache puts: %s";
    protected String timestampCachePuts$str() {
        return timestampCachePuts;
    }
    @Override
    public final void timestampCacheHits(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, INFO, null, timestampCacheHits$str(), updateTimestampsCachePutCount);
    }
    private static final String timestampCacheHits = "HHH000434: update timestamps cache hits: %s";
    protected String timestampCacheHits$str() {
        return timestampCacheHits;
    }
    @Override
    public final void timestampCacheMisses(final long updateTimestampsCachePutCount) {
        super.log.logf(FQCN, INFO, null, timestampCacheMisses$str(), updateTimestampsCachePutCount);
    }
    private static final String timestampCacheMisses = "HHH000435: update timestamps cache misses: %s";
    protected String timestampCacheMisses$str() {
        return timestampCacheMisses;
    }
    @Override
    public final void entityManagerFactoryAlreadyRegistered(final String emfName, final String propertyName) {
        super.log.logf(FQCN, WARN, null, entityManagerFactoryAlreadyRegistered$str(), emfName, propertyName);
    }
    private static final String entityManagerFactoryAlreadyRegistered = "HHH000436: Entity manager factory name (%s) is already registered.  If entity manager will be clustered or passivated, specify a unique value for property '%s'";
    protected String entityManagerFactoryAlreadyRegistered$str() {
        return entityManagerFactoryAlreadyRegistered;
    }
    @Override
    public final void cannotResolveNonNullableTransientDependencies(final String transientEntityString, final Set<String> dependentEntityStrings, final Set<String> nonNullableAssociationPaths) {
        super.log.logf(FQCN, WARN, null, cannotResolveNonNullableTransientDependencies$str(), transientEntityString, dependentEntityStrings, nonNullableAssociationPaths);
    }
    private static final String cannotResolveNonNullableTransientDependencies = "HHH000437: Attempting to save one or more entities that have a non-nullable association with an unsaved transient entity. The unsaved transient entity must be saved in an operation prior to saving these dependent entities.\n\tUnsaved transient entity: (%s)\n\tDependent entities: (%s)\n\tNon-nullable association(s): (%s)";
    protected String cannotResolveNonNullableTransientDependencies$str() {
        return cannotResolveNonNullableTransientDependencies;
    }
    @Override
    public final void naturalIdCachePuts(final long naturalIdCachePutCount) {
        super.log.logf(FQCN, INFO, null, naturalIdCachePuts$str(), naturalIdCachePutCount);
    }
    private static final String naturalIdCachePuts = "HHH000438: NaturalId cache puts: %s";
    protected String naturalIdCachePuts$str() {
        return naturalIdCachePuts;
    }
    @Override
    public final void naturalIdCacheHits(final long naturalIdCacheHitCount) {
        super.log.logf(FQCN, INFO, null, naturalIdCacheHits$str(), naturalIdCacheHitCount);
    }
    private static final String naturalIdCacheHits = "HHH000439: NaturalId cache hits: %s";
    protected String naturalIdCacheHits$str() {
        return naturalIdCacheHits;
    }
    @Override
    public final void naturalIdCacheMisses(final long naturalIdCacheMissCount) {
        super.log.logf(FQCN, INFO, null, naturalIdCacheMisses$str(), naturalIdCacheMissCount);
    }
    private static final String naturalIdCacheMisses = "HHH000440: NaturalId cache misses: %s";
    protected String naturalIdCacheMisses$str() {
        return naturalIdCacheMisses;
    }
    @Override
    public final void naturalIdMaxQueryTime(final long naturalIdQueryExecutionMaxTime) {
        super.log.logf(FQCN, INFO, null, naturalIdMaxQueryTime$str(), naturalIdQueryExecutionMaxTime);
    }
    private static final String naturalIdMaxQueryTime = "HHH000441: Max NaturalId query time: %sms";
    protected String naturalIdMaxQueryTime$str() {
        return naturalIdMaxQueryTime;
    }
    @Override
    public final void naturalIdQueriesExecuted(final long naturalIdQueriesExecutionCount) {
        super.log.logf(FQCN, INFO, null, naturalIdQueriesExecuted$str(), naturalIdQueriesExecutionCount);
    }
    private static final String naturalIdQueriesExecuted = "HHH000442: NaturalId queries executed to database: %s";
    protected String naturalIdQueriesExecuted$str() {
        return naturalIdQueriesExecuted;
    }
    @Override
    public final void tooManyInExpressions(final String dialectName, final int limit, final String paramName, final int size) {
        super.log.logf(FQCN, WARN, null, tooManyInExpressions$str(), dialectName, limit, paramName, size);
    }
    private static final String tooManyInExpressions = "HHH000443: Dialect [%s] limits the number of elements in an IN predicate to %s entries.  However, the given parameter list [%s] contained %s entries, which will likely cause failures to execute the query in the database";
    protected String tooManyInExpressions$str() {
        return tooManyInExpressions;
    }
    @Override
    public final void usingFollowOnLocking() {
        super.log.logf(FQCN, WARN, null, usingFollowOnLocking$str());
    }
    private static final String usingFollowOnLocking = "HHH000444: Encountered request for locking however dialect reports that database prefers locking be done in a separate select (follow-on locking); results will be locked after initial query executes";
    protected String usingFollowOnLocking$str() {
        return usingFollowOnLocking;
    }
    @Override
    public final void aliasSpecificLockingWithFollowOnLocking(final LockMode lockMode) {
        super.log.logf(FQCN, WARN, null, aliasSpecificLockingWithFollowOnLocking$str(), lockMode);
    }
    private static final String aliasSpecificLockingWithFollowOnLocking = "HHH000445: Alias-specific lock modes requested, which is not currently supported with follow-on locking; all acquired locks will be [%s]";
    protected String aliasSpecificLockingWithFollowOnLocking$str() {
        return aliasSpecificLockingWithFollowOnLocking;
    }
    @Override
    public final void embedXmlAttributesNoLongerSupported() {
        super.log.logf(FQCN, WARN, null, embedXmlAttributesNoLongerSupported$str());
    }
    private static final String embedXmlAttributesNoLongerSupported = "HHH000446: embed-xml attributes were intended to be used for DOM4J entity mode. Since that entity mode has been removed, embed-xml attributes are no longer supported and should be removed from mappings.";
    protected String embedXmlAttributesNoLongerSupported$str() {
        return embedXmlAttributesNoLongerSupported;
    }
    @Override
    public final void explicitSkipLockedLockCombo() {
        super.log.logf(FQCN, WARN, null, explicitSkipLockedLockCombo$str());
    }
    private static final String explicitSkipLockedLockCombo = "HHH000447: Explicit use of UPGRADE_SKIPLOCKED in lock() calls is not recommended; use normal UPGRADE locking instead";
    protected String explicitSkipLockedLockCombo$str() {
        return explicitSkipLockedLockCombo;
    }
    @Override
    public final void multipleValidationModes(final String modes) {
        super.log.logf(FQCN, INFO, null, multipleValidationModes$str(), modes);
    }
    private static final String multipleValidationModes = "HHH000448: 'javax.persistence.validation.mode' named multiple values : %s";
    protected String multipleValidationModes$str() {
        return multipleValidationModes;
    }
    @Override
    public final void nonCompliantMapConversion(final String collectionRole) {
        super.log.logf(FQCN, WARN, null, nonCompliantMapConversion$str(), collectionRole);
    }
    private static final String nonCompliantMapConversion = "HHH000449: @Convert annotation applied to Map attribute [%s] did not explicitly specify attributeName using 'key'/'value' as required by spec; attempting to DoTheRightThing";
    protected String nonCompliantMapConversion$str() {
        return nonCompliantMapConversion;
    }
    @Override
    public final void alternateServiceRole(final String requestedRole, final String targetRole) {
        super.log.logf(FQCN, WARN, null, alternateServiceRole$str(), requestedRole, targetRole);
    }
    private static final String alternateServiceRole = "HHH000450: Encountered request for Service by non-primary service role [%s -> %s]; please update usage";
    protected String alternateServiceRole$str() {
        return alternateServiceRole;
    }
    @Override
    public final void rollbackFromBackgroundThread(final int status) {
        super.log.logf(FQCN, WARN, null, rollbackFromBackgroundThread$str(), status);
    }
    private static final String rollbackFromBackgroundThread = "HHH000451: Transaction afterCompletion called by a background thread; delaying afterCompletion processing until the original thread can handle it. [status=%s]";
    protected String rollbackFromBackgroundThread$str() {
        return rollbackFromBackgroundThread;
    }
    @Override
    public final void unableToLoadScannedClassOrResource(final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToLoadScannedClassOrResource$str());
    }
    private static final String unableToLoadScannedClassOrResource = "HHH000452: Exception while loading a class or resource found during scanning";
    protected String unableToLoadScannedClassOrResource$str() {
        return unableToLoadScannedClassOrResource;
    }
    @Override
    public final void unableToDiscoverOsgiService(final String service, final Exception e) {
        super.log.logf(FQCN, WARN, e, unableToDiscoverOsgiService$str(), service);
    }
    private static final String unableToDiscoverOsgiService = "HHH000453: Exception while discovering OSGi service implementations : %s";
    protected String unableToDiscoverOsgiService$str() {
        return unableToDiscoverOsgiService;
    }
    @Override
    public final void deprecatedManyToManyOuterJoin() {
        super.log.logf(FQCN, WARN, null, deprecatedManyToManyOuterJoin$str());
    }
    private static final String deprecatedManyToManyOuterJoin = "HHH000454: The outer-join attribute on <many-to-many> has been deprecated. Instead of outer-join=\"false\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    protected String deprecatedManyToManyOuterJoin$str() {
        return deprecatedManyToManyOuterJoin;
    }
    @Override
    public final void deprecatedManyToManyFetch() {
        super.log.logf(FQCN, WARN, null, deprecatedManyToManyFetch$str());
    }
    private static final String deprecatedManyToManyFetch = "HHH000455: The fetch attribute on <many-to-many> has been deprecated. Instead of fetch=\"select\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    protected String deprecatedManyToManyFetch$str() {
        return deprecatedManyToManyFetch;
    }
    @Override
    public final void unsupportedNamedParameters() {
        super.log.logf(FQCN, WARN, null, unsupportedNamedParameters$str());
    }
    private static final String unsupportedNamedParameters = "HHH000456: Named parameters are used for a callable statement, but database metadata indicates named parameters are not supported.";
    protected String unsupportedNamedParameters$str() {
        return unsupportedNamedParameters;
    }
    @Override
    public final void applyingExplicitDiscriminatorColumnForJoined(final String className, final String overrideSetting) {
        super.log.logf(FQCN, WARN, null, applyingExplicitDiscriminatorColumnForJoined$str(), className, overrideSetting);
    }
    private static final String applyingExplicitDiscriminatorColumnForJoined = "HHH000457: Joined inheritance hierarchy [%1$s] defined explicit @DiscriminatorColumn.  Legacy Hibernate behavior was to ignore the @DiscriminatorColumn.  However, as part of issue HHH-6911 we now apply the explicit @DiscriminatorColumn.  If you would prefer the legacy behavior, enable the `%2$s` setting (%2$s=true)";
    protected String applyingExplicitDiscriminatorColumnForJoined$str() {
        return applyingExplicitDiscriminatorColumnForJoined;
    }
    @Override
    public final void creatingPooledLoOptimizer(final int incrementSize, final String name) {
        super.log.logf(FQCN, DEBUG, null, creatingPooledLoOptimizer$str(), incrementSize, name);
    }
    private static final String creatingPooledLoOptimizer = "HHH000467: Creating pooled optimizer (lo) with [incrementSize=%s; returnClass=%s]";
    protected String creatingPooledLoOptimizer$str() {
        return creatingPooledLoOptimizer;
    }
    @Override
    public final void logBadHbmAttributeConverterType(final String type, final String exceptionMessage) {
        super.log.logf(FQCN, WARN, null, logBadHbmAttributeConverterType$str(), type, exceptionMessage);
    }
    private static final String logBadHbmAttributeConverterType = "HHH000468: Unable to interpret type [%s] as an AttributeConverter due to an exception : %s";
    protected String logBadHbmAttributeConverterType$str() {
        return logBadHbmAttributeConverterType;
    }
    private static final String usingStoppedClassLoaderService = "HHH000469: The ClassLoaderService can not be reused. This instance was stopped already.";
    protected String usingStoppedClassLoaderService$str() {
        return usingStoppedClassLoaderService;
    }
    @Override
    public final HibernateException usingStoppedClassLoaderService() {
        final HibernateException result = new HibernateException(String.format(getLoggingLocale(), usingStoppedClassLoaderService$str()));
        final StackTraceElement[] st = result.getStackTrace();
        result.setStackTrace(Arrays.copyOfRange(st, 1, st.length));
        return result;
    }
    @Override
    public final void logUnexpectedSessionInCollectionNotConnected(final String msg) {
        super.log.logf(FQCN, WARN, null, logUnexpectedSessionInCollectionNotConnected$str(), msg);
    }
    private static final String logUnexpectedSessionInCollectionNotConnected = "HHH000470: An unexpected session is defined for a collection, but the collection is not connected to that session. A persistent collection may only be associated with one session at a time. Overwriting session. %s";
    protected String logUnexpectedSessionInCollectionNotConnected$str() {
        return logUnexpectedSessionInCollectionNotConnected;
    }
    @Override
    public final void logCannotUnsetUnexpectedSessionInCollection(final String msg) {
        super.log.logf(FQCN, WARN, null, logCannotUnsetUnexpectedSessionInCollection$str(), msg);
    }
    private static final String logCannotUnsetUnexpectedSessionInCollection = "HHH000471: Cannot unset session in a collection because an unexpected session is defined. A persistent collection may only be associated with one session at a time. %s";
    protected String logCannotUnsetUnexpectedSessionInCollection$str() {
        return logCannotUnsetUnexpectedSessionInCollection;
    }
    @Override
    public final void hikariProviderClassNotFound() {
        super.log.logf(FQCN, WARN, null, hikariProviderClassNotFound$str());
    }
    private static final String hikariProviderClassNotFound = "HHH000472: Hikari properties were encountered, but the Hikari ConnectionProvider was not found on the classpath; these properties are going to be ignored.";
    protected String hikariProviderClassNotFound$str() {
        return hikariProviderClassNotFound;
    }
    @Override
    public final void cachedFileObsolete(final File cachedFile) {
        super.log.logf(FQCN, INFO, null, cachedFileObsolete$str(), cachedFile);
    }
    private static final String cachedFileObsolete = "HHH000473: Omitting cached file [%s] as the mapping file is newer";
    protected String cachedFileObsolete$str() {
        return cachedFileObsolete;
    }
    private static final String ambiguousPropertyMethods = "HHH000474: Ambiguous persistent property methods detected on %s; mark one as @Transient : [%s] and [%s]";
    protected String ambiguousPropertyMethods$str() {
        return ambiguousPropertyMethods;
    }
    @Override
    public final String ambiguousPropertyMethods(final String entityName, final String oneMethodSig, final String secondMethodSig) {
        return String.format(getLoggingLocale(), ambiguousPropertyMethods$str(), entityName, oneMethodSig, secondMethodSig);
    }
    @Override
    public final void logCannotLocateIndexColumnInformation(final String columnIdentifierText, final String indexIdentifierText) {
        super.log.logf(FQCN, INFO, null, logCannotLocateIndexColumnInformation$str(), columnIdentifierText, indexIdentifierText);
    }
    private static final String logCannotLocateIndexColumnInformation = "HHH000475: Cannot locate column information using identifier [%s]; ignoring index [%s]";
    protected String logCannotLocateIndexColumnInformation$str() {
        return logCannotLocateIndexColumnInformation;
    }
    @Override
    public final void executingImportScript(final String scriptName) {
        super.log.logf(FQCN, INFO, null, executingImportScript$str(), scriptName);
    }
    private static final String executingImportScript = "HHH000476: Executing import script '%s'";
    protected String executingImportScript$str() {
        return executingImportScript;
    }
    @Override
    public final void startingDelayedSchemaDrop() {
        super.log.logf(FQCN, INFO, null, startingDelayedSchemaDrop$str());
    }
    private static final String startingDelayedSchemaDrop = "HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'";
    protected String startingDelayedSchemaDrop$str() {
        return startingDelayedSchemaDrop;
    }
    @Override
    public final void unsuccessfulSchemaManagementCommand(final String command) {
        super.log.logf(FQCN, ERROR, null, unsuccessfulSchemaManagementCommand$str(), command);
    }
    private static final String unsuccessfulSchemaManagementCommand = "HHH000478: Unsuccessful: %s";
    protected String unsuccessfulSchemaManagementCommand$str() {
        return unsuccessfulSchemaManagementCommand;
    }
    private static final String collectionNotProcessedByFlush = "HHH000479: Collection [%s] was not processed by flush(). This is likely due to unsafe use of the session (e.g. used in multiple threads concurrently, updates during entity lifecycle hooks).";
    protected String collectionNotProcessedByFlush$str() {
        return collectionNotProcessedByFlush;
    }
    @Override
    public final String collectionNotProcessedByFlush(final String role) {
        return String.format(getLoggingLocale(), collectionNotProcessedByFlush$str(), role);
    }
    @Override
    public final void stalePersistenceContextInEntityEntry(final String msg) {
        super.log.logf(FQCN, WARN, null, stalePersistenceContextInEntityEntry$str(), msg);
    }
    private static final String stalePersistenceContextInEntityEntry = "HHH000480: A ManagedEntity was associated with a stale PersistenceContext. A ManagedEntity may only be associated with one PersistenceContext at a time; %s";
    protected String stalePersistenceContextInEntityEntry$str() {
        return stalePersistenceContextInEntityEntry;
    }
    @Override
    public final void unknownJavaTypeNoEqualsHashCode(final Class javaType) {
        super.log.logf(FQCN, WARN, null, unknownJavaTypeNoEqualsHashCode$str(), javaType);
    }
    private static final String unknownJavaTypeNoEqualsHashCode = "HHH000481: Encountered Java type [%s] for which we could not locate a JavaTypeDescriptor and which does not appear to implement equals and/or hashCode.  This can lead to significant performance problems when performing equality/dirty checking involving this Java type.  Consider registering a custom JavaTypeDescriptor or at least implementing equals/hashCode.";
    protected String unknownJavaTypeNoEqualsHashCode$str() {
        return unknownJavaTypeNoEqualsHashCode;
    }
    @Override
    public final void cacheOrCacheableAnnotationOnNonRoot(final String className) {
        super.log.logf(FQCN, WARN, null, cacheOrCacheableAnnotationOnNonRoot$str(), className);
    }
    private static final String cacheOrCacheableAnnotationOnNonRoot = "HHH000482: @org.hibernate.annotations.Cache used on a non-root entity: ignored for [%s]. Please see the Hibernate documentation for proper usage.";
    protected String cacheOrCacheableAnnotationOnNonRoot$str() {
        return cacheOrCacheableAnnotationOnNonRoot;
    }
    @Override
    public final void emptyCompositesEnabled() {
        super.log.logf(FQCN, WARN, null, emptyCompositesEnabled$str());
    }
    private static final String emptyCompositesEnabled = "HHH000483: An experimental feature has been enabled (hibernate.create_empty_composites.enabled=true) that instantiates empty composite/embedded objects when all of its attribute values are null. This feature has known issues and should not be used in production until it is stabilized. See Hibernate Jira issue HHH-11936 for details.";
    protected String emptyCompositesEnabled$str() {
        return emptyCompositesEnabled;
    }
    @Override
    public final void viburProviderClassNotFound() {
        super.log.logf(FQCN, WARN, null, viburProviderClassNotFound$str());
    }
    private static final String viburProviderClassNotFound = "HHH000484: Vibur properties were encountered, but the Vibur ConnectionProvider was not found on the classpath; these properties are going to be ignored.";
    protected String viburProviderClassNotFound$str() {
        return viburProviderClassNotFound;
    }
    @Override
    public final void attemptToAssociateProxyWithTwoOpenSessions(final String entityName, final Object id) {
        super.log.logf(FQCN, ERROR, null, attemptToAssociateProxyWithTwoOpenSessions$str(), entityName, id);
    }
    private static final String attemptToAssociateProxyWithTwoOpenSessions = "HHH000485: Illegally attempted to associate a proxy for entity [%s] with id [%s] with two open sessions.";
    protected String attemptToAssociateProxyWithTwoOpenSessions$str() {
        return attemptToAssociateProxyWithTwoOpenSessions;
    }
    @Override
    public final void agroalProviderClassNotFound() {
        super.log.logf(FQCN, WARN, null, agroalProviderClassNotFound$str());
    }
    private static final String agroalProviderClassNotFound = "HHH000486: Agroal properties were encountered, but the Agroal ConnectionProvider was not found on the classpath; these properties are going to be ignored.";
    protected String agroalProviderClassNotFound$str() {
        return agroalProviderClassNotFound;
    }
    @Override
    public final void immutableEntityUpdateQuery(final String sourceQuery, final String querySpaces) {
        super.log.logf(FQCN, WARN, null, immutableEntityUpdateQuery$str(), sourceQuery, querySpaces);
    }
    private static final String immutableEntityUpdateQuery = "HHH000487: The query: [%s] attempts to update an immutable entity: %s";
    protected String immutableEntityUpdateQuery$str() {
        return immutableEntityUpdateQuery;
    }
    private static final String bytecodeEnhancementFailedUnableToGetPrivateLookupFor = "HHH000488: Bytecode enhancement failed for class: %1$s. It might be due to the Java module system preventing Hibernate ORM from defining an enhanced class in the same package as class %1$s. In this case, the class should be opened and exported to Hibernate ORM.";
    protected String bytecodeEnhancementFailedUnableToGetPrivateLookupFor$str() {
        return bytecodeEnhancementFailedUnableToGetPrivateLookupFor;
    }
    @Override
    public final String bytecodeEnhancementFailedUnableToGetPrivateLookupFor(final String className) {
        return String.format(getLoggingLocale(), bytecodeEnhancementFailedUnableToGetPrivateLookupFor$str(), className);
    }
    @Override
    public final void nativeExceptionHandling51ComplianceJpaBootstrapping() {
        super.log.logf(FQCN, WARN, null, nativeExceptionHandling51ComplianceJpaBootstrapping$str());
    }
    private static final String nativeExceptionHandling51ComplianceJpaBootstrapping = "HHH000489: Setting hibernate.native_exception_handling_51_compliance=true is not valid with JPA bootstrapping; setting will be ignored.";
    protected String nativeExceptionHandling51ComplianceJpaBootstrapping$str() {
        return nativeExceptionHandling51ComplianceJpaBootstrapping;
    }
    @Override
    public final void usingJtaPlatform(final String jtaPlatformClassName) {
        super.log.logf(FQCN, INFO, null, usingJtaPlatform$str(), jtaPlatformClassName);
    }
    private static final String usingJtaPlatform = "HHH000490: Using JtaPlatform implementation: [%s]";
    protected String usingJtaPlatform$str() {
        return usingJtaPlatform;
    }
    @Override
    public final void ignoreNotFoundWithFetchTypeLazy(final String entity, final String association) {
        super.log.logf(FQCN, WARN, null, ignoreNotFoundWithFetchTypeLazy$str(), entity, association);
    }
    private static final String ignoreNotFoundWithFetchTypeLazy = "HHH000491: The [%2$s] association in the [%1$s] entity uses both @NotFound(action = NotFoundAction.IGNORE) and FetchType.LAZY. The NotFoundAction.IGNORE @ManyToOne and @OneToOne associations are always fetched eagerly.";
    protected String ignoreNotFoundWithFetchTypeLazy$str() {
        return ignoreNotFoundWithFetchTypeLazy;
    }
    @Override
    public final void queryPlanCacheHits(final long queryPlanCacheHitCount) {
        super.log.logf(FQCN, INFO, null, queryPlanCacheHits$str(), queryPlanCacheHitCount);
    }
    private static final String queryPlanCacheHits = "HHH000492: Query plan cache hits: %s";
    protected String queryPlanCacheHits$str() {
        return queryPlanCacheHits;
    }
    @Override
    public final void queryPlanCacheMisses(final long queryPlanCacheMissCount) {
        super.log.logf(FQCN, INFO, null, queryPlanCacheMisses$str(), queryPlanCacheMissCount);
    }
    private static final String queryPlanCacheMisses = "HHH000493: Query plan cache misses: %s";
    protected String queryPlanCacheMisses$str() {
        return queryPlanCacheMisses;
    }
    @Override
    public final void ignoreQueuedOperationsOnMerge(final String collectionInfoString) {
        super.log.logf(FQCN, WARN, null, ignoreQueuedOperationsOnMerge$str(), collectionInfoString);
    }
    private static final String ignoreQueuedOperationsOnMerge = "HHH000494: Attempt to merge an uninitialized collection with queued operations; queued operations will be ignored: %s";
    protected String ignoreQueuedOperationsOnMerge$str() {
        return ignoreQueuedOperationsOnMerge;
    }
    @Override
    public final void queuedOperationWhenAttachToSession(final String collectionInfoString) {
        super.log.logf(FQCN, WARN, null, queuedOperationWhenAttachToSession$str(), collectionInfoString);
    }
    private static final String queuedOperationWhenAttachToSession = "HHH000495: Attaching an uninitialized collection with queued operations to a session: %s";
    protected String queuedOperationWhenAttachToSession$str() {
        return queuedOperationWhenAttachToSession;
    }
    @Override
    public final void queuedOperationWhenDetachFromSession(final String collectionInfoString) {
        super.log.logf(FQCN, INFO, null, queuedOperationWhenDetachFromSession$str(), collectionInfoString);
    }
    private static final String queuedOperationWhenDetachFromSession = "HHH000496: Detaching an uninitialized collection with queued operations from a session: %s";
    protected String queuedOperationWhenDetachFromSession$str() {
        return queuedOperationWhenDetachFromSession;
    }
    @Override
    public final void sequenceIncrementSizeMismatch(final String sequenceName, final int incrementSize, final int databaseIncrementSize) {
        super.log.logf(FQCN, WARN, null, sequenceIncrementSizeMismatch$str(), sequenceName, incrementSize, databaseIncrementSize);
    }
    private static final String sequenceIncrementSizeMismatch = "HHH000497: The increment size of the [%s] sequence is set to [%d] in the entity mapping while the associated database sequence increment size is [%d]. The database sequence increment size will take precedence to avoid identifier allocation conflicts.";
    protected String sequenceIncrementSizeMismatch$str() {
        return sequenceIncrementSizeMismatch;
    }
    @Override
    public final void queuedOperationWhenDetachFromSessionOnRollback(final String collectionInfoString) {
        super.log.logf(FQCN, DEBUG, null, queuedOperationWhenDetachFromSessionOnRollback$str(), collectionInfoString);
    }
    private static final String queuedOperationWhenDetachFromSessionOnRollback = "HHH000498: Detaching an uninitialized collection with queued operations from a session due to rollback: %s";
    protected String queuedOperationWhenDetachFromSessionOnRollback$str() {
        return queuedOperationWhenDetachFromSessionOnRollback;
    }
    @Override
    public final void unsupportedAttributeOverrideWithEntityInheritance(final String entityName) {
        super.log.logf(FQCN, WARN, null, unsupportedAttributeOverrideWithEntityInheritance$str(), entityName);
    }
    private static final String unsupportedAttributeOverrideWithEntityInheritance = "HHH000499: Using @AttributeOverride or @AttributeOverrides in conjunction with entity inheritance is not supported: %s. The overriding definitions are ignored.";
    protected String unsupportedAttributeOverrideWithEntityInheritance$str() {
        return unsupportedAttributeOverrideWithEntityInheritance;
    }
    @Override
    public final void ignoreImmutablePropertyModification(final String propertyName, final String entityName) {
        super.log.logf(FQCN, WARN, null, ignoreImmutablePropertyModification$str(), propertyName, entityName);
    }
    private static final String ignoreImmutablePropertyModification = "HHH000502: The [%s] property of the [%s] entity was modified, but it won't be updated because the property is immutable.";
    protected String ignoreImmutablePropertyModification$str() {
        return ignoreImmutablePropertyModification;
    }
    @Override
    public final void unsupportedMappedSuperclassWithEntityInheritance(final String entityName) {
        super.log.logf(FQCN, WARN, null, unsupportedMappedSuperclassWithEntityInheritance$str(), entityName);
    }
    private static final String unsupportedMappedSuperclassWithEntityInheritance = "HHH000503: A class should not be annotated with both @Inheritance and @MappedSuperclass. @Inheritance will be ignored for: %s.";
    protected String unsupportedMappedSuperclassWithEntityInheritance$str() {
        return unsupportedMappedSuperclassWithEntityInheritance;
    }
    @Override
    public final void multipleSchemaCreationSettingsDefined() {
        super.log.logf(FQCN, WARN, null, multipleSchemaCreationSettingsDefined$str());
    }
    private static final String multipleSchemaCreationSettingsDefined = "HHH000504: Multiple configuration properties defined to create schema. Choose at most one among 'javax.persistence.create-database-schemas', 'hibernate.hbm2ddl.create_namespaces', 'hibernate.hbm2dll.create_namespaces' (this last being deprecated).";
    protected String multipleSchemaCreationSettingsDefined$str() {
        return multipleSchemaCreationSettingsDefined;
    }
    @Override
    public final void ignoringServiceConfigurationError(final Class<?> serviceContract, final ServiceConfigurationError error) {
        super.log.logf(FQCN, WARN, error, ignoringServiceConfigurationError$str(), serviceContract);
    }
    private static final String ignoringServiceConfigurationError = "HHH000505: Ignoring ServiceConfigurationError caught while trying to instantiate service '%s'.";
    protected String ignoringServiceConfigurationError$str() {
        return ignoringServiceConfigurationError;
    }
    @Override
    public final void enabledFiltersWhenDetachFromSession(final String collectionInfoString) {
        super.log.logf(FQCN, WARN, null, enabledFiltersWhenDetachFromSession$str(), collectionInfoString);
    }
    private static final String enabledFiltersWhenDetachFromSession = "HHH000506: Detaching an uninitialized collection with enabled filters from a session: %s";
    protected String enabledFiltersWhenDetachFromSession$str() {
        return enabledFiltersWhenDetachFromSession;
    }
    @Override
    public final void warnUsingJavassistBytecodeProviderIsDeprecated() {
        super.log.logf(FQCN, WARN, null, warnUsingJavassistBytecodeProviderIsDeprecated$str());
    }
    private static final String warnUsingJavassistBytecodeProviderIsDeprecated = "HHH000507: The Javassist based BytecodeProvider is deprecated. Please switch to using the ByteBuddy based BytecodeProvider, which is the default since Hibernate ORM 5.3. The Javassist one will be removed soon.";
    protected String warnUsingJavassistBytecodeProviderIsDeprecated$str() {
        return warnUsingJavassistBytecodeProviderIsDeprecated;
    }
}
