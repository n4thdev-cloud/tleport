package org.springframework.boot.actuate.autoconfigure.data.mongo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.actuate.health.HealthContributor;

/**
 * Bean definitions for {@link MongoHealthContributorAutoConfiguration}.
 */
@Generated
public class MongoHealthContributorAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoHealthContributorAutoConfiguration'.
   */
  public static BeanDefinition getMongoHealthContributorAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoHealthContributorAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MongoHealthContributorAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mongoHealthContributor'.
   */
  private static BeanInstanceSupplier<HealthContributor> getMongoHealthContributorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HealthContributor>forFactoryMethod(MongoHealthContributorAutoConfiguration.class, "mongoHealthContributor", ConfigurableListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.actuate.autoconfigure.data.mongo.MongoHealthContributorAutoConfiguration", MongoHealthContributorAutoConfiguration.class).mongoHealthContributor(args.get(0)));
  }

  /**
   * Get the bean definition for 'mongoHealthContributor'.
   */
  public static BeanDefinition getMongoHealthContributorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HealthContributor.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.actuate.autoconfigure.data.mongo.MongoHealthContributorAutoConfiguration");
    beanDefinition.setInstanceSupplier(getMongoHealthContributorInstanceSupplier());
    return beanDefinition;
  }
}
