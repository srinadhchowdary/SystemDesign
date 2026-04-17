package OCP.followed;

import OCP.followed.Storage.FilePersistence;
import OCP.followed.Storage.MongoDBPersistence;
import OCP.followed.Storage.Persistence;
import OCP.followed.Storage.SQLPersistence;

public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 999.99));
        cart.addProduct(new Product("Mouse", 25.50));
        
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        Persistence sql = new SQLPersistence();
        Persistence mongoDb = new MongoDBPersistence();
        Persistence file = new FilePersistence();
        
        sql.save(cart);
        mongoDb.save(cart);
        file.save(cart);
    }
}
