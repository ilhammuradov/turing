package az.edu.turing.homework4;

import java.util.Scanner;

public class SquareSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        System.out.println(sum);
    }
}
