package az.edu.turing.homework2;

import java.util.Scanner;

public class SameSignNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((n >= 0 && m >= 0) || (n <= 0 && m <= 0)) System.out.print(1);
        else System.out.print(0);
    }
}
