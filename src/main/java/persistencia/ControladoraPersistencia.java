package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuarios;
import persistencia.exceptions.NonexistentEntityException;

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

    public void borrarUsuario(int id_eliminar) {
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuarios traerUsuario(int id_editar) {
        return usuJpa.findUsuario(id_editar);
    }

    public void editarUsuario(Usuarios usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
