package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class ValueOfVariable6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = (Math.sqrt(Math.pow(x, 4) + 1) / Math.pow(x, 2)) - (Math.sqrt(x * x / (x * x + 1)));
        System.out.printf("%.3f", y);
    }
}
