package StaticPolymorphism;

public class Main {
    
    public static void main(String[] args) {
        
        ManualCar manualCar = new ManualCar("Toyota", "Corolla");
        manualCar.startEngine();
        manualCar.accelerate();
        manualCar.shiftGear();
        manualCar.accelerate(30);
        manualCar.shiftGear(3);
        manualCar.brake();
        manualCar.stopEngine();
    }
}
