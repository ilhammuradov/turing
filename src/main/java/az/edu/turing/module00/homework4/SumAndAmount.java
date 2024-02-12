package az.edu.turing.module00.homework4;

import java.util.Scanner;

public class SumAndAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] numbers = inputLine.split(" ");
        int sum = 0;
        int count = numbers.length;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(count + " " + sum);
    }
}
