package az.edu.turing.module01.miniproject1;

import java.util.Set;

public class RoboCat extends Pet {

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits, Species species) {
        super(nickname, age, trickLevel, habits);
        species = Species.CAT;
    }

    @Override
    public void respond() {
        System.out.println("Beep boop! I am a robocat, " + getNickname());
    }

    @Override
    public void foul() {

    }
}