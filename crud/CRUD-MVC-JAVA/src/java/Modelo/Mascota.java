package Modelo;

public class Mascota {
    int idMascota;
    String mascota;
    String tratamiento;
    
    public Mascota(){
    }
    public Mascota(int id, String mascota, String tratamiento){
        this.idMascota = id;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int id) {
        this.idMascota = id;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


    
}
