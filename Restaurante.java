public class Restaurante {
    private FabricaMenus fabricamenus;

    public Restaurante(FabricaMenus fabricamenus){
        this.fabricamenus = fabricamenus;
    }

    public void generarMenu() {
        Entrada entrada = fabricamenus.crearEntrada();
        Plato plato = fabricamenus.crearPlato();
        Bebida bebida = fabricamenus.crearBebida();
        Postre postre =fabricamenus.crearPostre();

        System.out.println("Menú generado:");
        entrada.descripcion();
        plato.descripcion();
        bebida.descripcion();
        postre.descripcion();
    }
}
