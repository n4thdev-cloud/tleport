package abstracta.tleport.repositorio;

import abstracta.tleport.modelo.UsuariaModel;
import java.lang.Class;
import org.bson.types.ObjectId;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactoryBean;
import org.springframework.data.repository.query.QueryLookupStrategy;

/**
 * Bean definitions for {@link UsuarioRepository}.
 */
@Generated
public class UsuarioRepository__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'usuarioRepository'.
   */
  private static BeanInstanceSupplier<MongoRepositoryFactoryBean> getUsuarioRepositoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MongoRepositoryFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MongoRepositoryFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'usuarioRepository'.
   */
  public static BeanDefinition getUsuarioRepositoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MongoRepositoryFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClassWithGenerics(MongoRepositoryFactoryBean.class, UsuarioRepository.class, UsuariaModel.class, ObjectId.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, "abstracta.tleport.repositorio.UsuarioRepository");
    beanDefinition.getPropertyValues().addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
    beanDefinition.getPropertyValues().addPropertyValue("lazyInit", false);
    beanDefinition.getPropertyValues().addPropertyValue("namedQueries", new RuntimeBeanReference("mongo.named-queries#0"));
    beanDefinition.getPropertyValues().addPropertyValue("repositoryFragments", new RuntimeBeanReference("mongodb.UsuarioRepository.fragments#0"));
    beanDefinition.getPropertyValues().addPropertyValue("mongoOperations", new RuntimeBeanReference("mongoTemplate"));
    beanDefinition.getPropertyValues().addPropertyValue("createIndexesForQueryMethods", false);
    beanDefinition.setInstanceSupplier(getUsuarioRepositoryInstanceSupplier());
    return beanDefinition;
  }
}
