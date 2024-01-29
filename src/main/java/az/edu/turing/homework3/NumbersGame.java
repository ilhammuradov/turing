package az.edu.turing.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumbersGame {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        System.out.println("Let the game begin!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your guess: ");
        int[] guessednumbers = new int[0];
        while (true) {
            int guess = 0;
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                guessednumbers = Arrays.copyOf(guessednumbers, guessednumbers.length + 1);
                guessednumbers[guessednumbers.length - 1] = guess;
            } else {
                System.out.println("Please enter an integer.");
                scanner.next();
            }
            if (guess < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations, %s", name);
                break;
            }
        }
        System.out.println();
        Arrays.sort(guessednumbers);
        System.out.print("Your guesses: ");
        for (int i = guessednumbers.length - 1; i >= 0; i--) {
            System.out.print(guessednumbers[i] + " ");
        }
    }
}
