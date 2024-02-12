package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class Conditional1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x < 5) {
            y = (int) (Math.pow(x,2) - (3 * x) + 4);
        } else {
            y = x + 7;
        }
        System.out.print(y);
    }
}
