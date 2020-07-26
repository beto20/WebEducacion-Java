
package web.utp.modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import web.utp.config.BDUtil;
import web.utp.interfaces.ArticuloDAO;
import web.utp.modelo.ArticuloBean;



public class ArticuloDAOImpl implements ArticuloDAO{
    

    Connection cn=BDUtil.conectar();
    PreparedStatement ps;
    ResultSet rs;
    ArticuloBean ab =new ArticuloBean();
    int r;
    
    @Override
    public List listar() {
        String sql="select id,usuario_id,titulo,categoria,descripcion,dir_url,estado from articulo";  
        List<ArticuloBean>lista = new ArrayList<>();
        try {
             cn=BDUtil.conectar();
             ps=cn.prepareStatement(sql);
             rs=ps.executeQuery();
            while(rs.next()){
                ArticuloBean ab =new ArticuloBean();
                ab.setId(rs.getInt(1));
                ab.setId_usuario(rs.getInt(2));
                ab.setTitulo(rs.getString(3));
                ab.setCategoria(rs.getString(4));
                ab.setDescripcion(rs.getString(5));
                ab.setUrl(rs.getString(6));
                ab.setEstado(rs.getString(7));
                lista.add(ab);
            }
            rs.close();
            ps.close();
            cn.close();
            return lista;          
        } catch (Exception e) {
            System.err.println("Error al listar" +e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
  
    
    
    
    @Override
        public List listarXcategoria(String categoria) {
        String sql="select id,usuario_id,titulo,categoria,descripcion,dir_url,estado from articulo where categoria like  '%"+categoria+"%' " ;  
        List<ArticuloBean>lista = new ArrayList<>();
        try {
             cn=BDUtil.conectar();
             ps=cn.prepareStatement(sql);
             rs=ps.executeQuery();
            while(rs.next()){
                ArticuloBean ab =new ArticuloBean();
                ab.setId(rs.getInt(1));
                ab.setId_usuario(rs.getInt(2));
                ab.setTitulo(rs.getString(3));
                ab.setCategoria(rs.getString(4));
                ab.setDescripcion(rs.getString(5));
                ab.setUrl(rs.getString(6));
                ab.setEstado(rs.getString(7));
                lista.add(ab);
            }
            rs.close();
            ps.close();
            cn.close();
            return lista;          
        } catch (Exception e) {
            System.err.println("Error al listar" +e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    @Override
    public boolean insertar(ArticuloBean ab) {
        String sql="insert into articulo(usuario_id,titulo,categoria,descripcion,dir_url,estado)" 
                + "values(' "+ab.getId_usuario()+" ' ,' " +ab.getTitulo()+ " ', ' " +ab.getCategoria()+ " ', ' " +ab.getDescripcion()+ " ' , ' "
                +ab.getUrl()+ " ', ' " +ab.getEstado()+ " ')";
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println("Error al agregar articulo" +e.getMessage());
            e.printStackTrace();
            return false;
        }
        
    
    }
    
    @Override
    public ArticuloBean listarId(int id){
        String sql = "select * from articulo where id="+id;
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                ab.setId_usuario(rs.getInt(2));
                ab.setTitulo(rs.getString(3));
                ab.setCategoria(rs.getString(4));
                ab.setDescripcion(rs.getString(5));
                ab.setUrl(rs.getString(6));
                ab.setEstado(rs.getString(7));
            }
            return ab;
            
        } catch (Exception e) {
            System.err.println("Error de actualizacion" +e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean actualizar(ArticuloBean ab) {
        String sql="update articulo set usuario_id="+ab.getId_usuario()+", titulo=' " +ab.getTitulo()+ " ', categoria=' " +ab.getCategoria()+ " ', "
                + "descripcion=' " +ab.getDescripcion()+ " ', dir_url= ' " +ab.getUrl()+ " ', "+ "estado= ' " +ab.getEstado()+ " ' where id= " +ab.getId()+ " ";
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            System.err.println("Error de actualizacion" +e.getMessage());
            e.printStackTrace();
            return false;
        }

    }
    
    @Override
        public boolean editar(ArticuloBean ab) {
                String sql="update articulo set usuario_id="+ab.getId_usuario()+", titulo=' " +ab.getTitulo()+ " ', categoria=' " +ab.getCategoria()+ " ', "
                + "descripcion=' " +ab.getDescripcion()+ " ', dir_url= ' " +ab.getUrl()+ " ', "+ "estado= ' " +ab.getEstado()+ " ' where id= " +ab.getId()+ " ";
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            System.err.println("Error de actualizacion" +e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    
    @Override
    public void borrar(int id){
        String sql="delete from articulo where id="+id;
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.err.println("Error de actualizacion" +e.getMessage());
            e.printStackTrace();
        }
    }
    
    

    
}
