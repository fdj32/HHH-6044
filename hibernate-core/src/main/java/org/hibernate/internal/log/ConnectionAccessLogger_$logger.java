package org.hibernate.internal.log;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:29+0800")
public class ConnectionAccessLogger_$logger extends DelegatingBasicLogger implements ConnectionAccessLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ConnectionAccessLogger_$logger.class.getName();
    public ConnectionAccessLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void informConnectionLocalTransactionForNonJtaDdl(final JdbcConnectionAccess jdbcConnectionAccess) {
        super.log.logf(FQCN, INFO, null, informConnectionLocalTransactionForNonJtaDdl$str(), jdbcConnectionAccess);
    }
    private static final String informConnectionLocalTransactionForNonJtaDdl = "HHH10001501: Connection obtained from JdbcConnectionAccess [%s] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.";
    protected String informConnectionLocalTransactionForNonJtaDdl$str() {
        return informConnectionLocalTransactionForNonJtaDdl;
    }
}
