import java.util.Scanner;

public class CoffeePotView {
    //f
    Scanner input = new Scanner(System.in);
    //c
    //m
    public void showMenu(){
        System.out.println("brew(Amount), pour(Amount), status, exit");
    }
    public String getUserInput(){
        return input.nextLine();
    }
    public void displayMessage(String msg){
        System.out.println(msg);
    }
}
