package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class ValueOfVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = calculateY(x);
        System.out.printf("%.3f", y);
    }

    public static double calculateY(double x) {
        return ((2*x)/Math.sqrt(Math.pow(x,2)+1))-(Math.sqrt(Math.pow(x,2)+1)/Math.pow(x,3));
    }
}