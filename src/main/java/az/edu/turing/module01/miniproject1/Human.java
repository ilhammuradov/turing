package az.edu.turing.module01.miniproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Human {

    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Family family;

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, String birthDateStr, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(birthDateStr);
        this.birthDate = date.getTime();
        this.iq = iq;
    }

    public void greetPet(Pet pet) {
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet(Pet pet) {
        if (pet.getTrickLevel() > 50) {
            System.out.printf("I have a %s is %d years old, he is very sly", pet.getSpecies(), pet.getAge());
        } else System.out.printf("I have an %s is %d years old, he is almost not sly", pet.getSpecies(), pet.getAge());
    }

    public boolean feedPet(Pet pet, boolean isFeedingTime) {
        if (isFeedingTime || pet.getTrickLevel() > (int) (Math.random() * 100)) {
            System.out.println("Hm... I will feed " + pet.getNickname());
            return true;
        } else {
            System.out.println("I think " + pet.getNickname() + " is not hungry.");
            return false;
        }
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String describeAge() {
        long now = System.currentTimeMillis();
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTimeInMillis(birthDate);
        int birthYear = birthCal.get(Calendar.YEAR);
        birthCal.clear();
        birthCal.set(Calendar.YEAR, birthYear);
        long birthInMillis = birthCal.getTimeInMillis();
        long ageInMillis = now - birthInMillis;
        long yearsInMillis = ageInMillis / (1000L * 60 * 60 * 24 * 365);
        long remainingMillis = ageInMillis % (1000L * 60 * 60 * 24 * 365);
        long monthsInMillis = remainingMillis / (1000L * 60 * 60 * 24 * 30);
        remainingMillis %= (1000L * 60 * 60 * 24 * 30);
        long daysInMillis = remainingMillis / (1000L * 60 * 60 * 24);

        return String.format("%d years, %d months, %d days", yearsInMillis, monthsInMillis, daysInMillis);
    }


    public int getBirthYear() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date(birthDate);
        return Integer.parseInt(dateFormat.format(date));
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + describeAge() +
                ", iq=" + iq +
                ", family=" + family +
                '}';
    }
}

