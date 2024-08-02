package factory.Animal.Creator;

import factory.Animal.Product.Pet;

public class AnimalController {
    private final PetFactory petFactory;

    public AnimalController(PetFactory petFactory) {
        this.petFactory = petFactory;
    }

    public Pet adoptPet(String type, String name) {
        Pet pet = this.petFactory.createPet(type);
        pet.setName(name);
        pet.feed();
        return pet;
    }
}
