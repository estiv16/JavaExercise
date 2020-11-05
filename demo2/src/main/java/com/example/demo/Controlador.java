package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

import static com.sun.javafx.fxml.expression.Expression.equalTo;

@RestController
    public class Controlador {


        @GetMapping("/hola")
        public ResponseEntity<List> mostrar(){

            Campeones camp = new Campeones(1,true,"Garen","mele");
            /*
            int id = 1;
            String nombre = "Garen";
            boolean estado = true;
            String rango = "Mele";


            camp.setId(id);
            camp.setNombre(nombre);
            camp.setEstado(estado);
            camp.setRango(rango);
            */

            List<Campeones> listCampeones= new ArrayList<>();
            listCampeones.add(camp);

            return ResponseEntity.ok(listCampeones);
        }
        
        @GetMapping
        public ResponseEntity<ResponseEntity> consultar(){
            RestTemplate template = new RestTemplate();
            String Url = "https://www.arquitecturajava.com/spring-rest-client-con-resttemplates/";
            ResponseEntity<String> response = template.getForEntity(Url + "/1", String.class);
            return ResponseEntity.ok(response);
        }
    }
