package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) System.out.print(b + " " + a);
        else System.out.print(a + " " + b);
    }
}
