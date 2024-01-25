package az.edu.turing.homework2;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.print("Divisible");
        } else {
            System.out.print(a / b + " " + a % b);
        }
    }
}
