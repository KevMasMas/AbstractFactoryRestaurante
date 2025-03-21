public class EntradaGourmet extends Entrada{

    public EntradaGourmet() {
        super("Carpaccio de res", 15000, "Láminas finas de carne con alcaparras y queso parmesano.");
    }

    @Override
    public void descripcion() {
        System.out.println(nombre + " - " + descripcion + " ($" + precio + ")");
    }
    
    
}
