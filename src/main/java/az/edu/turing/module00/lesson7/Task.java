package az.edu.turing.module00.lesson7;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(a);
    }
}
