public class PostreVegetariano extends Postre{

    public PostreVegetariano() {
        super("Mousse de chocolate vegano", 9500, 
              "Mousse cremoso hecho con chocolate amargo y leche de almendras.");
    }
    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
