package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class PreviousOddInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) System.out.print(n - 1);
        else System.out.print(n - 2);
    }
}
