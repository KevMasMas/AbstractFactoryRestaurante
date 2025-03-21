public abstract class Plato {
    protected String nombre;
    protected double precio;
    protected String descripcion;

    public Plato(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public abstract void descripcion();
    
}
