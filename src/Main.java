public class Main {
    static void main() {
        CoffeePotModel pot = new CoffeePotModel();
        CoffeePotView view = new CoffeePotView();

        pot.brew(10);
        pot.pour(5);

        System.out.println("Coffee left: " + pot.getVolume());
        String output = "";

        CoffeePotController controller = new CoffeePotController(pot, view);

        controller.start();
    }
}
