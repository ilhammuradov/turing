package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class PrintArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            System.out.println(x);
        }
    }
}
