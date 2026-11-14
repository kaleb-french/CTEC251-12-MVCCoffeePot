public class Main {
    static void main() {
        CoffeePotModel pot = new CoffeePotModel();

        pot.brew(10);
        pot.pour(5);

        System.out.println("Coffee left: " + pot.getVolume());

        pot.pour(50);
    }
}
