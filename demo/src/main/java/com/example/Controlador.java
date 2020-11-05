package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/hola")
    public String hola(){
        campeones champ = new campeones();
        return "Id: "+champ.getId() + "Nombre: "+ champ.getNombre();
    }


}
