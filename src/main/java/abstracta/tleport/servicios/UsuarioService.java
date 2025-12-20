//4bstr4ct Ms 
package abstracta.tleport.servicios;

import abstracta.tleport.modelo.UsuariaModel;
import abstracta.tleport.repositorio.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author n4th
 */
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private static final Logger log = LoggerFactory.getLogger(UsuarioService.class);

    public UsuarioService(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }

    public UsuariaModel guardar(UsuariaModel usuaria) {
        Objects.requireNonNull(usuaria, "La usuaria no puede ser null");

        UsuariaModel usuariaGuardada = usuarioRepository.save(usuaria);
        log.info("Usuaria guardada con ID: {}", usuariaGuardada.toString());
        return usuariaGuardada;
    }

    public List<UsuariaModel> obtenerTodxs() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuariaModel> obtenerPorId(String id) {

        if (!ObjectId.isValid(id)) {
            return Optional.empty();
        }
        return usuarioRepository.findById(new ObjectId(id));
    }

}
