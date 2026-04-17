package OCP.Unfollowed;

public class ShoppingCartStorage {
    
    private ShoppingCart cart;
    
    public ShoppingCartStorage(ShoppingCart cart){
        this.cart = cart;
    }
    
    void saveToSQLDatabase(){
        System.out.println("Saving Shopping Cart to SQL Database...");
    }
    
    void saveToMongoDB(){
        System.out.println("Saving Shopping Cart to MongoDB...");
    }
    
    void saveToFile(){
        System.out.println("Saving Shopping Cart to File...");
    }
}
