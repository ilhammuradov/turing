package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumOfOddSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k % 2 != 0) {
                sum += k;
                System.out.println(sum);
            }
        }
    }
}
