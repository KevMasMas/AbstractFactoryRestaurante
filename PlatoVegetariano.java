public class PlatoVegetariano extends Plato{

    public PlatoVegetariano() {
        super("Lasagna de berenjena", 30000, 
              "Capas de berenjena asada, queso ricotta y salsa de tomate casera.");
    }
    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
