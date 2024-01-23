package az.edu.turing.homework2;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 1000;
        int b = num % 10;
        System.out.print(a + b);
    }
}
