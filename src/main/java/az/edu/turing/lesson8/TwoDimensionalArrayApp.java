package az.edu.turing.lesson8;

import java.util.Scanner;

public class TwoDimensionalArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                arr[i][j] = n;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
