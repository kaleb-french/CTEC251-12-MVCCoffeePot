public class CoffeePotModel {
    //f
    private int currentVolume;
    private int maxCapacity;
    //c
    CoffeePotModel(){
        currentVolume = 0;
        maxCapacity = 30;
    }
    //m
    public int getVolume(){
        return currentVolume;
    }
    public void brew(int amount){
        if(amount <0){
            throw new IllegalArgumentException("Can't add negative coffee");
        }
        if(currentVolume + amount > maxCapacity){
            throw new IllegalStateException("Coffee level cannot exceed maxCapcity");
        }
        currentVolume = currentVolume + amount;
    }
    public void pour(int amount){
        if(amount <0){
            throw new IllegalArgumentException("Can't remove negative coffee");
        }
        if(currentVolume - amount < 0){
            throw new IllegalStateException("Coffee level cannot be negative");
        }
        currentVolume = currentVolume - amount;
    }
}
