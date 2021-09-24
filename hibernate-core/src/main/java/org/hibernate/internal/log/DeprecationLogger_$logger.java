package org.hibernate.internal.log;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Class;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:30+0800")
public class DeprecationLogger_$logger extends DelegatingBasicLogger implements DeprecationLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = DeprecationLogger_$logger.class.getName();
    public DeprecationLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void logDeprecatedScannerSetting() {
        super.log.logf(FQCN, INFO, null, logDeprecatedScannerSetting$str());
    }
    private static final String logDeprecatedScannerSetting = "HHH90000001: Found usage of deprecated setting for specifying Scanner [hibernate.ejb.resource_scanner]; use [hibernate.archive.scanner] instead";
    protected String logDeprecatedScannerSetting$str() {
        return logDeprecatedScannerSetting;
    }
    @Override
    public final void logDeprecationOfMultipleEntityModeSupport() {
        super.log.logf(FQCN, WARN, null, logDeprecationOfMultipleEntityModeSupport$str());
    }
    private static final String logDeprecationOfMultipleEntityModeSupport = "HHH90000002: Support for an entity defining multiple entity-modes is deprecated";
    protected String logDeprecationOfMultipleEntityModeSupport$str() {
        return logDeprecationOfMultipleEntityModeSupport;
    }
    @Override
    public final void logDeprecationOfDomEntityModeSupport() {
        super.log.logf(FQCN, WARN, null, logDeprecationOfDomEntityModeSupport$str());
    }
    private static final String logDeprecationOfDomEntityModeSupport = "HHH90000003: Use of DOM4J entity-mode is considered deprecated";
    protected String logDeprecationOfDomEntityModeSupport$str() {
        return logDeprecationOfDomEntityModeSupport;
    }
    @Override
    public final void logDeprecationOfEmbedXmlSupport() {
        super.log.logf(FQCN, WARN, null, logDeprecationOfEmbedXmlSupport$str());
    }
    private static final String logDeprecationOfEmbedXmlSupport = "HHH90000004: embed-xml attributes were intended to be used for DOM4J entity mode. Since that entity mode has been removed, embed-xml attributes are no longer supported and should be removed from mappings.";
    protected String logDeprecationOfEmbedXmlSupport$str() {
        return logDeprecationOfEmbedXmlSupport;
    }
    @Override
    public final void logDeprecationOfNonNamedIdAttribute(final String entityName) {
        super.log.logf(FQCN, WARN, null, logDeprecationOfNonNamedIdAttribute$str(), entityName);
    }
    private static final String logDeprecationOfNonNamedIdAttribute = "HHH90000005: Defining an entity [%s] with no physical id attribute is no longer supported; please map the identifier to a physical entity attribute";
    protected String logDeprecationOfNonNamedIdAttribute$str() {
        return logDeprecationOfNonNamedIdAttribute;
    }
    @Override
    public final void logDeprecatedNamingStrategySetting(final String setting, final String implicitInstead, final String physicalInstead) {
        super.log.logf(FQCN, WARN, null, logDeprecatedNamingStrategySetting$str(), setting, implicitInstead, physicalInstead);
    }
    private static final String logDeprecatedNamingStrategySetting = "HHH90000006: Attempted to specify unsupported NamingStrategy via setting [%s]; NamingStrategy has been removed in favor of the split ImplicitNamingStrategy and PhysicalNamingStrategy; use [%s] or [%s], respectively, instead.";
    protected String logDeprecatedNamingStrategySetting$str() {
        return logDeprecatedNamingStrategySetting;
    }
    @Override
    public final void logDeprecatedNamingStrategyArgument() {
        super.log.logf(FQCN, WARN, null, logDeprecatedNamingStrategyArgument$str());
    }
    private static final String logDeprecatedNamingStrategyArgument = "HHH90000007: Attempted to specify unsupported NamingStrategy via command-line argument [--naming]. NamingStrategy has been removed in favor of the split ImplicitNamingStrategy and PhysicalNamingStrategy; use [--implicit-naming] or [--physical-naming], respectively, instead.";
    protected String logDeprecatedNamingStrategyArgument$str() {
        return logDeprecatedNamingStrategyArgument;
    }
    @Override
    public final void logDeprecatedNamingStrategyAntArgument() {
        super.log.logf(FQCN, WARN, null, logDeprecatedNamingStrategyAntArgument$str());
    }
    private static final String logDeprecatedNamingStrategyAntArgument = "HHH90000008: Attempted to specify unsupported NamingStrategy via Ant task argument. NamingStrategy has been removed in favor of the split ImplicitNamingStrategy and PhysicalNamingStrategy.";
    protected String logDeprecatedNamingStrategyAntArgument$str() {
        return logDeprecatedNamingStrategyAntArgument;
    }
    @Override
    public final void deprecatedManyToManyOuterJoin() {
        super.log.logf(FQCN, WARN, null, deprecatedManyToManyOuterJoin$str());
    }
    private static final String deprecatedManyToManyOuterJoin = "HHH90000009: The outer-join attribute on <many-to-many> has been deprecated. Instead of outer-join=\"false\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    protected String deprecatedManyToManyOuterJoin$str() {
        return deprecatedManyToManyOuterJoin;
    }
    @Override
    public final void deprecatedManyToManyFetch() {
        super.log.logf(FQCN, WARN, null, deprecatedManyToManyFetch$str());
    }
    private static final String deprecatedManyToManyFetch = "HHH90000010: The fetch attribute on <many-to-many> has been deprecated. Instead of fetch=\"select\", use lazy=\"extra\" with <map>, <set>, <bag>, <idbag>, or <list>, which will only initialize entities (not as a proxy) as needed.";
    protected String deprecatedManyToManyFetch$str() {
        return deprecatedManyToManyFetch;
    }
    @Override
    public final void logDeprecationOfTemporaryTableBulkIdStrategy() {
        super.log.logf(FQCN, WARN, null, logDeprecationOfTemporaryTableBulkIdStrategy$str());
    }
    private static final String logDeprecationOfTemporaryTableBulkIdStrategy = "HHH90000011: org.hibernate.hql.spi.TemporaryTableBulkIdStrategy (temporary) has been deprecated in favor of the more specific org.hibernate.hql.spi.id.local.LocalTemporaryTableBulkIdStrategy (local_temporary).";
    protected String logDeprecationOfTemporaryTableBulkIdStrategy$str() {
        return logDeprecationOfTemporaryTableBulkIdStrategy;
    }
    @Override
    public final void recognizedObsoleteHibernateNamespace(final String oldHibernateNamespace, final String hibernateNamespace) {
        super.log.logf(FQCN, WARN, null, recognizedObsoleteHibernateNamespace$str(), oldHibernateNamespace, hibernateNamespace);
    }
    private static final String recognizedObsoleteHibernateNamespace = "HHH90000012: Recognized obsolete hibernate namespace %s. Use namespace %s instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.";
    protected String recognizedObsoleteHibernateNamespace$str() {
        return recognizedObsoleteHibernateNamespace;
    }
    @Override
    public final void connectionProviderClassDeprecated(final String providerClassName, final String actualProviderClassName) {
        super.log.logf(FQCN, WARN, null, connectionProviderClassDeprecated$str(), providerClassName, actualProviderClassName);
    }
    private static final String connectionProviderClassDeprecated = "HHH90000013: Named ConnectionProvider [%s] has been deprecated in favor of %s; that provider will be used instead.  Update your settings";
    protected String connectionProviderClassDeprecated$str() {
        return connectionProviderClassDeprecated;
    }
    @Override
    public final void deprecatedSequenceGenerator(final String generatorImpl) {
        super.log.logf(FQCN, WARN, null, deprecatedSequenceGenerator$str(), generatorImpl);
    }
    private static final String deprecatedSequenceGenerator = "HHH90000014: Found use of deprecated [%s] sequence-based id generator; use org.hibernate.id.enhanced.SequenceStyleGenerator instead.  See Hibernate Domain Model Mapping Guide for details.";
    protected String deprecatedSequenceGenerator$str() {
        return deprecatedSequenceGenerator;
    }
    @Override
    public final void deprecatedTableGenerator(final String generatorImpl) {
        super.log.logf(FQCN, WARN, null, deprecatedTableGenerator$str(), generatorImpl);
    }
    private static final String deprecatedTableGenerator = "HHH90000015: Found use of deprecated [%s] table-based id generator; use org.hibernate.id.enhanced.TableGenerator instead.  See Hibernate Domain Model Mapping Guide for details.";
    protected String deprecatedTableGenerator$str() {
        return deprecatedTableGenerator;
    }
    @Override
    public final void logDeprecationOfCollectionPropertiesInHql(final String collectionPropertyName, final String alias) {
        super.log.logf(FQCN, WARN, null, logDeprecationOfCollectionPropertiesInHql$str(), collectionPropertyName, alias);
    }
    private static final String logDeprecationOfCollectionPropertiesInHql = "HHH90000016: Found use of deprecated 'collection property' syntax in HQL/JPQL query [%2$s.%1$s]; use collection function syntax instead [%1$s(%2$s)].";
    protected String logDeprecationOfCollectionPropertiesInHql$str() {
        return logDeprecationOfCollectionPropertiesInHql;
    }
    @Override
    public final void logDeprecationOfClassEntityTypeSelector(final String path) {
        super.log.logf(FQCN, WARN, null, logDeprecationOfClassEntityTypeSelector$str(), path);
    }
    private static final String logDeprecationOfClassEntityTypeSelector = "HHH90000017: Found use of deprecated entity-type selector syntax in HQL/JPQL query ['%1$s.class']; use TYPE operator instead : type(%1$s)";
    protected String logDeprecationOfClassEntityTypeSelector$str() {
        return logDeprecationOfClassEntityTypeSelector;
    }
    @Override
    public final void logDeprecatedTransactionFactorySetting(final String legacySettingName, final String updatedSettingName) {
        super.log.logf(FQCN, WARN, null, logDeprecatedTransactionFactorySetting$str(), legacySettingName, updatedSettingName);
    }
    private static final String logDeprecatedTransactionFactorySetting = "HHH90000018: Found use of deprecated transaction factory setting [%s]; use the new TransactionCoordinatorBuilder settings [%s] instead";
    protected String logDeprecatedTransactionFactorySetting$str() {
        return logDeprecatedTransactionFactorySetting;
    }
    @Override
    public final void logDeprecatedInstrumentTask(final Class taskClass, final Class newTaskClass) {
        super.log.logf(FQCN, WARN, null, logDeprecatedInstrumentTask$str(), taskClass, newTaskClass);
    }
    private static final String logDeprecatedInstrumentTask = "HHH90000020: You are using the deprecated legacy bytecode enhancement Ant-task.  This task is left in place for a short-time to aid migrations to 5.1 and the new (vastly improved) bytecode enhancement support.  This task (%s) now delegates to thenew Ant-task (%s) leveraging that new bytecode enhancement.  You should update your build to use the new task explicitly.";
    protected String logDeprecatedInstrumentTask$str() {
        return logDeprecatedInstrumentTask;
    }
    @Override
    public final void deprecatedSetting(final String oldSettingName, final String newSettingName) {
        super.log.logf(FQCN, WARN, null, deprecatedSetting$str(), oldSettingName, newSettingName);
    }
    private static final String deprecatedSetting = "HHH90000021: Encountered deprecated setting [%s], use [%s] instead";
    protected String deprecatedSetting$str() {
        return deprecatedSetting;
    }
    @Override
    public final void deprecatedLegacyCriteria() {
        super.log.logf(FQCN, WARN, null, deprecatedLegacyCriteria$str());
    }
    private static final String deprecatedLegacyCriteria = "HHH90000022: Hibernate's legacy org.hibernate.Criteria API is deprecated; use the JPA javax.persistence.criteria.CriteriaQuery instead";
    protected String deprecatedLegacyCriteria$str() {
        return deprecatedLegacyCriteria;
    }
    @Override
    public final void logUseOfDeprecatedConnectionHandlingSettings() {
        super.log.logf(FQCN, WARN, null, logUseOfDeprecatedConnectionHandlingSettings$str());
    }
    private static final String logUseOfDeprecatedConnectionHandlingSettings = "HHH90000023: Encountered use of deprecated Connection handling settings [hibernate.connection.acquisition_mode]or [hibernate.connection.release_mode]; use [hibernate.connection.handling_mode] instead";
    protected String logUseOfDeprecatedConnectionHandlingSettings$str() {
        return logUseOfDeprecatedConnectionHandlingSettings;
    }
    @Override
    public final void logUseOfDeprecatedZeroBasedJdbcStyleParams() {
        super.log.logf(FQCN, WARN, null, logUseOfDeprecatedZeroBasedJdbcStyleParams$str());
    }
    private static final String logUseOfDeprecatedZeroBasedJdbcStyleParams = "HHH90000024: Application requested zero be used as the base for JDBC-style parameters found in native-queries; this is a *temporary* backwards-compatibility setting to help applications  using versions prior to 5.3 in upgrading.  It will be removed in a later version.";
    protected String logUseOfDeprecatedZeroBasedJdbcStyleParams$str() {
        return logUseOfDeprecatedZeroBasedJdbcStyleParams;
    }
    @Override
    public final void deprecatedComponentMapping(final String name) {
        super.log.logf(FQCN, WARN, null, deprecatedComponentMapping$str(), name);
    }
    private static final String deprecatedComponentMapping = "HHH90000025: Encountered multiple component mappings for the same java class [%s] with different property mappings. This is deprecated and will be removed in a future version. Every property mapping combination should have its own java class";
    protected String deprecatedComponentMapping$str() {
        return deprecatedComponentMapping;
    }
}
