package DynamicAndStaticPolymorphism;

public class ElectricCar extends Car{
    
    private int batteryLevel;
    
    public ElectricCar(String brand,String model){
        super(brand,model);
        this.batteryLevel = 100;
    }
    
    public void chargeBattery(){
        batteryLevel = 100;
        System.out.println(brand + " " + model + " battery fully charged.");
    }
    
    @Override
    public void accelerate() {
        
        if(!isEngineOn){
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
            return;
        }
        if(batteryLevel <= 0) {
            System.out.println(brand + " " + model + " battery is empty. Please charge the battery.");
            return;
        }
        currentSpeed += 30;
        batteryLevel -= 10;
        System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h. Battery level: " + batteryLevel + "%");
    }

    @Override
    public void accelerate(int speed) {
        if (!isEngineOn) {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
            return;
        }
        if (batteryLevel <= 0) {
            System.out.println(brand + " " + model + " battery is empty. Please charge the battery.");
            return;
        }
        currentSpeed += speed;
        batteryLevel -= 10;
        System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h. Battery level: " + batteryLevel + "%");
    }

    @Override
    public void brake() {
        
        currentSpeed -= 30;
        if(currentSpeed < 0){
            currentSpeed = 0;
        }
        System.out.println(brand + " " + model +
                " : Regenerative braking! Speed is now " + currentSpeed +
                " km/h. Battery at " + batteryLevel + "%.");
    }
}
