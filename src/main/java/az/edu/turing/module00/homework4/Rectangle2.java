package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class Rectangle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] arr = new char[4][n];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] = '#');
            }
            System.out.println();
        }
    }
}
