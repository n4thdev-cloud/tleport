//4bstr4ct Ms 
package abstracta.tleport.servicios;

import abstracta.tleport.modelo.UsuariaModel;
import abstracta.tleport.util.JwtUtil;
import jakarta.validation.Valid;

import java.util.Optional;

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
    public String registrarUsuaria(@Valid UsuariaModel usuariaModel) {
        log.info("ROL cargado desde env: {}", rolesTleport);
        usuariaModel.setPassword(passwordEncoder.encode(usuariaModel.getPassword()));
        usuariaModel.setRol(rolesTleport);

        UsuariaModel usuariaCreada = this.usuarioService.guardar(usuariaModel);
        String token = "";

        if (usuariaCreada != null) {// se creó bien
            token = jwtUtil.generateTokenNewUser(usuariaCreada);
            log.info("Token generado para la nueva usuaria: {}", token);
        } else {
            token = jwtUtil.generateTokenErrorNew("Error al crear la usuaria");
        }

        return token;
    }

    @Override
    public String checkNombreUsuaria(String usuariaModel) {

        Optional<UsuariaModel> usuariaBuscada = this.usuarioService.checkUsuariaName(usuariaModel);
        String token = "";

        if (usuariaBuscada.isPresent()) {// usuaria existe
            token = jwtUtil.generateTokenErrorNew("El nombre de usuarix ya existe");
        } else {
            token = jwtUtil.generateTokenErrorNew("OK");
        }

        return token;
    }

    @Override
    public String loginUsuaria(@Valid UsuariaModel usuariaModel) {
        if (usuariaModel.getUserName() == null) {
            usuariaModel.setUserName("");
        }
        if (usuariaModel.getEmail() == null) {
            usuariaModel.setEmail("");
        }

        UsuariaModel usuariaBuscada = this.usuarioService.findByEmail(usuariaModel.getEmail());
        String token = "";

        if (usuariaBuscada != null) {// existe la usuaria
            return validacionPasswordRol(usuariaModel.getPassword(), usuariaBuscada);
        } else {// no encontrada por email, buscar por nombre de usuaria
            Optional<UsuariaModel> usuariaUserBuscada = this.usuarioService
                    .checkUsuariaName(usuariaModel.getUserName());
            if (usuariaUserBuscada.isPresent()) {
                return validacionPasswordRol(usuariaModel.getPassword(), usuariaUserBuscada.get());
            } else {
                token = jwtUtil.generateTokenErrorNew("Usuaria no encontrada");
            }
        }
        return token;
    }

    private String validacionPasswordRol(String usuariaModelPassword, UsuariaModel usuariaModel) {
        String token = "";
        if (passwordEncoder.matches(usuariaModelPassword, usuariaModel.getPassword())) {// password correcto
            if (rolesTleport.equals(usuariaModel.getRol())) {// rol correcto
                token = jwtUtil.generateToken(usuariaModel);
                log.info("Token generado para la usuaria en login: {}", token);
            } else {
                token = jwtUtil.generateTokenErrorNew("Rol incorrecto");
            }
        } else {// password incorrecto
            token = jwtUtil.generateTokenErrorNew("Password incorrecto");
        }
        return token;
    }

    @Override
    public String test() {
        return "Test :)";
    }

}
