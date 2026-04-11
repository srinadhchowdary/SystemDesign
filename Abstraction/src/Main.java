public class Main {
    public static void main(String[] args) {
        //Main class should not knnow about the specific implementation of the car, it should only interact with the Car interface.
        Car  car  = new SportsCar("Ferrari", "488 GTB");
        car.startEngine();
        car.shiftGear(1);
        car.accelerate();
        car.shiftGear(2);
        car.accelerate();
        car.brake();
        car.stopEngine();
    }
}