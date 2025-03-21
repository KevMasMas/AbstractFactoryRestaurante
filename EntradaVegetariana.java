public class EntradaVegetariana extends Entrada{

    public EntradaVegetariana() {
        super("Ensalada de quinoa", 12500, 
        "Mezcla fresca de quinoa, aguacate, tomate cherry y aderezo de limón.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
    
}
