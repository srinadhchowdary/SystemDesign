package factories;

import strategies.PaymentStrategy;
import models.*;

import java.util.*;

public interface OrderFactory {
    
    Order createOrder(User user , Cart cart , Restaurant restaurant , List<MenuItem> menuItems,
                      PaymentStrategy paymentStrategy, double totalCost , String orderType);
}
