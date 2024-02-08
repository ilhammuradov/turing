package az.edu.turing.homework4;

import java.util.Scanner;

public class SumDivisibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = findMinimumInteger(k);
        System.out.println(n);
    }

    public static int findMinimumInteger(int k) {
        int n = 1;
        while (true) {
            int sum = n * (n + 1) / 2;
            if (sum % k == 0) {
                return n;
            }
            n++;
        }
    }
}
