package az.edu.turing.lesson5;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        String result = (number >= 1 && number <= 12)
                ? (number <= 6 ? "Spring" : (number <= 9 ? "Summer" : (number <= 11 ? "Autumn" : "Winter")))
                : "Invalid number";

        System.out.println(result);
    }
}
