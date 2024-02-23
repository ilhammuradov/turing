package az.edu.turing.module01.lesson16;

import java.util.Random;

public class ReplacementApp {

    public static void main(String[] args) {
        int numberOfPersons = 17;
        boolean[] assignedNumbers = new boolean[17];
        String[] names = {"Kanan", "Ilham", "Nurlan", "Aydan", "Selen", "Farid K", "Aybeniz", "Nazrin", "Bashir", "Vusal", "Farid H", "Osman", "Eldar", "Bahruz", "Taleh", "Ali", "Leyla"};
        Random random = new Random();
        for (int i = 0; i < numberOfPersons; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(17);
            } while (assignedNumbers[randomNumber]);
            assignedNumbers[randomNumber] = true;
            System.out.println(names[i] + " has been assigned the place: " + randomNumber);
        }
    }
}
