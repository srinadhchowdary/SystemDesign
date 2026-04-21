package FactoryMethod.BurgerFactory;

import FactoryMethod.Burger.BasicWheatBurger;
import FactoryMethod.Burger.Burger;
import FactoryMethod.Burger.PremiumWheatBurger;
import FactoryMethod.Burger.StandardWheatBurger;

public class KingBurger implements BurgerFactory{
    
    @Override
    public Burger createBurger(String type) {
        
        if(type.equalsIgnoreCase("wheat basic")){
            return new BasicWheatBurger();
        }
        else if(type.equalsIgnoreCase("wheat standard")){
            return new StandardWheatBurger();
        }
        else if(type.equalsIgnoreCase("wheat premium")){
            return new PremiumWheatBurger();
        }
        else{
            throw new IllegalArgumentException("Invalid burger type: " + type);
        }
    }
}
