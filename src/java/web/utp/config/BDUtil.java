
package web.utp.config;

import java.sql.Connection;
import java.sql.DriverManager;


public class BDUtil {
    private static String url="jdbc:sqlserver://localhost:1433;databaseName=DBVideosEdu";
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String user="albertoVS";
    private static String psw="123";
    
    private static boolean cargarDriver(){
        try{
            Class.forName(driver);
            System.out.println("Exito al cargar el driver");
            return true;
        }catch(Exception e){
            System.err.println("Error al cargar el driver"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    
    public static Connection conectar(){
        if (!cargarDriver()) {
            return null;
        }
        try {
            Connection cn=DriverManager.getConnection(url, user, psw);
            System.out.println("Exito de conexion");
            return cn;
        } catch (Exception e) {
            System.err.println("Error al conectar"+e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    private static boolean cargarDriver(String driver){
        BDUtil.driver=driver;
        return cargarDriver();
    }
   
}
