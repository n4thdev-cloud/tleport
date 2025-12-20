//4bstr4ct Ms 
package abstracta.tleport.WraithBandControlador;

/**
 *
 * @author n4th
 */
import abstracta.tleport.modelo.UsuariaModel;
import abstracta.tleport.servicios.UsuarioService;
import abstracta.tleport.servicios.WraithBandService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


/**
 *
 * @author n4th
 */
@RestController
@RequestMapping("/teleport/usuarix")
public class WraithBandController {

    private final WraithBandService wraithBandService;
    private final UsuarioService usuarioService;

    public WraithBandController(WraithBandService wraithBandService, UsuarioService usuarioService) {
        this.wraithBandService = wraithBandService;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/test")
    public String test() {

        return wraithBandService.test();
    }

    @GetMapping("/todxs")
    public List<UsuariaModel> todxs() {

        return usuarioService.obtenerTodxs();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<UsuariaModel> obtenerPorId(@PathVariable String id) {

        return usuarioService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @CrossOrigin("*")
    @PostMapping("/crearUsuaria")
    public Map<String, String> crearUsuaria(@Valid @RequestBody UsuariaModel usuarioModel) {
         
        return Map.of("token", wraithBandService.registrarUsuaria(usuarioModel));
    }

}
