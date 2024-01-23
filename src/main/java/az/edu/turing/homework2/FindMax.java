package az.edu.turing.homework2;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int k = Math.max(a, b);
        int m = Math.max(c, d);
        System.out.print(Math.max(k, m));
    }
}
