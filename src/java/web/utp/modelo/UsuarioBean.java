
package web.utp.modelo;

import java.sql.Date;


public class UsuarioBean {

    int id;
    String nom_ape;
    String correo;
    String contraseña;
    String imagen;


    public UsuarioBean() {
    }

    public UsuarioBean(int id, String nom_ape, String correo, String contraseña, String imagen, Date created_at, Date updated_at) {
        this.id = id;
        this.nom_ape = nom_ape;
        this.correo = correo;
        this.contraseña = contraseña;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_ape() {
        return nom_ape;
    }

    public void setNom_ape(String nom_ape) {
        this.nom_ape = nom_ape;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    
    
    

    
}
