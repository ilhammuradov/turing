package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class Function1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double result = function(x);
            System.out.printf("%.4f\n", result);
        }
        scanner.close();
    }

    public static double function(double x) {
        return Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
    }
}
