package az.edu.turing.homework4;

import java.util.Scanner;

public class Transformation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        while (true) {
            if (n == 1) {
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n += 1;
            }
            count++;
        }

        System.out.println(count);
    }
}
