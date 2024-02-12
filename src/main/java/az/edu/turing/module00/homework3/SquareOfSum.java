package az.edu.turing.module00.homework3;

import java.util.Scanner;

public class SquareOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 10;
        int b = n % 10;
        System.out.print((int) Math.pow(a + b, 2));
    }
}
