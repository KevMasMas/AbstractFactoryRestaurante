public class FabricaMenuVegetariano extends FabricaMenus{
    @Override
    public Bebida crearBebida() {
        return new BebidaVegetariana();
    }

    @Override
    public Plato crearPlato() {
        return new PlatoVegetariano();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaVegetariana();
    }

    @Override
    public Postre crearPostre() {
        return new PostreVegetariano();
    }
    
}
