package az.edu.turing.homework3;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {

    public static void main(String[] args) {
        String[][] square = new String[6][6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        int count1 = 0;
        Random random = new Random();
        int x = random.nextInt(5) + 1;
        int y = random.nextInt(5) + 1;

        for (int i = 0; i <= 5; i++) {
            int count = 0;
            for (int j = 0; j <= 5; j++) {
                square[i][j] = "-";
                square[i][0] = String.valueOf(count1);
                square[0][j] = String.valueOf(count);

                count++;
            }
            count1++;
        }

        square[x][y] = "x";
        while (true) {
            System.out.println("Enter a number for line and bar");
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            if (square[row][column].equals("x")) {
                square[row][column] = "*";
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        System.out.print(square[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.println("You have won!");
                break;
            } else {
                square[row][column] = "*";
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        System.out.print(square[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.println("Missed! Try again.");
            }
        }
    }
}
