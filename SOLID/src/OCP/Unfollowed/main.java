package OCP.Unfollowed;

public class main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Laptop", 50000));
        shoppingCart.addProduct(new Product("Smartphone", 20000));
        
        ShoppingCartPrinter printer = new ShoppingCartPrinter(shoppingCart);
        printer.printInvoice();
        
        ShoppingCartStorage storage = new ShoppingCartStorage(shoppingCart);
        storage.saveToSQLDatabase();
        
    }
}
