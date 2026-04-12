package DynamicPolymorphism;

public class ManualCar extends Car{
    
    private int currentGear;
    
    public ManualCar(String brand, String model){
        super(brand,model);
        this.currentGear = 0;
    }
    
    public void shiftedGear(int gear){
        currentGear = gear;
        System.out.println(brand + " " + model + " shifted to gear " + currentGear);
    }
    
    
    @Override
    public void accelerate() {
        
        if(isEngineOn){
            currentSpeed += 20;
            System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h" + currentGear);
            return;
        }
        System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
    }

    @Override
    public void brake() {
        currentSpeed -= 20;
        if (currentSpeed < 0)
            currentSpeed = 0;
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    }
}
