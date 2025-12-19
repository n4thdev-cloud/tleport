package org.springframework.boot.actuate.autoconfigure.metrics.mongo;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.mongodb.MongoCommandTagsProvider;
import io.micrometer.core.instrument.binder.mongodb.MongoConnectionPoolTagsProvider;
import io.micrometer.core.instrument.binder.mongodb.MongoMetricsCommandListener;
import io.micrometer.core.instrument.binder.mongodb.MongoMetricsConnectionPoolListener;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;

/**
 * Bean definitions for {@link MongoMetricsAutoConfiguration}.
 */
@Generated
public class MongoMetricsAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoMetricsAutoConfiguration'.
   */
  public static BeanDefinition getMongoMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MongoMetricsAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration}.
   */
  @Generated
  public static class MongoConnectionPoolMetricsConfiguration {
    /**
     * Get the bean definition for 'mongoConnectionPoolMetricsConfiguration'.
     */
    public static BeanDefinition getMongoConnectionPoolMetricsConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class);
      beanDefinition.setInstanceSupplier(MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoMetricsConnectionPoolListener'.
     */
    private static BeanInstanceSupplier<MongoMetricsConnectionPoolListener> getMongoMetricsConnectionPoolListenerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoMetricsConnectionPoolListener>forFactoryMethod(MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class, "mongoMetricsConnectionPoolListener", MeterRegistry.class, MongoConnectionPoolTagsProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration", MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class).mongoMetricsConnectionPoolListener(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'mongoMetricsConnectionPoolListener'.
     */
    public static BeanDefinition getMongoMetricsConnectionPoolListenerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMetricsConnectionPoolListener.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoMetricsConnectionPoolListenerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoConnectionPoolTagsProvider'.
     */
    private static BeanInstanceSupplier<MongoConnectionPoolTagsProvider> getMongoConnectionPoolTagsProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoConnectionPoolTagsProvider>forFactoryMethod(MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class, "mongoConnectionPoolTagsProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration", MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class).mongoConnectionPoolTagsProvider());
    }

    /**
     * Get the bean definition for 'mongoConnectionPoolTagsProvider'.
     */
    public static BeanDefinition getMongoConnectionPoolTagsProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoConnectionPoolTagsProvider.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoConnectionPoolTagsProviderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizer'.
     */
    private static BeanInstanceSupplier<MongoClientSettingsBuilderCustomizer> getMongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoClientSettingsBuilderCustomizer>forFactoryMethod(MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class, "mongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizer", MongoMetricsConnectionPoolListener.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration", MongoMetricsAutoConfiguration.MongoConnectionPoolMetricsConfiguration.class).mongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'mongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizer'.
     */
    public static BeanDefinition getMongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizerBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoClientSettingsBuilderCustomizer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoConnectionPoolMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoMetricsConnectionPoolListenerClientSettingsBuilderCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration}.
   */
  @Generated
  public static class MongoCommandMetricsConfiguration {
    /**
     * Get the bean definition for 'mongoCommandMetricsConfiguration'.
     */
    public static BeanDefinition getMongoCommandMetricsConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class);
      beanDefinition.setInstanceSupplier(MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoMetricsCommandListener'.
     */
    private static BeanInstanceSupplier<MongoMetricsCommandListener> getMongoMetricsCommandListenerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoMetricsCommandListener>forFactoryMethod(MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class, "mongoMetricsCommandListener", MeterRegistry.class, MongoCommandTagsProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration", MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class).mongoMetricsCommandListener(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'mongoMetricsCommandListener'.
     */
    public static BeanDefinition getMongoMetricsCommandListenerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMetricsCommandListener.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoMetricsCommandListenerInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoCommandTagsProvider'.
     */
    private static BeanInstanceSupplier<MongoCommandTagsProvider> getMongoCommandTagsProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoCommandTagsProvider>forFactoryMethod(MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class, "mongoCommandTagsProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration", MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class).mongoCommandTagsProvider());
    }

    /**
     * Get the bean definition for 'mongoCommandTagsProvider'.
     */
    public static BeanDefinition getMongoCommandTagsProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoCommandTagsProvider.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoCommandTagsProviderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'mongoMetricsCommandListenerClientSettingsBuilderCustomizer'.
     */
    private static BeanInstanceSupplier<MongoClientSettingsBuilderCustomizer> getMongoMetricsCommandListenerClientSettingsBuilderCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<MongoClientSettingsBuilderCustomizer>forFactoryMethod(MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class, "mongoMetricsCommandListenerClientSettingsBuilderCustomizer", MongoMetricsCommandListener.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration", MongoMetricsAutoConfiguration.MongoCommandMetricsConfiguration.class).mongoMetricsCommandListenerClientSettingsBuilderCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'mongoMetricsCommandListenerClientSettingsBuilderCustomizer'.
     */
    public static BeanDefinition getMongoMetricsCommandListenerClientSettingsBuilderCustomizerBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoClientSettingsBuilderCustomizer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.metrics.mongo.MongoMetricsAutoConfiguration$MongoCommandMetricsConfiguration");
      beanDefinition.setInstanceSupplier(getMongoMetricsCommandListenerClientSettingsBuilderCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
