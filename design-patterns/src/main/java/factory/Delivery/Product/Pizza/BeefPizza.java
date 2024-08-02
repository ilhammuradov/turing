package factory.Delivery.Product.Pizza;

public class BeefPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Beef Pizza");
    }
}
