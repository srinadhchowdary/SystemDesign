package OCP.followed.Storage;

import OCP.followed.ShoppingCart;

public class FilePersistence implements Persistence{
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to a file...");
    }
}
