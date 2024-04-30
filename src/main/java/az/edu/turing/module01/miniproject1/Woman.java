package az.edu.turing.module01.miniproject1;

final class Woman extends Human {
    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public void applyMakeup() {
        System.out.println("I am ready for 5 minutes... years passed");
    }


    @Override
    public void greetPet(Pet pet) {
        super.greetPet(pet);
    }
}