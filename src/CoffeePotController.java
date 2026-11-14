public class CoffeePotController {
    //f
    private CoffeePotModel model;
    private CoffeePotView view;
    //c
    CoffeePotController(CoffeePotModel model, CoffeePotView view){
        this.model = model;
        this.view = view;
    }
    public void start(){
        boolean running = true;
        while(running){
            view.showMenu();
            String input = view.getUserInput();
            String[] parsed = input.split(" ");
            int amount;
            try{
                switch (parsed[0]) {
                    case "brew":
                        amount = Integer.parseInt(parsed[1]);
                        model.brew(amount);
                        view.displayMessage("Coffee Level: " + model.getVolume());
                        break;
                    case "pour":
                        amount = Integer.parseInt(parsed[1]);
                        view.displayMessage("Coffee Level: " + model.getVolume());
                        model.pour(amount);
                        break;
                    case "status":
                        view.displayMessage("Coffee Level: " + model.getVolume());
                        break;
                    case "exit":
                        running = false;
                        break;
                    default:
                        throw new IllegalArgumentException("Invaild input!");
                }
            } catch(Exception e){
                view.displayMessage(e.toString());
            }
        }
    }

}
