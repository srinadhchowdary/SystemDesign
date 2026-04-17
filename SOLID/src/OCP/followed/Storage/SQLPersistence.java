package OCP.followed.Storage;

import OCP.followed.ShoppingCart;

public class SQLPersistence implements Persistence{
    
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to SQL database...");
    }
}
