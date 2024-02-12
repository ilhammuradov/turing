package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class TwoDigitNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n / 10 == 0) System.out.print("No");
        else if (n / 100 == 0) System.out.print("Ok");
        else System.out.print("No");
    }
}
