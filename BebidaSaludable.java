public class BebidaSaludable extends Bebida{

    public BebidaSaludable() {
        super("Batido verde detox", 6000, 
          "Mezcla de espinaca, manzana verde, pepino y jengibre, ideal para revitalizar el cuerpo.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
