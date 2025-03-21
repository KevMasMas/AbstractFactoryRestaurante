public class EntradaSaludable extends Entrada{

    public EntradaSaludable() {
        super("Tostadas de aguacate", 6000, 
              "Pan integral con aguacate machacado, semillas de chía y un toque de limón.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
    
}
