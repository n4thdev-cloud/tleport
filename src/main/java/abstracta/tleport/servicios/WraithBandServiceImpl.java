//4bstr4ct Ms 
package abstracta.tleport.servicios;

import abstracta.tleport.modelo.UsuariaModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author n4th
 */
@Service
public class WraithBandServiceImpl implements WraithBandService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioService.class);
    private final UsuarioService usuarioService;
    private final PasswordEncoder passwordEncoder;

    @Value("${spring.roles.tleport:USER}")
    private String rolesTleport;

    public WraithBandServiceImpl(UsuarioService usuarioService, PasswordEncoder passwordEncoder) {
        this.usuarioService = usuarioService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Boolean registrarUsuaria(UsuariaModel usuarioModel) {
        log.info("ROL cargado desde env: {}", rolesTleport);
        usuarioModel.setPassword(passwordEncoder.encode(usuarioModel.getPassword()));

        return this.usuarioService.guardar(usuarioModel);
    }

    @Override
    public String test() {
        return "Test :)";
    }

}
