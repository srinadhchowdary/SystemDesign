package StaticPolymorphism;

public class ManualCar {
    
    public String brand;
    public String model;
    public boolean isEngineOn;
    public int currentSpeed;
    public int currentGear;
    
    public ManualCar(String brand,String model){
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }
    
    public void startEngine(){
        isEngineOn = true;
        System.out.println(model + " "+ brand + " engine started.");
    }
    
    public void stopEngine(){
        isEngineOn = false;
        currentSpeed = 0;
        currentGear = 0;
        System.out.println(model + " "+ brand + " engine stopped.");
    }
    
    public void shiftGear(){
        if (currentGear < 5){
            currentGear++;
            System.out.println(model + " "+ brand + " shifted to gear " + currentGear);
        } else {
            System.out.println(model + " "+ brand + " is already in the highest gear.");
        }
    }
    
    public void shiftGear(int gear){
        currentGear = gear;
        System.out.println(model + " "+ brand + " shifted to gear " + currentGear);
    }
    
    public void accelerate(){
        if (isEngineOn){
            currentSpeed += 20;
            System.out.println(model + " "+ brand + " accelerated to " + currentSpeed + " km/h.");
        } else {
            System.out.println(model + " "+ brand + " cannot accelerate. Engine is off.");
        }
    }
    
    public void accelerate(int speed){
        if (isEngineOn){
            currentSpeed += speed;
            System.out.println(model + " "+ brand + " accelerated to " + currentSpeed + " km/h.");
        } else {
            System.out.println(model + " "+ brand + " cannot accelerate. Engine is off.");
        }
    }
    
    public void brake() {
        currentSpeed -= 20;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println(model + " " + brand + "  brake applied " + currentSpeed + " km/h.");
    }
}
