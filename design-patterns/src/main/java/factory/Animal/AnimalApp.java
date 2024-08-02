package factory.Animal;

import factory.Animal.Creator.AnimalController;
import factory.Animal.Creator.PetFactory;
import factory.Animal.Product.Pet;

public class AnimalApp {
    public static void main(String[] args) {
        AnimalController animalController = new AnimalController(new PetFactory());

        Pet toplan = animalController.adoptPet("dog", "toplan");
        Pet mestan = animalController.adoptPet("cat", "mestan");

        System.out.println(toplan);
        System.out.println(mestan);
    }
}