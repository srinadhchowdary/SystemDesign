
public class SportsCar{
    
    public String brand;
    private String model;
    private boolean isEngineOn;
    private int currentSpeed = 0;
    private int currentGear = 0;
    
    //introduce new variable to class
    
    private String tyreCompany="CRT";

    public SportsCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    
    public String getTyreCompany() {
        return tyreCompany;
    }
    public void setTyreCompany(String tyreCompany) {
        this.tyreCompany = tyreCompany;
    }
    
    public void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " " + model + " engine started.");
    }

    public void shiftGear(int gear) {
        if (isEngineOn) {
            currentGear = gear;
            System.out.println(brand + " " + model + " shifted to gear " + currentGear);
        } else {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
        }
    }
    
    public void accelerate() {

        if (isEngineOn) {
            currentSpeed += 20;
            System.out.println(brand + " " + model + " is accelerating. Current speed: " + currentSpeed + " km/h");
        } else {
            System.out.println(brand + " " + model + " engine is off. Please start the engine first.");
        }
    }

    public void brake() {

        currentSpeed -= 10;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println(brand + " " + model + " is applied brake. Current speed: " + currentSpeed + " km/h");

    }
    
    public void stopEngine() {
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.println(brand + " " + model + " engine stopped.");

    }
}
