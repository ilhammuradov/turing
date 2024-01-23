package az.edu.turing.homework2;

import java.util.Scanner;

public class EducationalAchievements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String level;
        if (num <= 3) level = "Initial";
        else if (num <= 6) level = "Average";
        else if (num <= 9) level = "Sufficient";
        else level = "High";
        System.out.print(level);
    }
}
