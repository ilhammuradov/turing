package factory.Delivery.Creator;

import factory.Delivery.Product.Burger.BeefBurger;
import factory.Delivery.Product.Burger.Burger;
import factory.Delivery.Product.Pizza.BeefPizza;
import factory.Delivery.Product.Pizza.Pizza;

public class BeefProductService extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }

    @Override
    public Pizza createPizza() {
        System.out.println("Creating Beef Pizza...");
        return new BeefPizza();
    }
}
