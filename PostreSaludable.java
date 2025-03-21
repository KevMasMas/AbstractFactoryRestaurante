public class PostreSaludable extends Postre{

    public PostreSaludable() {
        super("Parfait de yogur y frutos rojos", 8000, 
              "Capas de yogur griego, granola y frutos rojos frescos.");
    }
    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
