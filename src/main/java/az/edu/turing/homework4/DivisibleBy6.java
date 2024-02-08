package az.edu.turing.homework4;

import java.util.Scanner;

public class DivisibleBy6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            if (k > 0 && k % 6 == 0) {
                sum += k;
                count++;
            }
        }
        System.out.println(count + " " + sum);
    }
}
