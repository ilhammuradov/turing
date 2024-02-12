package az.edu.turing.module00.homework2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result;
        if (num > 0) result = "Positive";
        else if (num < 0) result = "Negative";
        else result = "Zero";
        System.out.print(result);
    }
}
