package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class CoordinateQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int quarter = determineQuarter(x, y);
        System.out.println(quarter);
    }
    public static int determineQuarter(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
