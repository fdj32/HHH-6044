package org.hibernate.internal.log;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:30+0800")
public class UnsupportedLogger_$logger implements UnsupportedLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = UnsupportedLogger_$logger.class.getName();
    public UnsupportedLogger_$logger(final Logger log) {
        this.log = log;
    }
    protected final Logger log;
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void usingLegacyClassnamesForProxies() {
        log.logf(FQCN, WARN, null, usingLegacyClassnamesForProxies$str());
    }
    private static final String usingLegacyClassnamesForProxies = "HHH90002001: Global configuration option 'hibernate.bytecode.enforce_legacy_proxy_classnames' was enabled. Generated proxies will use backwards compatible classnames. This option is unsupported and will be removed.";
    protected String usingLegacyClassnamesForProxies$str() {
        return usingLegacyClassnamesForProxies;
    }
}
