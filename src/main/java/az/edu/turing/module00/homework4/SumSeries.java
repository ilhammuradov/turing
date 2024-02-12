package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = calculateSum(n);
        System.out.printf("%.6f", sum);
    }

    public static double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i<= n; i++) {
            sum += (double) 1 / ((i + 1) * i);
        }
        return sum;
    }
}
