public class PostreGourmet extends Postre{

    public PostreGourmet() {
        super("Crème brûlée de vainilla", 24000, 
              "Delicada crema de vainilla con una costra de azúcar caramelizada.");
    }
    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
}
