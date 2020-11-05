package com.example.demo;

public class Campeones {

    private int id;
    private boolean estado;
    private String nombre;
    private String rango;

    public Campeones(){

    }
    public Campeones(int id, boolean estado, String nombre, String rango) {
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.rango = rango;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
}
