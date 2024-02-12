package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = num / 100;
        int b = num % 10;
        if (a > b) System.out.print(a);
        else if (b > a) System.out.println(b);
        else System.out.print("=");


    }
}
