package abstracta.tleport;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TleportApplication}.
 */
@Generated
public class TleportApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'tleportApplication'.
   */
  public static BeanDefinition getTleportApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TleportApplication.class);
    beanDefinition.setInstanceSupplier(TleportApplication::new);
    return beanDefinition;
  }
}
