package az.edu.turing.homework4;

import java.util.Scanner;

public class Function5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long z = scanner.nextLong();

        long result = functionValue(x, y, z);
        System.out.println(result);
        scanner.close();
    }

    public static long functionValue(long x, long y, long z) {
        return x * y * z + x + y * y + z * z * z;
    }
}
