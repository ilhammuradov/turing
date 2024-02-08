package az.edu.turing.homework4;

import java.util.Scanner;

public class Function4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long result = functionValue(x);
        System.out.println(result);
    }

    public static long functionValue(long x) {
        return 1 + x + x * x;
    }
}
