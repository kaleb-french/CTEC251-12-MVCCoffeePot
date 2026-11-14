public class Main {
    static void main() {
        CoffeePotModel pot = new CoffeePotModel();
        CoffeePotView view = new CoffeePotView();
        CoffeePotController controller = new CoffeePotController(pot, view);

        controller.start();
    }
}
