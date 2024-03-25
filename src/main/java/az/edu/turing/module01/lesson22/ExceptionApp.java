package az.edu.turing.module01.lesson22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionApp {

    public static String inputString() {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                scanner.close();
                throw new FileNotFoundException();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found,input a string");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
    }

    public static int computeSequence(String input) {
        try {
            int sum = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                try {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Input is wrong.");
                }
            }
            int divisor;
            try {
                divisor = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Input is wrong.");
            }
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return sum / divisor;
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        String string = inputString();
        System.out.println(computeSequence(string));
    }
}
