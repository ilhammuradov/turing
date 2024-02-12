package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class Function3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double result = functionValue(x, y);
            System.out.printf("%.4f\n", result);
        }
    }

    public static double functionValue(double x, double y) {
        return Math.pow(x, 2) + Math.sin(x * y) - Math.pow(y, 2);
    }
}
