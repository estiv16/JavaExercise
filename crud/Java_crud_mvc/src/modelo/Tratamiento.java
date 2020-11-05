package modelo;

public class Tratamiento {
    int IdPropietario;
    String Propietario;
    String Telefono;
    String Mascota;
    String Tratamiento;
    String Correo;
    
    
    public Tratamiento() {
    }

    public Tratamiento(int IdPropietario, String Propietario, String Correo, String Telefono, String Mascota, String Tratamiento) {
        this.IdPropietario = IdPropietario;
        this.Propietario = Propietario;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Mascota = Mascota;
        this.Tratamiento = Tratamiento; 
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public int getIdPropietario() {
        return IdPropietario;
    }

    public void setIdPropietario(int IdPropietario) {
        this.IdPropietario = IdPropietario;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getMascota() {
        return Mascota;
    }

    public void setMascota(String Mascota) {
        this.Mascota = Mascota;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }
    
   
    
    
}

