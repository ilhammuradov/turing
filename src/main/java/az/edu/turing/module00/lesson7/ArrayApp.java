package az.edu.turing.module00.lesson7;

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
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] * 2 + " ");
            sum += array[i];
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
        }
        System.out.println("\n" + sum);
        System.out.println("min and max is: " + min + " " + max);
    }
}
