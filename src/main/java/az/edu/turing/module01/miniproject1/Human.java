package az.edu.turing.module01.miniproject1;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.printf("Hello, %s", family.getPet().getNickname());
    }

    public void describePet() {
        Pet pet = family.getPet();
        if (pet.getTrickLevel() > 50) {
            System.out.printf("I have a %s is %d years old, he is very sly", pet.getSpecies(), pet.getAge());
        } else System.out.printf("I have an %s is %d years old, he is almost not sly", pet.getSpecies(), pet.getAge());
    }

    public boolean feedPet(boolean isFeedingTime) {
        Pet pet = family.getPet();
        if (isFeedingTime || pet.getTrickLevel() > (int) (Math.random() * 100)) {
            System.out.println("Hm... I will feed " + pet.getNickname());
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dateOfBirth, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
