package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 10;
        int b = num % 10;
        System.out.print(a + " " + b);
    }
}
