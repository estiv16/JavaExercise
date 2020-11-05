package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class TratamientoDAO {
    
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
   

    public List<Tratamiento> listarTratamiento() {
        List<Tratamiento>datos=new ArrayList();
         String sql="select Id, Nombres, Correo, Telefono from persona ";
         try {
             con = conectar.getConnection();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()) { 
                Tratamiento t= new Tratamiento();
                t.setIdPropietario(rs.getInt(1));
                t.setPropietario(rs.getString(2));
                t.setCorreo(rs.getString(3));
                t.setTelefono(rs.getString(4));
                datos.add(t);                
             }
         } catch (Exception e) {
             System.out.print(System.err);
         }
         return datos;
    }

    public List<Tratamiento> listarTratamiento2() {
        List<Tratamiento>datos=new ArrayList();
         String sql="select Mascota, Tratamiento from mascota ";
         try {
             con = conectar.getConnection();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()) { 
                Tratamiento t= new Tratamiento();
                t.setMascota(rs.getString(1));
                t.setTratamiento(rs.getString(2));
                datos.add(t);                
             }
         } catch (Exception e) {
             System.out.print(System.err);
         }
         return datos;
    }
    
}
