/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Mascota;
import Modelo.Persona;
import java.util.List;

/**
 *
 * @author felip
 */
public interface CRUD {
    
    List listar();
    Persona list(int id);
    boolean add(Persona per);
    boolean edit(Persona per);
    boolean eliminar(int id);
    
    
    List listarMascota();   
    Mascota listMascota(int id);
    boolean addMascota(Mascota m);
    boolean editMascota(Mascota m);
    boolean eliminarMascota(int id);
    
    List listarTodo(); 
}
