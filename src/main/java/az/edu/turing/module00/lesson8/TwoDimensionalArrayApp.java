package az.edu.turing.module00.lesson8;

import java.util.Scanner;

public class TwoDimensionalArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][3];
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= 3 - 1; j++) {
                arr[i][j] = "#";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
