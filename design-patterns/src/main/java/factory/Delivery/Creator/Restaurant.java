package factory.Delivery.Creator;

import factory.Delivery.Product.Burger.Burger;
import factory.Delivery.Product.Pizza.Pizza;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    public abstract Burger createBurger();

    public void orderPizza() {
        System.out.println("Ordering Pizza...");
        Pizza pizza = createPizza();
        pizza.prepare();
    }

    public abstract Pizza createPizza();
}
