
package web.utp.interfaces;

import web.utp.modelo.ArticuloBean;

public interface ArticuloDAO extends GenericoDAO{ 
    public boolean insertar(ArticuloBean ab); 
    public ArticuloBean listarId(int id);
    public boolean actualizar(ArticuloBean ab); 
    public boolean editar(ArticuloBean ab);  
}
