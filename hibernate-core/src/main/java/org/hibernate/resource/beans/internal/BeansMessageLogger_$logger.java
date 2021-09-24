package org.hibernate.resource.beans.internal;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.hibernate.resource.beans.spi.ManagedBeanRegistry;
import org.hibernate.resource.beans.container.spi.BeanContainer;
import java.lang.Object;
import org.jboss.logging.Logger;


import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2021-09-23T15:19:30+0800")
public class BeansMessageLogger_$logger implements BeansMessageLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = BeansMessageLogger_$logger.class.getName();
    public BeansMessageLogger_$logger(final Logger log) {
        this.log = log;
    }
    protected final Logger log;
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void beanManagerButCdiNotAvailable(final Object cdiBeanManagerReference) {
        log.logf(FQCN, WARN, null, beanManagerButCdiNotAvailable$str(), cdiBeanManagerReference);
    }
    private static final String beanManagerButCdiNotAvailable = "HHH10005001: An explicit CDI BeanManager reference [%s] was passed to Hibernate, but CDI is not available on the Hibernate ClassLoader.  This is likely going to lead to exceptions later on in bootstrap";
    protected String beanManagerButCdiNotAvailable$str() {
        return beanManagerButCdiNotAvailable;
    }
    @Override
    public final void noBeanManagerButCdiAvailable() {
        log.logf(FQCN, INFO, null, noBeanManagerButCdiAvailable$str());
    }
    private static final String noBeanManagerButCdiAvailable = "HHH10005002: No explicit CDI BeanManager reference was passed to Hibernate, but CDI is available on the Hibernate ClassLoader.";
    protected String noBeanManagerButCdiAvailable$str() {
        return noBeanManagerButCdiAvailable;
    }
    @Override
    public final void stoppingManagedBeanRegistry(final ManagedBeanRegistry registry) {
        log.logf(FQCN, INFO, null, stoppingManagedBeanRegistry$str(), registry);
    }
    private static final String stoppingManagedBeanRegistry = "HHH10005003: Stopping ManagedBeanRegistry : %s";
    protected String stoppingManagedBeanRegistry$str() {
        return stoppingManagedBeanRegistry;
    }
    @Override
    public final void stoppingBeanContainer(final BeanContainer beanContainer) {
        log.logf(FQCN, INFO, null, stoppingBeanContainer$str(), beanContainer);
    }
    private static final String stoppingBeanContainer = "HHH10005004: Stopping BeanContainer : %s";
    protected String stoppingBeanContainer$str() {
        return stoppingBeanContainer;
    }
}
