package AbstractFactory.MealFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.GarlicBread.GarlicBread;

public interface MealFactory {
    
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);
    
}
