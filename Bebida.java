public abstract class Bebida {
    
    protected String nombre;
    protected double precio;
    protected String descripcion;

    public Bebida(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public abstract void descripcion();
}