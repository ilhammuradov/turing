package az.edu.turing.homework2;

import java.util.Scanner;

public class Conditional2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Long y;
        if (x >= 10) {
            y = (long) (Math.pow(x, 3) + 5L * x);
        } else {
            y = (long) (Math.pow(x, 2) - (2L * x) + 4);
        }
        System.out.print(y);
    }
}
