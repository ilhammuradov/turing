package factory.Delivery.Product.Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie Pizza");
    }
}
