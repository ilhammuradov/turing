package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumDivisibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = findminimuminteger(k);
        System.out.println(n);
    }

    public static int findminimuminteger(int k) {
        long sum = 0;
        int n = 0;
        while (true) {
            n++;
            sum += n;
            if (sum >= k && sum % k == 0) {
                return n;
            }
        }
    }
}
