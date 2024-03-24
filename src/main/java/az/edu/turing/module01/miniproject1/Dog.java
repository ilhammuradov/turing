package az.edu.turing.module01.miniproject1;

public class Dog extends Pet{

    public Dog(String nickname,int age,int tricklevel,String[] habits,Species species){
        super(nickname,age,tricklevel,habits);
        species=Species.DOG;
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
