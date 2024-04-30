package az.edu.turing.module01.miniproject1;

import java.util.Set;

public class DomesticCat extends Pet {

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits, Species species) {
        super(nickname, age, trickLevel, habits);
        species = Species.CAT;
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
