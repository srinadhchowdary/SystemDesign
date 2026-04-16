package SRP.followed;

public class SRPFollowed {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop",30000));
        cart.addProduct(new Product("Lenovo",20000));
        
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();
        
        ShoppingCartStorage storage = new ShoppingCartStorage(cart);
        storage.saveToDatabase();
    }
}
