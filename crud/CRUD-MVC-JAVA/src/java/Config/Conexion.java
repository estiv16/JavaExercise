package Config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    private Connection con = null;
    
    
    public Connection getConexion(){
        
        String url="jdbc:mysql://Localhost:3306/registros";
        String user="root";
        String pass="123456789";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(url,user,pass);
            System.out.print("ok");
        }catch (Exception e){
            System.out.print(System.err);
        }
        return con;
    }
    
}