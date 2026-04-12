package DynamicPolymorphism;

public class ElectricCar extends Car{
    
    public int chargePercentage;
    
    public ElectricCar(String brand, String model){
        super(brand,model);
        this.chargePercentage = 100;
    }
    
    public void chargeBattery(){
        chargePercentage = 100;
        System.out.println(brand + " " + model + " battery fully charged.");
    }
    
    @Override
    public void accelerate() {
        
        if(!isEngineOn){
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
            return;
        }
        
        if(chargePercentage <= 0){
            System.out.println(brand + " " + model + " battery is empty. Please charge the battery.");
            return;
        }
        
        chargePercentage -= 10;
        currentSpeed += 30;
        System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h. Battery at " + chargePercentage + "%");
    }
    
    @Override
    public void brake() {
        
        currentSpeed -= 15;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println(brand + " " + model + " : Regenerative braking! Speed is now "
                + currentSpeed + " km/h. Battery at " + chargePercentage + "%.");

    }
}
