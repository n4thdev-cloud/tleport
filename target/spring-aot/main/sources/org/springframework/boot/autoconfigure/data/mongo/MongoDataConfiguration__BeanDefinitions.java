package org.springframework.boot.autoconfigure.data.mongo;

import abstracta.tleport.modelo.UsuariaModel;
import java.lang.Class;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.data.domain.ManagedTypes;
import org.springframework.data.mongodb.MongoManagedTypes;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Bean definitions for {@link MongoDataConfiguration}.
 */
@Generated
public class MongoDataConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'mongoDataConfiguration'.
   */
  public static BeanDefinition getMongoDataConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoDataConfiguration.class);
    beanDefinition.setInstanceSupplier(MongoDataConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance for 'mongoManagedTypes'.
   */
  private static InstanceSupplier<MongoManagedTypes> mongoManagedTypesInstance() {
    return (registeredBean ->  {
      List<Class<?>> types = List.of(UsuariaModel.class);
      ManagedTypes managedTypes = ManagedTypes.fromIterable(types);
      return MongoManagedTypes.from(managedTypes);
    } );
  }

  /**
   * Get the bean definition for 'mongoManagedTypes'.
   */
  public static BeanDefinition getMongoManagedTypesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoDataConfiguration.class);
    beanDefinition.setTargetType(MongoManagedTypes.class);
    beanDefinition.setInstanceSupplier(MongoDataConfiguration__BeanDefinitions.mongoManagedTypesInstance());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mongoMappingContext'.
   */
  private static BeanInstanceSupplier<MongoMappingContext> getMongoMappingContextInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MongoMappingContext>forFactoryMethod(MongoDataConfiguration.class, "mongoMappingContext", MongoProperties.class, MongoCustomConversions.class, MongoManagedTypes.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration", MongoDataConfiguration.class).mongoMappingContext(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'mongoMappingContext'.
   */
  public static BeanDefinition getMongoMappingContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoMappingContext.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration");
    beanDefinition.setInstanceSupplier(getMongoMappingContextInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mongoCustomConversions'.
   */
  private static BeanInstanceSupplier<MongoCustomConversions> getMongoCustomConversionsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MongoCustomConversions>forFactoryMethod(MongoDataConfiguration.class, "mongoCustomConversions")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration", MongoDataConfiguration.class).mongoCustomConversions());
  }

  /**
   * Get the bean definition for 'mongoCustomConversions'.
   */
  public static BeanDefinition getMongoCustomConversionsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoCustomConversions.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration");
    beanDefinition.setInstanceSupplier(getMongoCustomConversionsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'mappingMongoConverter'.
   */
  private static BeanInstanceSupplier<MappingMongoConverter> getMappingMongoConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MappingMongoConverter>forFactoryMethod(MongoDataConfiguration.class, "mappingMongoConverter", ObjectProvider.class, MongoMappingContext.class, MongoCustomConversions.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration", MongoDataConfiguration.class).mappingMongoConverter(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'mappingMongoConverter'.
   */
  public static BeanDefinition getMappingMongoConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MappingMongoConverter.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.data.mongo.MongoDataConfiguration");
    beanDefinition.setInstanceSupplier(getMappingMongoConverterInstanceSupplier());
    return beanDefinition;
  }
}
