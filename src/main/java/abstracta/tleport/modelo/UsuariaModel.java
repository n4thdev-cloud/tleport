//4bstr4ct Ms 
package abstracta.tleport.modelo;

/**
 *
 * @author n4th
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Data // Genera Getters, Setters, ToString, Equals, HashCode
@AllArgsConstructor // Constructor con todo
@NoArgsConstructor // Constructor vacío
@Document(collection = "usuario") // nombre de la colección
public class UsuariaModel {
    @Id
    private ObjectId id;
    @NotNull(message = "El nombre de usuario es obligatorio")
    private String userName;
    @NotNull(message = "El email es obligatorio")
    private String email;
    @NotNull(message = "El password es obligatorio")
    private String password;
    private String rol;

}
