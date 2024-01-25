package az.edu.turing.homework2;

import java.util.Scanner;

public class OutsideTheInterval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (x >= a && x <= b) System.out.print("IN");
        else System.out.print("OUT");
    }
}
