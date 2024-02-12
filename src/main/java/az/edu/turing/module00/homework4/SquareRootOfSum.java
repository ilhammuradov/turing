package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        int sum = digit1 + digit2 + digit3;
        double squareRoot = Math.sqrt(sum);
        System.out.printf("%.3f", squareRoot);
    }
}

