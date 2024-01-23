package az.edu.turing.homework2;

import java.util.Scanner;

public class StreetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) System.out.print(1);
        else System.out.print(0);
    }
}
