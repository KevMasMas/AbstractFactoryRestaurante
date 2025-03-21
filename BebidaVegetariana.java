public class BebidaVegetariana extends Bebida{
    
    public BebidaVegetariana() {
        super("Jugo de zanahoria y naranja", 8000,  "Refrescante mezcla natural de zanahoria y naranja, rica en vitaminas y antioxidantes.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
