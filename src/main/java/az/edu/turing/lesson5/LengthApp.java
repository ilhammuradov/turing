package az.edu.turing.lesson5;


import java.util.Scanner;

public class LengthApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word= scanner.nextLine();
        System.out.println(word.length()*2);
    }
}
