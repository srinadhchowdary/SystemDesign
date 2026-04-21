package SimpleFactory;

import SimpleFactory.Burger.Burger;

public class SimpleFactory {
    public static void main(String[] args) {
        
        String type = "premium";
        
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger  = burgerFactory.createBurger(type);
        
        if(burger != null){
            burger.prepare();
        }
    }
}