import models.Order;
import models.Restaurant;
import models.User;
import strategies.UPIPaymentStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    
        TomatoApp tomato = new TomatoApp();
        
        User user = new User(101,"Aditya","Banglore");
        System.out.println("User: "+ user.getName() + " is Active");
        
        List<Restaurant> restaurantList = tomato.searchRestaurants("Banglore");
        
        if(restaurantList.isEmpty()){
            System.out.println("No Restaurants found at location");
            return;
        }

        System.out.println("Found Restaurants");
        for(Restaurant restaurant : restaurantList){
            System.out.println(" -- " + restaurant.getName());
        }
        
        tomato.selectRestaurant(user,restaurantList.get(0));
        System.out.println("Selected restaurant: " + restaurantList.get(0).getName());


        tomato.addToCart(user,"P1");
        tomato.addToCart(user,"P2");
        tomato.printUserCart(user);
        
        Order order = tomato.checkoutNow(user,"Delivery",new UPIPaymentStrategy("1234567890"));
        tomato.payForOrder(user,order);
    }
}