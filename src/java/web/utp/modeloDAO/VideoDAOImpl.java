
package web.utp.modeloDAO;

import web.utp.modelo.VideoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import web.utp.config.BDUtil;

import web.utp.interfaces.VideoDAO;


public class VideoDAOImpl implements VideoDAO{
    
    Connection cn=BDUtil.conectar();
    PreparedStatement ps;
    ResultSet rs;
    VideoBean vb =new VideoBean();
    //int r;
    
    @Override
    public List listar() {
        String sql="select id,id_usuario,titulo,categoria,descripcion,imagen,video_path,estado from video"; 
        List<VideoBean>lista = new ArrayList<>();
        //List<VideoBean>lista = new LinkedList<>();
        try {
             cn=BDUtil.conectar();
             ps=cn.prepareStatement(sql);
             rs=ps.executeQuery();
            while(rs.next()){
                VideoBean vb =new VideoBean();
                vb.setId(rs.getInt(1));
                vb.setId_usuario(rs.getInt(2));
                vb.setTitulo(rs.getString(3));
                vb.setCategoria(rs.getString(4));
                vb.setDescripcion(rs.getString(5));
                vb.setImagen(rs.getString(6));
                vb.setVideo_path(rs.getString(7));
                vb.setEstado(rs.getString(8));
                lista.add(vb);
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
        String sql="  select id ,id_usuario ,titulo ,categoria ,descripcion ,imagen ,video_path ,estado from video where categoria like '%"+categoria+"%' " ;  
        List<VideoBean>lista = new ArrayList<>();
        try {
             cn=BDUtil.conectar();
             ps=cn.prepareStatement(sql);
             rs=ps.executeQuery();
            while(rs.next()){
                VideoBean vb =new VideoBean();
                vb.setId(rs.getInt(1));
                vb.setId_usuario(rs.getInt(2));
                vb.setTitulo(rs.getString(3));
                vb.setCategoria(rs.getString(4));
                vb.setDescripcion(rs.getString(5));
                vb.setImagen(rs.getString(6));
                vb.setVideo_path(rs.getString(7));
                vb.setEstado(rs.getString(8));
                lista.add(vb);
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
    public boolean insertar(VideoBean vb) {
        String sql="insert into video(id_usuario,titulo,categoria,descripcion,imagen,video_path,estado)" 
                + "values(' "+vb.getId_usuario()+" ' ,' " +vb.getTitulo()+ " ', ' " +vb.getCategoria()+ " ', ' " +vb.getDescripcion()+ " ' , "
                + "' " +vb.getImagen()+ " ', ' " +vb.getVideo_path()+ " ', ' " +vb.getEstado()+ " ')";
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println("Error al agregar video" +e.getMessage());
            e.printStackTrace();
            return false;
        }
        
    
    }
    
    @Override
    public VideoBean listarId(int id){
        String sql = "select * from video where id="+id;
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                vb.setId_usuario(rs.getInt(2));
                vb.setTitulo(rs.getString(3));
                vb.setCategoria(rs.getString(4));
                vb.setDescripcion(rs.getString(5));
                vb.setImagen(rs.getString(6));
                vb.setVideo_path(rs.getString(7));
                vb.setEstado(rs.getString(8));
            }
            return vb;
            
        } catch (Exception e) {
            System.err.println("Error de actualizacion" +e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean actualizar(VideoBean vb) {
        String sql="update video set id_usuario="+vb.getId_usuario()+", titulo=' " +vb.getTitulo()+ " ', categoria=' " +vb.getCategoria()+ " ', "
                + "descripcion=' " +vb.getDescripcion()+ " ', imagen= ' " +vb.getImagen()+ " ', video_path= ' " +vb.getVideo_path()+ " ', "
                + "estado= ' " +vb.getEstado()+ " ' where id= " +vb.getId()+ " ";
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
        public boolean editar(VideoBean vb) {
          String sql="update video set id_usuario="+vb.getId_usuario()+", titulo=' " +vb.getTitulo()+ " ', categoria=' " +vb.getCategoria()+ " ', "
                + "descripcion=' " +vb.getDescripcion()+ " ', imagen= ' " +vb.getImagen()+ " ', video_path= ' " +vb.getVideo_path()+ " ', "
                + "estado= ' " +vb.getEstado()+ " ' where id= " +vb.getId()+ " ";
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
        String sql="delete from video where id="+id;
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
