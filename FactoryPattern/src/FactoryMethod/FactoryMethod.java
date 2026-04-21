package FactoryMethod;

import FactoryMethod.Burger.Burger;
import FactoryMethod.BurgerFactory.BurgerFactory;
import FactoryMethod.BurgerFactory.KingBurger;
import FactoryMethod.BurgerFactory.SinghBurger;

public class FactoryMethod {
    
    public static void main(String[] args) {
        
        BurgerFactory burgerFactory = new SinghBurger();
        BurgerFactory burgerFactory2 = new KingBurger();

        Burger burger1 = burgerFactory.createBurger("basic");
        Burger burger2  = burgerFactory2.createBurger("wheat basic");

        Burger burger3 = burgerFactory.createBurger("standard");
        Burger burger4 = burgerFactory2.createBurger("wheat standard");

        Burger burger5 = burgerFactory.createBurger("premium");
        Burger burger6 = burgerFactory2.createBurger("wheat premium");
        
        burger1.prepare();
        burger2.prepare();
        burger3.prepare();
        burger4.prepare();
        burger5.prepare();
        burger6.prepare();
        
    }
}
