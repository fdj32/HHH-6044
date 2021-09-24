package org.hibernate.internal.log;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import java.sql.SQLException;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;
import java.util.Properties;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:29+0800")
public class ConnectionPoolingLogger_$logger extends DelegatingBasicLogger implements ConnectionPoolingLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ConnectionPoolingLogger_$logger.class.getName();
    public ConnectionPoolingLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void connectionProperties(final Properties connectionProps) {
        super.log.logf(FQCN, INFO, null, connectionProperties$str(), connectionProps);
    }
    private static final String connectionProperties = "HHH10001001: Connection properties: %s";
    protected String connectionProperties$str() {
        return connectionProperties;
    }
    @Override
    public final void usingHibernateBuiltInConnectionPool() {
        super.log.logf(FQCN, WARN, null, usingHibernateBuiltInConnectionPool$str());
    }
    private static final String usingHibernateBuiltInConnectionPool = "HHH10001002: Using Hibernate built-in connection pool (not for production use!)";
    protected String usingHibernateBuiltInConnectionPool$str() {
        return usingHibernateBuiltInConnectionPool;
    }
    @Override
    public final void autoCommitMode(final boolean autocommit) {
        super.log.logf(FQCN, INFO, null, autoCommitMode$str(), autocommit);
    }
    private static final String autoCommitMode = "HHH10001003: Autocommit mode: %s";
    protected String autoCommitMode$str() {
        return autoCommitMode;
    }
    private static final String jdbcUrlNotSpecified = "HHH10001004: JDBC URL was not specified by property %s";
    protected String jdbcUrlNotSpecified$str() {
        return jdbcUrlNotSpecified;
    }
    @Override
    public final String jdbcUrlNotSpecified(final String url) {
        return String.format(getLoggingLocale(), jdbcUrlNotSpecified$str(), url);
    }
    @Override
    public final void usingDriver(final String driverClassName, final String url) {
        super.log.logf(FQCN, INFO, null, usingDriver$str(), driverClassName, url);
    }
    private static final String usingDriver = "HHH10001005: using driver [%s] at URL [%s]";
    protected String usingDriver$str() {
        return usingDriver;
    }
    @Override
    public final void jdbcDriverNotSpecified(final String driver) {
        super.log.logf(FQCN, WARN, null, jdbcDriverNotSpecified$str(), driver);
    }
    private static final String jdbcDriverNotSpecified = "HHH10001006: No JDBC Driver class was specified by property %s";
    protected String jdbcDriverNotSpecified$str() {
        return jdbcDriverNotSpecified;
    }
    @Override
    public final void jdbcIsolationLevel(final String isolationLevelToString) {
        super.log.logf(FQCN, INFO, null, jdbcIsolationLevel$str(), isolationLevelToString);
    }
    private static final String jdbcIsolationLevel = "HHH10001007: JDBC isolation level: %s";
    protected String jdbcIsolationLevel$str() {
        return jdbcIsolationLevel;
    }
    @Override
    public final void cleaningUpConnectionPool(final String url) {
        super.log.logf(FQCN, INFO, null, cleaningUpConnectionPool$str(), url);
    }
    private static final String cleaningUpConnectionPool = "HHH10001008: Cleaning up connection pool [%s]";
    protected String cleaningUpConnectionPool$str() {
        return cleaningUpConnectionPool;
    }
    @Override
    public final void unableToClosePooledConnection(final SQLException e) {
        super.log.logf(FQCN, WARN, e, unableToClosePooledConnection$str());
    }
    private static final String unableToClosePooledConnection = "HHH10001009: Problem closing pooled connection";
    protected String unableToClosePooledConnection$str() {
        return unableToClosePooledConnection;
    }
}
