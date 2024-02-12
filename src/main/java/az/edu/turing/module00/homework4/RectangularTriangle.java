package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class RectangularTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isRectangular = isRectangularTriangle(a, b, c);

        if (isRectangular) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean isRectangularTriangle(int a, int b, int c) {
        if (c > b) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        return a * a == b * b + c * c;
    }
}
