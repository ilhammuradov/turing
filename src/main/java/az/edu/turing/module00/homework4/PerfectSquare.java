package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double d = Math.sqrt(x);
        if (d == (int) d) System.out.println((int) d);
        else System.out.println("No");
    }
}
