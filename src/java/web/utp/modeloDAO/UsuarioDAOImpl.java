
package web.utp.modeloDAO;

import web.utp.modelo.UsuarioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import web.utp.config.BDUtil;
import web.utp.interfaces.UsuarioDAO;


public class UsuarioDAOImpl implements UsuarioDAO{
    
    Connection cn=BDUtil.conectar();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public UsuarioBean validar(String correo, String pssw){
        UsuarioBean ub= new UsuarioBean();
        String sql="SELECT * FROM usuario where correo = ? AND contraseña = ? ";
        try {
            cn=BDUtil.conectar();
            ps=cn.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pssw);
            rs=ps.executeQuery();
            while (rs.next()) {
                ub.setNom_ape(rs.getString("nom_ape"));
                ub.setCorreo(rs.getString("correo"));
                ub.setContraseña(rs.getString("contraseña"));
                
            }
            
            
        } catch (Exception e) {
            
        }
        return ub;
    }
    
    
 
    
}
