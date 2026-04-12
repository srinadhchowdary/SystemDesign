package DynamicPolymorphism;

abstract public class Car {
    
    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;
    
    
    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }
    
    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " engine started.");
    }
    
    public void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " engine stopped.");
    }
    
    public abstract void accelerate();

    public abstract void brake();
    
    
    
}
