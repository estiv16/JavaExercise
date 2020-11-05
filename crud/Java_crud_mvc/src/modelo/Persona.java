package modelo;



public class Persona {
    int id;
    String nom;
    String correo;
    String tel;
   
    
    public Persona() {
    }
    public Persona(int id,String nom,String correo,String tel){
    this.id = id;
    this.nom = nom;
    this.correo = correo;
    this.tel = tel;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setCorreo(String Correo) {
        this.correo = Correo;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTel() {
        return tel;
    }

    
    
}
