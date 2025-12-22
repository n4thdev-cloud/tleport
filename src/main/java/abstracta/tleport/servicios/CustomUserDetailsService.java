package abstracta.tleport.servicios;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import abstracta.tleport.modelo.UsuariaModel;
import abstracta.tleport.repositorio.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;

    public CustomUserDetailsService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        UsuariaModel usuariaModel = usuarioRepository.findByuserName(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                "Usuario no encontrado: " + username));

        return User.builder()
                .username(usuariaModel.getUserName())
                .password(usuariaModel.getPassword()) // YA encriptada
                .authorities(usuariaModel.getRol())
                .build();
    }
}
