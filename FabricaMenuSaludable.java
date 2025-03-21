public class FabricaMenuSaludable implements FabricaMenus{

    @Override
    public Bebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoSaludable();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public Postre crearPostre() {
        return new PostreSaludable();
    }
    
}
