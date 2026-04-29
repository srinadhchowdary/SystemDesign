package models;

public class PickupOrder extends Order{
    
    private String restaurantAddress;
    
    public PickupOrder(){
        restaurantAddress = "";
    }
    
    @Override
    public String getType() {
        return "Pick Up";
    }
    
    public void setRestaurantAddress(String address){
        restaurantAddress = address;
    }
    
    public String getRestaurantAddress(){
        return restaurantAddress;
    }
}
