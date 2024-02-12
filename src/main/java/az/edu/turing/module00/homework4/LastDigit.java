package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 10);
    }
}
