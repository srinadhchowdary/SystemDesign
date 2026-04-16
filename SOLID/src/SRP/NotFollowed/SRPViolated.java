package SRP.NotFollowed;

public class SRPViolated {

    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Lenovo",40000));
        
        
        cart.printInvoice();
        cart.saveToDatabase();
        
    }
}
