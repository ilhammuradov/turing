package az.edu.turing.module01.miniproject1;

public class FamilyApp {

    public static void main(String[] args) {

        Pet pet1=new Pet("dog","boby");
        pet1.setNickname("toby");
        String[] habits={"eat","drink","sleep"};
        pet1.setHabits(habits);
        pet1.setAge(5);
        pet1.setTrickLevel(75);
        Human mother=new Human("Jane","Karleone",1955);
        Human father=new Human("Vito","Karleone",1953);
        Human child=new Human("Michael","Karleone",1977);
        child.setIq(90);
        child.setPet(pet1);
        child.setFather(father);
        child.setMother(mother);
        child.greetPet();
        System.out.println();
        child.describePet();
        System.out.println();
        System.out.println(child);
        System.out.println();

        boolean isFeedingTime = true;
        boolean isFed = child.feedPet(isFeedingTime);
        System.out.println("Was the pet fed? " + isFed);
    }
}
