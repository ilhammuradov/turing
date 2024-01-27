package az.edu.turing.homework3;

import java.util.Scanner;

public class Function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        float max1 = Math.max(x, y);
        float max2 = Math.max(y, z);
        float total = x + y + z;
        float min1 = Math.min(max1, max2);
        float min2 = Math.min(min1, total);
        System.out.printf("%.2f", min2);
    }
}
