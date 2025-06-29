package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(Usuarios usu){
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuarios> traerUsuarios(){
        return controlPersis.traerUsuarios();
    }
    
    
}
