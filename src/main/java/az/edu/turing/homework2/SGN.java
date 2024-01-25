package az.edu.turing.homework2;

import java.util.Scanner;

public class SGN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sgn;
        if (x > 0) sgn = 1;
        else if (x == 0) sgn = 0;
        else sgn = -1;
        System.out.print(sgn);
    }
}
