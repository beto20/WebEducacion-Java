
package web.utp.modelo;


public class ArticuloBean {
     int id;
     int id_usuario;
     String titulo;
     String categoria;
     String descripcion;
     String url;
     String estado;

    public ArticuloBean() {
    }

    public ArticuloBean(int id, int id_usuario, String titulo, String categoria, String descripcion, String url, String estado) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.titulo = titulo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.url = url;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     
    
}
