package az.edu.turing.homework4;

import java.util.Scanner;

public class Function2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double result = function(x);
            System.out.printf("%.4f\n", result);
        }
    }

    public static double function(double x) {
        return Math.sqrt(x) + 2 * x + Math.sin(x);
    }
}
