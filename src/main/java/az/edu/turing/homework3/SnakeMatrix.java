package az.edu.turing.homework3;

import java.util.Scanner;

public class SnakeMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = count;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
