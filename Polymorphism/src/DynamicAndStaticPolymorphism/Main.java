package DynamicAndStaticPolymorphism;

public class Main {
    public static void main(String[] args) {
        
        Car car = new ManualCar("Toyota","Corolla");
        car.startEngine();
        car.accelerate();
        car.accelerate(40);
//        car.shiftGear(1);
        car.brake();
        car.stopEngine();

        System.out.println("----------------------");

        Car myElectricCar = new ElectricCar("Tesla", "Model S");
        myElectricCar.startEngine();
        myElectricCar.accelerate();
        myElectricCar.accelerate(10);
//        myElectricCar.chargeBattery();
        myElectricCar.brake();
        myElectricCar.stopEngine();
        
    }
}
