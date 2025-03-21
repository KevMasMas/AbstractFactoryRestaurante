public abstract class Postre {

    protected String nombre;
    protected double precio;
    protected String descripcion;

    public Postre(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public abstract void descripcion();
    
} 
    
