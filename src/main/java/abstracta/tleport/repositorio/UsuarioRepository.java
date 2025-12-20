//4bstr4ct Ms 
package abstracta.tleport.repositorio;

/**
 *
 * @author n4th
 */
import abstracta.tleport.modelo.UsuariaModel;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<UsuariaModel, ObjectId> {
    
    // También puedes crear consultas personalizadas
    List<UsuariaModel> findByEmail(String email);
     Optional<UsuariaModel> findByuserName(String username);
}