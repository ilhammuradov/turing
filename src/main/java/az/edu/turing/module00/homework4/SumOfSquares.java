package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = a * a + b * b;
        System.out.println(result);
    }
}