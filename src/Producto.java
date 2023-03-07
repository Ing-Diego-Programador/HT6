public class Producto {
    String Nombre;
    int Cantidad;
    
    public Producto(String nombre, int cantidad) {
        Nombre = nombre;
        Cantidad = cantidad;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
