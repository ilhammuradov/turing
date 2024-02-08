package az.edu.turing.homework4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long reversedNumber = reverseNumber(n);
        System.out.println(reversedNumber);
        scanner.close();
    }
    public static long reverseNumber(long n) {
        long reversedNumber = 0;
        while (n != 0) {
            long digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        return reversedNumber;
    }
}
