//4bstr4ct Ms 
package abstracta.tleport.servicios;

import abstracta.tleport.modelo.UsuariaModel;

/**
 *
 * @author n4th
 */

public interface WraithBandService {
    
    public String test();
    public String registrarUsuaria(UsuariaModel usuarioModel);
    public String checkNombreUsuaria(String nombreUsuaria);
    public String loginUsuaria(UsuariaModel usuarioModel);
        
}
