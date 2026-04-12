package DynamicPolymorphism;

public class Main {
    public static void main(String[] args) {
        
        ManualCar manualCar = new ManualCar("Toyota", "Corolla");
        manualCar.startEngine();
        manualCar.shiftedGear(1);
        manualCar.accelerate();
        manualCar.shiftedGear(2);
        manualCar.accelerate();
        manualCar.brake();
        manualCar.stopEngine();


        System.out.println("-----------------------------");
        
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3");
        electricCar.startEngine();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.chargeBattery();
    }
}
