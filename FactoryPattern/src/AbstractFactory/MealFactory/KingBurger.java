package AbstractFactory.MealFactory;

import AbstractFactory.Burger.BasicWheatBurger;
import AbstractFactory.Burger.Burger;
import AbstractFactory.Burger.PremiumWheatBurger;
import AbstractFactory.Burger.StandardWheatBurger;
import AbstractFactory.GarlicBread.BasicWheatGarlicBread;
import AbstractFactory.GarlicBread.CheeseWheatGarlicBread;
import AbstractFactory.GarlicBread.GarlicBread;

public class KingBurger implements MealFactory{
    @Override
    public Burger createBurger(String type) {
        
        if(type.equalsIgnoreCase("basic wheat")){
            return new BasicWheatBurger();
        }
        else if(type.equalsIgnoreCase("standard wheat")){
            return new StandardWheatBurger();
        }
        else if(type.equalsIgnoreCase("premium wheat")){
            return new PremiumWheatBurger();
        }
        else{
            throw new IllegalArgumentException("Invalid Wheat burger type: " + type);
        }
    }

    @Override
    public GarlicBread createGarlicBread(String type) {
        if(type.equalsIgnoreCase("basic wheat")){
            return new BasicWheatGarlicBread();
        }
        else if(type.equalsIgnoreCase("cheese wheat")){
            return new CheeseWheatGarlicBread();
        }
        else{
            throw new IllegalArgumentException("Invalid Wheat garlic bread type: " + type);
        }
    }
}
