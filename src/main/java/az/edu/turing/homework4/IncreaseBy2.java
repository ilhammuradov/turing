package az.edu.turing.homework4;

import java.util.Scanner;

public class IncreaseBy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k >= 0) {
                System.out.print(k + 2);
            } else {
                System.out.print(k);
            }
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
    }
}
