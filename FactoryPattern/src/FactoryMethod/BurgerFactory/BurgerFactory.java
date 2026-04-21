package FactoryMethod.BurgerFactory;

import FactoryMethod.Burger.Burger;

public interface BurgerFactory {
    Burger createBurger(String type);
}
