package factory.Animal.Creator;

import factory.Animal.Product.Pet;
import factory.Animal.Product.impl.Cat;
import factory.Animal.Product.impl.Dog;

public class PetFactory {

    public Pet createPet(String animalType) {
        return switch (animalType.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new UnsupportedOperationException("unknown animal type");
        };
    }
}