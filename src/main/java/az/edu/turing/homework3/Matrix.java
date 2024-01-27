package az.edu.turing.homework3;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int count = 1;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                arr[i][j] = count;
                System.out.print(arr[i][j] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
