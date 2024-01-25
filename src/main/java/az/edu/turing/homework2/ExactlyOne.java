package az.edu.turing.homework2;

import java.util.Scanner;

public class ExactlyOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n % 2 == 0 && n >= 0) || (n < 0 && n % 3 == 0 && n % 2 != 0)) System.out.print("YES");
        else System.out.print("NO");
    }
}
