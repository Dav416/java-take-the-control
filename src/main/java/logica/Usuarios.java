package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "Usuarios")
public class Usuarios implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuario;
    private String nombre_usuario;
    private String nombre_cuenta_usuario;
    private String clave_usuario;
    private String correo_usuario;

    
    public Usuarios(){
        
    }
    
    public Usuarios(int id_usuario, String nombre_usuario, String nombre_cuenta_usuario, String clave_usuario, String correo_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.nombre_cuenta_usuario = nombre_cuenta_usuario;
        this.clave_usuario = clave_usuario;
        this.correo_usuario = correo_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre_cuenta_usuario() {
        return nombre_cuenta_usuario;
    }

    public void setNombre_cuenta_usuario(String nombre_cuenta_usuario) {
        this.nombre_cuenta_usuario = nombre_cuenta_usuario;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }
    
    
}
