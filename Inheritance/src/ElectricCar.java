public class ElectricCar extends Car {
    
    private int batteryPercentage;
    
    public ElectricCar(String brand,String model){
        super(brand,model);
        this.batteryPercentage = 100;
    }
    
    public void chargeBattery(){
        batteryPercentage = 100;
        System.out.println("Battery fully charged.");
    }
}
