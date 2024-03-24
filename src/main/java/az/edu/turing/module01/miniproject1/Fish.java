package az.edu.turing.module01.miniproject1;

public class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, String[] habits,Species species) {
        super(nickname, age, trickLevel, habits);
        species = Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("...blupp");
    }

    @Override
    public void foul() {

    }
}

