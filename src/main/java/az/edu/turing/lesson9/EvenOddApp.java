package az.edu.turing.lesson9;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        double k = Math.PI;
        System.out.println("Perimeter: " + 4 * n);
        System.out.println("Area: " + n * n);
        System.out.println("Length  : " + 2 * k * r);
        System.out.println("Area : " + k * r * r);
    }
}
