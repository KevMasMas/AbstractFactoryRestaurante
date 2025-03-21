public class PlatoSaludable extends Plato{

    public PlatoSaludable() {
        super("Pechuga de pollo a la plancha con quinoa", 38000, 
              "Pechuga de pollo marinada con hierbas, servida con quinoa y vegetales al vapor.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
