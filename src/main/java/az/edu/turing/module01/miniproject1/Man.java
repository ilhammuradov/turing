package az.edu.turing.module01.miniproject1;

public final class Man extends Human {

    public Man(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public void repairCar() {
        System.out.println("I can handle this myself. No need for expert");
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }
}
