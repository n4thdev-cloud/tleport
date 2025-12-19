package abstracta.tleport.WraithBandControlador;

import abstracta.tleport.servicios.UsuarioService;
import abstracta.tleport.servicios.WraithBandService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WraithBandController}.
 */
@Generated
public class WraithBandController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'wraithBandController'.
   */
  private static BeanInstanceSupplier<WraithBandController> getWraithBandControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WraithBandController>forConstructor(WraithBandService.class, UsuarioService.class)
            .withGenerator((registeredBean, args) -> new WraithBandController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'wraithBandController'.
   */
  public static BeanDefinition getWraithBandControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WraithBandController.class);
    beanDefinition.setInstanceSupplier(getWraithBandControllerInstanceSupplier());
    return beanDefinition;
  }
}
