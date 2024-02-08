package az.edu.turing.homework4;

import java.util.Scanner;

public class BitOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((int) ((Math.pow(2, k) + Math.pow(2, n))));
    }
}
