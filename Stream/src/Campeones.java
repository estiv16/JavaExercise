public class Campeones {
    private int id;
    private String nombre;
    private int vida;
    private String genero;
    public Campeones(){
    }
    public Campeones(int id, String nombre, int vida, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Object getCampeon(){
        return " Id:"+ id +" \n Nombre:"+ nombre +"\n Vida:"+ vida +"\n Genero:"+ genero;
    }
}
