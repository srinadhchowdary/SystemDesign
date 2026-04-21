package FactoryMethod.BurgerFactory;

import FactoryMethod.Burger.BasicBurger;
import FactoryMethod.Burger.Burger;
import FactoryMethod.Burger.PremiumBurger;
import FactoryMethod.Burger.StandardBurger;

public class SinghBurger implements BurgerFactory{
    @Override
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
            throw new IllegalArgumentException("Invalid burger type: " + type);
        }
    }
}
