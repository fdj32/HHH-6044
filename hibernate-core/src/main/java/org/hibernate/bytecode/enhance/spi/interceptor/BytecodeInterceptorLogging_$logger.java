package org.hibernate.bytecode.enhance.spi.interceptor;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.BasicLogger;
import java.lang.String;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:26+0800")
public class BytecodeInterceptorLogging_$logger extends DelegatingBasicLogger implements BytecodeInterceptorLogging, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = BytecodeInterceptorLogging_$logger.class.getName();
    public BytecodeInterceptorLogging_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void lazyGroupIgnoredForToOne(final String ownerName, final String attributeName, final String requestedLazyGroup) {
        super.log.logf(FQCN, WARN, null, lazyGroupIgnoredForToOne$str(), ownerName, attributeName, requestedLazyGroup);
    }
    private static final String lazyGroupIgnoredForToOne = "HHH90005901: `%s#%s` was mapped with explicit lazy-group (`%s`).  Hibernate will ignore the lazy-group - this is generally not a good idea for to-one associations as it would lead to 2 separate SQL selects to initialize the association.  This is expected to be improved in future versions of Hibernate";
    protected String lazyGroupIgnoredForToOne$str() {
        return lazyGroupIgnoredForToOne;
    }
}
