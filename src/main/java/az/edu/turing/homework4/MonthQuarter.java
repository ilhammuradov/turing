package az.edu.turing.homework4;

import java.util.Scanner;

public class MonthQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int quarter = (N - 1) / 3 + 1;
        switch (quarter) {
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            case 4:
                System.out.println("Fourth");
                break;
        }
    }
}
