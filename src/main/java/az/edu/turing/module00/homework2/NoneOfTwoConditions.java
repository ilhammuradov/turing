package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class NoneOfTwoConditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n % 2 == 0 && n >= 0) || (n <= 0 && n % 2 != 0)) System.out.print("NO");
        else System.out.print("YES");
    }
}
