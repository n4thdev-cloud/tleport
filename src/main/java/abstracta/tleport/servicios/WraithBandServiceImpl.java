//4bstr4ct Ms 
package abstracta.tleport.servicios;

import abstracta.tleport.modelo.UsuariaModel;
import abstracta.tleport.util.JwtUtil;

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
    private final JwtUtil jwtUtil;

    @Value("${spring.roles.tleport:USERBAD}")
    private String rolesTleport;

    public WraithBandServiceImpl(UsuarioService usuarioService, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.usuarioService = usuarioService;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public String registrarUsuaria(UsuariaModel usuariaModel) {
        log.info("ROL cargado desde env: {}", rolesTleport);
        usuariaModel.setPassword(passwordEncoder.encode(usuariaModel.getPassword()));
        usuariaModel.setRol(rolesTleport);

        UsuariaModel usuariaCreada = this.usuarioService.guardar(usuariaModel);
        String token = "";

        if (usuariaCreada.getId() != null) {// se creó bien
            token = jwtUtil.generateTokenNewUser(usuariaCreada);
            log.info("Token generado para la nueva usuaria: {}", token);
        } else {
            token = jwtUtil.generateTokenErrorNew("Error al crear la usuaria");
        }

        return token;
    }

    @Override
    public String test() {
        return "Test :)";
    }

}
