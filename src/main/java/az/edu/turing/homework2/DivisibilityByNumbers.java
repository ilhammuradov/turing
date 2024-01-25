package az.edu.turing.homework2;

import java.util.Scanner;

public class DivisibilityByNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n % a == 0 && n % b == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
