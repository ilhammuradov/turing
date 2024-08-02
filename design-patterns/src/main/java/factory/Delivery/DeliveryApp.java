package factory.Delivery;

import factory.Delivery.Creator.BeefProductService;
import factory.Delivery.Creator.Restaurant;
import factory.Delivery.Creator.VeggieProductService;

public class DeliveryApp {

    public static void main(String[] args) {

        Restaurant beefRestaurant = new BeefProductService();
        beefRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieBurgerRestaurant = new VeggieProductService();
        veggieBurgerRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant beefPizzaRestaurant = new BeefProductService();
        beefPizzaRestaurant.orderPizza();

        System.out.println("==========================================");

        Restaurant veggiePizzaRestaurant = new VeggieProductService();
        veggiePizzaRestaurant.orderPizza();
    }
}
