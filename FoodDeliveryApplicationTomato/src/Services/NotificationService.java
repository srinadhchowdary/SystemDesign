package Services;

import models.MenuItem;
import models.Order;

import java.util.List;

public class NotificationService {
    public static void notify(Order order){

        System.out.println("\n Notification: New " + order.getType() + "order placed!");
        System.out.println("---------------------------------------------");
        System.out.println("Order Id : "+order.getOrderId());
        System.out.println("Customer : "+order.getUser().getName());
        System.out.println("Restaurant : "+order.getRestaurant().getName());
        System.out.println("Items Ordered: ");
        
        List<MenuItem> items = order.getItems();
        for(MenuItem item : items){
            System.out.println("Item :"+item.getName() + " (₹" +item.getPrice() + ")");
        }

        System.out.println("Total: ₹ "+order.getTotal());
        System.out.println("Scheduled For :"+order.getScheduled());
        System.out.println("Payment Completed Successfully.\n"+ "Amount : "+order.getTotal());
        System.out.println("----------------------------");
        
    }
}
