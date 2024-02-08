package az.edu.turing.homework4;

import java.util.Scanner;

public class ArithmeticMeanOfPositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        int countPositive = 0;
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                sum += num;
                countPositive++;
            }
        }
        if (countPositive > 0) {
            double mean = sum / countPositive;
            System.out.printf("%.2f\n", mean);
        } else {
            System.out.println("Not Found");
        }
    }
}

