package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int p = 1;
        while (num > 0) {
            p *= num % 10;
            num /= 10;
        }
        System.out.print(p);
    }
}
