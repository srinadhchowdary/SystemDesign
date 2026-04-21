package SimpleFactory;

import SimpleFactory.Burger.BasicBurger;
import SimpleFactory.Burger.Burger;
import SimpleFactory.Burger.PremiumBurger;
import SimpleFactory.Burger.StandardBurger;

public class BurgerFactory {
    
    public Burger createBurger(String type) {
        
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else if(type.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else{
            throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }
}
