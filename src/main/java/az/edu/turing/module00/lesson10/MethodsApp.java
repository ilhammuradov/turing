package az.edu.turing.module00.lesson10;

import java.util.Scanner;

public class MethodsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        doubleArray(d);
        int i = scanner.nextInt();
        integerArray(i);
    }
    public static void doubleArray(double d){
        System.out.println(d + 2);
    }

    public static void integerArray(int i) {
        System.out.println(i + 2);
    }
}

