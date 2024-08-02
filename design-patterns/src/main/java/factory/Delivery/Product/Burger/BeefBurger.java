package factory.Delivery.Product.Burger;

public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger...");
    }
}
