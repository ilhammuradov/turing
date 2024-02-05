package az.edu.turing.homework4;

import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x + y);
        }
    }
}
