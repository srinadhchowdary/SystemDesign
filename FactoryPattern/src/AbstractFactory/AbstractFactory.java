package AbstractFactory;

import AbstractFactory.Burger.Burger;
import AbstractFactory.GarlicBread.GarlicBread;
import AbstractFactory.MealFactory.KingBurger;
import AbstractFactory.MealFactory.MealFactory;
import AbstractFactory.MealFactory.SinghBurger;

public class AbstractFactory {
    public static void main(String[] args) {

        MealFactory mealFactory = new KingBurger();
        Burger burger = mealFactory.createBurger("basic wheat");
        Burger burger1 = mealFactory.createBurger("standard wheat");
        Burger burger2 = mealFactory.createBurger("premium wheat");

        GarlicBread garlicBread = mealFactory.createGarlicBread("basic wheat");
        GarlicBread garlicBread1 = mealFactory.createGarlicBread("cheese wheat");
        
        burger.prepare();
        burger1.prepare();
        burger2.prepare();
        
        garlicBread.prepare();
        garlicBread1.prepare();
        
        MealFactory mealFactory1 = new SinghBurger();
        Burger burger3 = mealFactory1.createBurger("basic");
        Burger burger4 = mealFactory1.createBurger("standard");
        Burger burger5 = mealFactory1.createBurger("premium");
        
        GarlicBread garlicBread2 = mealFactory1.createGarlicBread("basic");
        GarlicBread garlicBread3 = mealFactory1.createGarlicBread("cheese");
        
        burger3.prepare();
        burger4.prepare();
        burger5.prepare();
        
        garlicBread2.prepare();
        garlicBread3.prepare();
        
        
        
    }
}
