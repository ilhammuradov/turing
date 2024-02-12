package az.edu.turing.module00.lesson5;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        String result = (number >= 1 && number <= 12)
                ? ((number>2 && number <= 5) ? "Spring" : ((number>5 && number <= 8) ? "Summer" : (number>8 && number <= 11 ? "Autumn" : "Winter")))
                : "Invalid number";

        System.out.println(result);
    }
}
