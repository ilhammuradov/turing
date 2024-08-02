package factory.Delivery.Creator;

import factory.Delivery.Product.Burger.Burger;
import factory.Delivery.Product.Burger.VeggieBurger;
import factory.Delivery.Product.Pizza.Pizza;
import factory.Delivery.Product.Pizza.VeggiePizza;

public class VeggieProductService extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }

    @Override
    public Pizza createPizza() {
        System.out.println("Creating Veggie Pizza...");
        return new VeggiePizza();
    }
}