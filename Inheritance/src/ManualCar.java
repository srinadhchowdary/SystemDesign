public class ManualCar extends Car {
    
    private int currentGear;
    
    public ManualCar(String brand,String model) {
        super(brand,model);
        this.currentGear = 0;
    }
    
    public void shiftGear(int gear){
        
        if (gear >= 0 && gear <= 5) {
            currentGear = gear;
            System.out.println("shifted to gear " + currentGear);
        } else {
            System.out.println("Invalid gear. Please select a gear between 0 and 5.");
        }
        
    }
}
