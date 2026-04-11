public class SportsCar implements Car{
    
    
    String brand;
    String model;
    boolean isEngineOn;
    int currentSpeed=0;
    int currentGear=0;
    
    public SportsCar(String brand , String model){
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " engine started.");
    }

    @Override
    public void shiftGear(int gear) {
        if(isEngineOn){
            currentGear = gear;
            System.out.println(brand + " " + model + " shifted to gear " + currentGear);
        } else {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
        }
    }

    @Override
    public void accelerate() {
        
        if(isEngineOn){
            currentSpeed += 20;
            System.out.println(brand + " " + model + " is accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
        }
        
    }

    @Override
    public void brake() {
        
        currentSpeed -= 10;
        if (currentSpeed < 0){
            currentSpeed=0;
        }
        System.out.println(brand + " " + model + " is applied brake. Current speed: " + currentSpeed + " km/h");
        
    }

    @Override
    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " engine stopped.");

    }
}
