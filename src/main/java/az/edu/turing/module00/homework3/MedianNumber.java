package az.edu.turing.module00.homework3;

import java.util.Scanner;

public class MedianNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b && a < c) || (a > c && a < b)) System.out.print(a);
        else if ((b > a && b < c) || (b > c && b < a)) System.out.print(b);
        else System.out.print(c);

    }
}
