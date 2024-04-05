package az.edu.turing.module01.lesson23;

import java.util.Scanner;

public class ExceptionApp2 {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final String line1 = in.nextLine();
        final String line2 = in.nextLine();

        final int number1 = Integer.parseInt(line1);
        final int number2 = Integer.parseInt(line2);
        int result = number1 / number2;

        System.out.println(result);
    }
}
