package az.edu.turing.module00.lesson6;

import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double grade = scanner.nextDouble();

        if (grade > 100) {
            System.out.println("wrong");

        } else if (grade > 90) {
            System.out.println("A");

        } else if (grade > 80) {
            System.out.println("B");

        } else if (grade > 70) {
            System.out.println("C");

        } else if (grade > 60) {
            System.out.println("D");

        } else {
            System.out.println("fail");
        }
    }
}
