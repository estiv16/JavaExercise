public class Productos {
    private int id;
    private String productos;
    private int cantidad;

    public Productos() {
    }

    public Productos(int id, String productos, int cantidad) {
        this.id = id;
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar(){
        System.out.println("Id: " +id);
        System.out.println("Producto: " +productos);
        System.out.println("Cantidad: " +cantidad);
    }
}
