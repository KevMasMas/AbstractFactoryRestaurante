public class Main {
    public static void main(String[] args) {
         // Menu vegetariano
         Restaurante restauranteVegetariano = new Restaurante(new FabricaMenuVegetariano());
         restauranteVegetariano.generarMenu();
 
         System.out.println("\n====================\n");
 
         // Menu gourmet
         Restaurante restauranteGourmet = new Restaurante(new FabricaMenuGourmet());
         restauranteGourmet.generarMenu();
 
         System.out.println("\n====================\n");
 
         // Menu saludable
         Restaurante restauranteSaludable = new Restaurante(new FabricaMenuSaludable());
         restauranteSaludable.generarMenu();
    }
}
