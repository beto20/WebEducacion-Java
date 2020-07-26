package web.utp.interfaces;
import web.utp.interfaces.GenericoDAO;
import web.utp.modelo.VideoBean;



public interface VideoDAO extends GenericoDAO{
    public boolean insertar(VideoBean vb); 
    public VideoBean listarId(int id);
    public boolean actualizar(VideoBean vb); 
    public boolean editar(VideoBean vb); 
    
}
