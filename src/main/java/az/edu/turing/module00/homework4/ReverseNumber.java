package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String reversedNumber = reverseNumber(n);
        System.out.println(reversedNumber);
    }

    public static String reverseNumber(long n) {
        StringBuilder reversedNumber = new StringBuilder();
        reversedNumber.append((n));
        reversedNumber.reverse();
        return reversedNumber.toString();
    }
}