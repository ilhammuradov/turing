package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a + b;

            System.out.println(sum);
        }

        scanner.close();
    }
}
