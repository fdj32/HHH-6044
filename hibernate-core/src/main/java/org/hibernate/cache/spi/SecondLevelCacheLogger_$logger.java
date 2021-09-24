package org.hibernate.cache.spi;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.hibernate.metamodel.model.domain.NavigableRole;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.Object;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:26+0800")
public class SecondLevelCacheLogger_$logger extends DelegatingBasicLogger implements SecondLevelCacheLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = SecondLevelCacheLogger_$logger.class.getName();
    public SecondLevelCacheLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void attemptToStartAlreadyStartedCacheProvider() {
        super.log.logf(FQCN, WARN, null, attemptToStartAlreadyStartedCacheProvider$str());
    }
    private static final String attemptToStartAlreadyStartedCacheProvider = "HHH90001001: Attempt to restart an already started RegionFactory.  Use sessionFactory.close() between repeated calls to buildSessionFactory. Using previously created RegionFactory.";
    protected String attemptToStartAlreadyStartedCacheProvider$str() {
        return attemptToStartAlreadyStartedCacheProvider;
    }
    @Override
    public final void attemptToStopAlreadyStoppedCacheProvider() {
        super.log.logf(FQCN, WARN, null, attemptToStopAlreadyStoppedCacheProvider$str());
    }
    private static final String attemptToStopAlreadyStoppedCacheProvider = "HHH90001002: Attempt to restop an already stopped JCacheRegionFactory.";
    protected String attemptToStopAlreadyStoppedCacheProvider$str() {
        return attemptToStopAlreadyStoppedCacheProvider;
    }
    @Override
    public final void readOnlyCachingMutableEntity(final NavigableRole navigableRole) {
        super.log.logf(FQCN, WARN, null, readOnlyCachingMutableEntity$str(), navigableRole);
    }
    private static final String readOnlyCachingMutableEntity = "HHH90001003: Read-only caching was requested for mutable entity [%s]";
    protected String readOnlyCachingMutableEntity$str() {
        return readOnlyCachingMutableEntity;
    }
    @Override
    public final void readOnlyCachingMutableNaturalId(final NavigableRole navigableRole) {
        super.log.logf(FQCN, WARN, null, readOnlyCachingMutableNaturalId$str(), navigableRole);
    }
    private static final String readOnlyCachingMutableNaturalId = "HHH90001004: Read-only caching was requested for mutable natural-id for entity [%s]";
    protected String readOnlyCachingMutableNaturalId$str() {
        return readOnlyCachingMutableNaturalId;
    }
    @Override
    public final void softLockedCacheExpired(final String regionName, final Object key) {
        super.log.logf(FQCN, INFO, null, softLockedCacheExpired$str(), regionName, key);
    }
    private static final String softLockedCacheExpired = "HHH90001005: Cache[%s] Key[%s]\nA soft-locked cache entry was expired by the underlying cache. If this happens regularly you should consider increasing the cache timeouts and/or capacity limits";
    protected String softLockedCacheExpired$str() {
        return softLockedCacheExpired;
    }
    @Override
    public final void missingCacheCreated(final String regionName, final String configurationPropertyToDisableKey, final String configurationPropertyToDisableValue) {
        super.log.logf(FQCN, WARN, null, missingCacheCreated$str(), regionName, configurationPropertyToDisableKey, configurationPropertyToDisableValue);
    }
    private static final String missingCacheCreated = "HHH90001006: Missing cache[%1$s] was created on-the-fly. The created cache will use a provider-specific default configuration: make sure you defined one. You can disable this warning by setting '%2$s' to '%3$s'.";
    protected String missingCacheCreated$str() {
        return missingCacheCreated;
    }
    @Override
    public final void usingLegacyCacheName(final String currentName, final String legacyName) {
        super.log.logf(FQCN, WARN, null, usingLegacyCacheName$str(), currentName, legacyName);
    }
    private static final String usingLegacyCacheName = "HHH90001007: Using legacy cache name [%2$s] because configuration could not be found for cache [%1$s]. Update your configuration to rename cache [%2$s] to [%1$s].";
    protected String usingLegacyCacheName$str() {
        return usingLegacyCacheName;
    }
    @Override
    public final void nonStandardSupportForAccessType(final String key, final String accessType, final String regionName) {
        super.log.logf(FQCN, WARN, null, nonStandardSupportForAccessType$str(), key, accessType, regionName);
    }
    private static final String nonStandardSupportForAccessType = "HHH90001008: Cache [%1$s] uses the [%2$s] access type, but [%3$s] does not support it natively. Make sure your cache implementation supports JTA transactions.";
    protected String nonStandardSupportForAccessType$str() {
        return nonStandardSupportForAccessType;
    }
}
