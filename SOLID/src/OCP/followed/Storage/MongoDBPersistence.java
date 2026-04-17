package OCP.followed.Storage;

import OCP.followed.ShoppingCart;

public class MongoDBPersistence implements Persistence{
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to MongoDB database...");
    }
}
