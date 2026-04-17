package OCP.Unfollowed;

public class ShoppingCartPrinter {
    
    private ShoppingCart cart;
    
    public ShoppingCartPrinter(ShoppingCart cart){
        this.cart = cart;
    }

    void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (Product p : cart.getProducts()) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + cart.calculatePrice());
    }
    
}
