import Services.NotificationService;
import factories.NowOrderFactory;
import factories.OrderFactory;
import factories.ScheduledOrderFactory;
import managers.OrderManager;
import managers.RestaurantManager;
import models.*;
import strategies.PaymentStrategy;

import java.util.List;

public class TomatoApp {
    
    public TomatoApp(){
        initializeRestaurants();
    }
    
    public void initializeRestaurants(){

        Restaurant restaurant1 = new Restaurant("Meghana","Banglore");
        restaurant1.addMenuItem(new MenuItem("P1","CholeBhature",120));
        restaurant1.addMenuItem(new MenuItem("P2", "Samosa", 15));


        Restaurant restaurant2 = new Restaurant("Haldiram", "Banglore");
        restaurant2.addMenuItem(new MenuItem("P1", "Raj Kachori", 80));
        restaurant2.addMenuItem(new MenuItem("P2", "Pav Bhaji", 100));
        restaurant2.addMenuItem(new MenuItem("P3", "Dhokla", 50));

        Restaurant restaurant3 = new Restaurant("Saravana Bhavan", "Banglore");
        restaurant3.addMenuItem(new MenuItem("P1", "Masala Dosa", 90));
        restaurant3.addMenuItem(new MenuItem("P2", "Idli Vada", 60));
        restaurant3.addMenuItem(new MenuItem("P3", "Filter Coffee", 30));

        RestaurantManager restaurantManager = RestaurantManager.getInstance();
        restaurantManager.addRestaurant(restaurant1);
        restaurantManager.addRestaurant(restaurant2);
        restaurantManager.addRestaurant(restaurant3);
    }
    
    public List<Restaurant> searchRestaurants(String location){
        return RestaurantManager.getInstance().searchByLocation(location);
    }
    
    public void selectRestaurant(User user, Restaurant restaurant){
        Cart cart = user.getCart();
        cart.setRestaurant(restaurant);
    }
    
    public void addToCart(User user,String itemCode){
        
        Restaurant restaurant = user.getCart().getRestaurant();
        if(restaurant == null){
            System.out.println("please select a restaurant first");
            return;
        }
        
        for(MenuItem item : restaurant.getMenu()){
            if(item.getCode().equals(itemCode)){
                user.getCart().addItem(item);
                break;
            }
        }
    }
    
    public Order checkoutNow(User user, String orderType, PaymentStrategy paymentStrategy){
        return checkout(user,orderType,paymentStrategy,new NowOrderFactory());
    }
    
    public Order checkoutSchedules(User user,String orderType,PaymentStrategy paymentStrategy,String scheduleTime){
        return checkout(user,orderType,paymentStrategy,new ScheduledOrderFactory(scheduleTime));
    }
    
    public Order checkout(User user, String orderType, PaymentStrategy paymentStrategy, OrderFactory orderFactory){
        
        if(user.getCart().isEmpty())return null;
        
        Cart userCart = user.getCart();
        Restaurant orderRestaurant = userCart.getRestaurant();
        List<MenuItem> items = userCart.getItems();
        double totalCost = userCart.getTotalCost();
        
        Order order = orderFactory.createOrder(user,userCart,orderRestaurant,items,paymentStrategy,totalCost,orderType);
        OrderManager.getInstance().addOrder(order);
        return order;   
    }
    
    public void payForOrder(User user,Order order){
        boolean isPaymentSuccess = order.processPayment();
        
        if(isPaymentSuccess){
            NotificationService.notify(order);
            user.getCart().clear();
        }
    }
    
    public void printUserCart(User user){
        System.out.println("Items in Cart");
        System.out.println("----------------------");
        for(MenuItem item : user.getCart().getItems()){
            System.out.println(item.getCode()+" : "+item.getName() + " : ₹ "+item.getPrice());
        }
        System.out.println("----------------------");
        System.out.println("Grand Total : ₹ "+ user.getCart().getTotalCost());
    }
    
}