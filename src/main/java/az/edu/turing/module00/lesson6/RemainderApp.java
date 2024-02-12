package az.edu.turing.module00.lesson6;

import java.util.Scanner;

public class RemainderApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a % b);
    }
}
