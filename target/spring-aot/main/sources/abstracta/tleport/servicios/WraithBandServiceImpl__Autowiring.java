package abstracta.tleport.servicios;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link WraithBandServiceImpl}.
 */
@Generated
public class WraithBandServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static WraithBandServiceImpl apply(RegisteredBean registeredBean,
      WraithBandServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("rolesTleport").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
