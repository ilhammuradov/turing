package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SquaresOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
