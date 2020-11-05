/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Mascota;
import Modelo.Persona;
import Modelo.Tratamiento;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felip
 */
public class PersonaDAO implements CRUD {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p = new Persona();
    Mascota m = new Mascota();

    @Override
    public List listar() {
        List<Persona> list = new ArrayList();
        String sql = "select * from persona";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
        while(rs.next()){
            Persona per=new Persona();
            per.setId(rs.getInt(1));
            per.setDni(rs.getString(2));
            per.setNombre(rs.getString(3));
            list.add(per);
        }
        }catch(Exception e){
            
        }
        return list;
    }

    @Override
    public Persona list(int id) {
         String sql = "select * from persona where id="+id;
         try{
             con=cn.getConexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while(rs.next()){
                 p.setId(rs.getInt("id"));
                 p.setDni(rs.getString("dni"));
                 p.setNombre(rs.getString("nombres"));
             }
         }catch(Exception e){
             
         }
         return p;
    }

    @Override
    public boolean add(Persona per) {
        String sql="insert into persona(dni, nombres) values ('"+per.getDni()+"','" + per.getNombre() + "')";
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
    
        } 
        return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql = "update persona set dni='"+per.getDni()+"',nombres='" + per.getNombre()+ "'where id=" + per.getId();
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
           
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from persona where id="+id;
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){   
        }
        return false;
    }

    @Override
    public List listarMascota(){    
        List<Mascota>datos=new ArrayList();
        String sql="select * from mascota";
        try {
            con = cn.getConexion();
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
     

    @Override
    public Mascota listMascota(int id) {
       String sql = "select * from mascota where IdMascota="+id;
         try{
             con=cn.getConexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
                while(rs.next()){
                 m.setIdMascota(rs.getInt(1));
                 m.setMascota(rs.getString(2));
                 m.setTratamiento(rs.getString(3));
                }
            }catch(Exception e){
            }
        return m;    
    }

    @Override
    public boolean addMascota(Mascota m) {
        String sql="insert into mascota(IdMascota, Mascota, Tratamiento) values ('"+m.getIdMascota()+"','"+ m.getMascota()+
                "','"+m.getTratamiento()+"')";
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
    
        } 
        return false;    
    }

    @Override
    public boolean editMascota(Mascota m) {
        String sql = "update mascota set IdMascota='"+m.getIdMascota()+"', Mascota='"+ m.getMascota()+
                "', Tratamiento='"+m.getTratamiento()+"' where IdMascota=" + m.getIdMascota();
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
           
        }
        return false; 
    }

   @Override
    public boolean eliminarMascota(int id) {
        String sql = "delete from mascota where idMascota="+id;
        try{
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){   
        }
        return false;
    }

    @Override
    public List listarTodo() {
        
        List<Tratamiento> list = new ArrayList();
        String sql = "select * from persona inner join mascota on persona.id=mascota.IdMascota";
        try{
            con = cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
        while(rs.next()){
            Tratamiento tra=new Tratamiento();
            tra.setId(rs.getInt(1));
            tra.setDni(rs.getString(2));
            tra.setNombre(rs.getString(3));
            tra.setIdMascota(rs.getInt(4));
            tra.setMascota(rs.getString(5));
            tra.setTratamiento(rs.getString(6));
            list.add(tra);
        }
        }catch(Exception e){
            
        }
        return list;
        
    }
    
}
