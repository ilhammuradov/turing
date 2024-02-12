package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class Conditional3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 7) {
            y = (int) Math.pow(x, 3) + 2 * x;
        } else if (x < -4) {
            y = x + 5;
        } else {
            y = (int) Math.pow(x, 2) - (3 * x);
        }
        System.out.print(y);
    }
}
