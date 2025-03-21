public class BebidaGourmet extends Bebida{

    public BebidaGourmet() {
        super("Vino tinto Cabernet Sauvignon", 13000, 
          "Elegante vino tinto con notas de frutos rojos y un final aterciopelado.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
