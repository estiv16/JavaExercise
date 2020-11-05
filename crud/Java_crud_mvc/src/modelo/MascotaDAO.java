package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MascotaDAO {
    Conexion conectar= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarMascota(){    
        List<Mascota>datos=new ArrayList();
        String sql="select * from mascota";
        try {
            con = conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {                
                Mascota m = new Mascota();
                m.setIdMascota(rs.getInt(1));
                m.setMascota(rs.getString(2));
                m.setTratamiento(rs.getString(3));
                datos.add(m);                
            }
        } catch (Exception e) {
            System.out.print(System.err);
        }
        return datos;
    } 
    
    public int agregarMascota(Mascota m){
        String sql ="insert into mascota (IdMascota,Mascota,Tratamiento) values (?,?,?)";       
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, m.getIdMascota());
            ps.setString(2, m.getMascota());
            ps.setString(3, m.getTratamiento());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return 1;
    }
    
    public int actualizarMascota(Mascota m){
        int r=0;
        String sql ="update mascota set Mascota=?, Tratamiento=? where IdMascota=?";       
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getMascota());
            ps.setString(2, m.getTratamiento());
            ps.setInt(3, m.getIdMascota());
            r=ps.executeUpdate(); 
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
        }
    return 1;
    }

    public void deleteMascota(int id){
        String sql="delete from mascota where IdMascota="+id;
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){  
            System.out.print(System.err);
        }
    }   

}
