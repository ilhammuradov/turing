package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class Ratio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            sum += digit;
            temp /= 10;
        }
        double ratio = (double) product / sum;
        System.out.printf("%.3f", ratio);
    }
}
