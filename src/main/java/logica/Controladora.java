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

    public void borrarUsuario(int id_eliminar) {
        controlPersis.borrarUsuario(id_eliminar);
    }

    public Usuarios traerUsuario(int id_editar) {
        return controlPersis.traerUsuario(id_editar);
    }

    public void editarUsuario(Usuarios usu) {
        controlPersis.editarUsuario(usu);
    }
   
}
