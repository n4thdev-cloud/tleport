package abstracta.tleport.servicios;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Bean definitions for {@link WraithBandServiceImpl}.
 */
@Generated
public class WraithBandServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'wraithBandServiceImpl'.
   */
  private static BeanInstanceSupplier<WraithBandServiceImpl> getWraithBandServiceImplInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WraithBandServiceImpl>forConstructor(UsuarioService.class, PasswordEncoder.class)
            .withGenerator((registeredBean, args) -> new WraithBandServiceImpl(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'wraithBandServiceImpl'.
   */
  public static BeanDefinition getWraithBandServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WraithBandServiceImpl.class);
    InstanceSupplier<WraithBandServiceImpl> instanceSupplier = getWraithBandServiceImplInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(WraithBandServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
