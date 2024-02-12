package az.edu.turing.module00.homework3;

import java.util.Scanner;

public class Rectangle3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= m - 1; j++) {
                arr[i][j] = "#";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
