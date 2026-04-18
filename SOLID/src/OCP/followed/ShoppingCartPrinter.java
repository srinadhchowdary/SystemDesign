package OCP.followed;

public class ShoppingCartPrinter {
    
    
    private ShoppingCart cart;
    
    public ShoppingCartPrinter(ShoppingCart cart){
        this.cart = cart;
    }
    
    public void printInvoice(){
        System.out.println("Invoice:");
        for(Product product: cart.getProducts()){
            System.out.println(product.name + " - " + product.price);
        }
    }
}
