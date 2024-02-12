package az.edu.turing.module00.lesson10;

import java.util.Scanner;

public class StringApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.indexOf("k"));
        System.out.println(s.substring(4));
    }
}
