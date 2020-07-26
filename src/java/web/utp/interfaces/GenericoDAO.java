
package web.utp.interfaces;


import java.util.List;



public interface GenericoDAO{ 
    public List listar();
    public List listarXcategoria(String categoria); 
    public void borrar(int id);
    
}
