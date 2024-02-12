package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class OddElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
