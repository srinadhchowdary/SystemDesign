package AbstractFactory.MealFactory;

import AbstractFactory.Burger.BasicBurger;
import AbstractFactory.Burger.Burger;
import AbstractFactory.Burger.PremiumBurger;
import AbstractFactory.Burger.StandardBurger;
import AbstractFactory.GarlicBread.BasicGarlicBread;
import AbstractFactory.GarlicBread.CheeseGarlicBread;
import AbstractFactory.GarlicBread.GarlicBread;

public class SinghBurger implements MealFactory{

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

    @Override
    public GarlicBread createGarlicBread(String type) {
        
        if(type.equalsIgnoreCase("basic")){
            return new BasicGarlicBread();
        }
        else if(type.equalsIgnoreCase("cheese")){
            return new CheeseGarlicBread();
        }
        else{
            throw new IllegalArgumentException("Invalid garlic bread type: " + type);
        }
    }
}
