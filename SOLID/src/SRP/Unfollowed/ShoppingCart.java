package SRP.Unfollowed;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private List<Product> products  = new ArrayList<>();
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public List<Product> getProducts(){
        return products;
    }
    
    // 1. calculate total price in cart
    public double calculateTotalPrice(){
        double totalprice = 0.0;
        
        for(Product product : products){
            totalprice += product.price;
        }
        return totalprice;
    }
    
    //SRP.Violation of Single Responsibility Principle
    // 2. generate invoice for the products in cart
    
    public void printInvoice(){
        System.out.println("Invoice:");
        for(Product product : products){
            System.out.println(product.name + "- Rs " + product.price);
        }
        System.out.println("Total Price : Rs "   +calculateTotalPrice());
    }
    
    // 3. violating SRP - saves to DB (should be in a  seperate Class
    public void saveToDatabase(){
        // code to save cart details to database
        System.out.println("Saving cart details to database...");
    }
}
