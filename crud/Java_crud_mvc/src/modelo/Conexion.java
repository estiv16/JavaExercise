/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
	
    Connection con;
	
    public Connection getConnection () {
        String url="jdbc:mysql://Localhost:3306/bd_ejemplo";
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
