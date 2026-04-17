package OCP.followed;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    public List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public double calculatePrice(){
        double totalPrice = 0;
        
        for(Product product : products){
            totalPrice += product.price;
        }
        return totalPrice;
    }
    
    public List<Product> getProducts(){
        return products;
    }
    
}
