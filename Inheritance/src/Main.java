public class Main {
    public static void main(String[] args) {
        
        ManualCar car1 = new ManualCar("Toyota","Corolla");
        car1.startEngine();
        car1.shiftGear(1);
        car1.accelerate();
        car1.shiftGear(2);
        car1.accelerate();
        car1.brake();
        car1.stopEngine();

        System.out.println("-----------------------------");
        
        ElectricCar car2 = new ElectricCar("Tesla","Model 3");
        car2.startEngine();
        car2.accelerate();
        car2.brake();
        car2.chargeBattery();
        car2.stopEngine();
        
    }
} 