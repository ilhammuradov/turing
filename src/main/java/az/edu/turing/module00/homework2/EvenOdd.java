package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) System.out.print("EVEN");
        else System.out.print("ODD");
    }
}
