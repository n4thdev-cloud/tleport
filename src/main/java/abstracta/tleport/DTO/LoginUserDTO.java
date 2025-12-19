//4bstr4ct Ms 
package abstracta.tleport.DTO;

/**
 *
 * @author n4th
 */
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data // Genera Getters, Setters, ToString, Equals, HashCode
@AllArgsConstructor // Constructor con todo
@NoArgsConstructor  // Constructor vacío
public class LoginUserDTO {
    @NotBlank(message = "El email es obligatorio")
    private String email;
    @NotNull(message = "El password no puede ser nulo")
    private String password;
    
    
    
}
