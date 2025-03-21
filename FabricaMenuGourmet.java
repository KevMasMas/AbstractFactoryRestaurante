public class FabricaMenuGourmet extends FabricaMenus {
    @Override
    public Bebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoGourmet();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public Postre crearPostre() {
        return new PostreGourmet();
    }
    
}
