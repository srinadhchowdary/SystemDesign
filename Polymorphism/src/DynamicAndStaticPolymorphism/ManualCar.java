package DynamicAndStaticPolymorphism;

public class ManualCar extends Car{
    
    private int currentGear;
    
    public ManualCar(String brand,String model){
        super(brand,model);
        this.currentGear = 0;
    }
    
    public void shiftGear(int gear){
        currentGear = gear;
        System.out.println(brand + " " + model + " shifted to gear " + currentGear);
    }
    
    @Override
    public void accelerate() {
        
        if(!isEngineOn){
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
            return;
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h");
    }

    @Override
    public void accelerate(int speed) {
        if (!isEngineOn) {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
            return;
        }
        currentSpeed += speed;
        System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h");
    }

    @Override
    public void brake() {
        
        currentSpeed -= 20;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
        System.out.println(brand + " " + model + " braked" + currentSpeed + " km/h");

    }
}
