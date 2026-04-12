public class Car {
    
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }
    
    public void startEngine() {
        isEngineOn = true;
        System.out.println(model + " " + brand + " engine started.");
    }
    
    public void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(model + " " + brand + " engine stopped.");
    }
    
    public void accelerate() {
        if (isEngineOn) {
            currentSpeed += 20;
            System.out.println("Accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println("Cannot accelerate. Engine is off.");
        }
    }
    
    public void brake(){
        currentSpeed -= 20;
        
        if(currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println("Braking. Current speed: " + currentSpeed + " km/h");
        
    }
}   
