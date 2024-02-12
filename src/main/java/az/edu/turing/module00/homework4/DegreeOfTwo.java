package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class DegreeOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = isPowerOfTwo(n) ? "YES" : "NO";
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n) {
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
