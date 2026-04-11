public class Main {
    public static void main(String[] args) {
        
        SportsCar car = new SportsCar("Ferrari","488 Spider");
        car.startEngine();
        car.shiftGear(1);
        car.accelerate();
        car.shiftGear(2);
        car.accelerate();
        car.brake();
        car.stopEngine();
        
        //Setting Arbitrary value to Speed
//        car.currentSpeed = 300;
//        System.out.println("Current speed: " + car.currentSpeed + " km/h");
        
        System.out.println("Tyre Company: " + car.getTyreCompany());
        car.brand = "Lamborghini";
        System.out.println("Car Brand: " + car.brand);
        car.setTyreCompany("Pirelli");
        System.out.println("Tyre Company: " + car.getTyreCompany());
    }
}