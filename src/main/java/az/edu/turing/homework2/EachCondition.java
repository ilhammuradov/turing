package az.edu.turing.homework2;

import java.util.Scanner;

public class EachCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = Math.abs(n);
        if (n % 6 == 0 && (n >= 10 && n <= 99)) System.out.print("YES");
        else System.out.print("NO");
    }
}
