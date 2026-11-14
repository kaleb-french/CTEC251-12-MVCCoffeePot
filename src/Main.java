public class Main {
    static void main() {
        CoffeePotModel pot = new CoffeePotModel();
        CoffeePotView view = new CoffeePotView();

        pot.brew(10);
        pot.pour(5);

        System.out.println("Coffee left: " + pot.getVolume());
        String output = "";
        while(true){
            output = view.getUserInput();
            System.out.println(output);

            if(output == ""){
                break;
            }
        }
    }
}
