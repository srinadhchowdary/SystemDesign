package OCP.Unfollowed;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private final List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public List<Product> getProducts(){
        return products;
    }
    
    public double calculatePrice(){
        
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.price;
        }
        return totalPrice;
    }
    
}
