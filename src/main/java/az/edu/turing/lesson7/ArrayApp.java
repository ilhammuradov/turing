package az.edu.turing.lesson7;

import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] * 2 + " ");
            sum += array[i];
        }
        System.out.println("\n" + sum);
    }
}
