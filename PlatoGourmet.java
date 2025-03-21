public class PlatoGourmet extends Plato{

    public PlatoGourmet() {
        super("Filete mignon con puré de trufa", 25000, 
              "Suave filete de res envuelto en tocino, acompañado de puré de papa con esencia de trufa.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
