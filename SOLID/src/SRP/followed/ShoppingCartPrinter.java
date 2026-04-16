package SRP.followed;

public class ShoppingCartPrinter {
    
    private ShoppingCart cart;
    
    public ShoppingCartPrinter(ShoppingCart cart){
        this.cart = cart;
    }
    
    public void printInvoice(){
        System.out.println("Shopping Cart Invoice:");
        for(Product product : cart.getProducts()){
            System.out.println(product.name + " - Rs " + product.price);
        }
        System.out.println("Total : Rs " + cart.calculateTotalPrice());
    }
}
