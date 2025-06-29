package persistencia;

import java.util.List;
import logica.Usuarios;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
            
    // Operación CREATE
    public void crearUsuario(Usuarios usu){
        
       usuJpa.create(usu);
        
       
    } 
    
    // Operación READ
    public List<Usuarios> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }
}
