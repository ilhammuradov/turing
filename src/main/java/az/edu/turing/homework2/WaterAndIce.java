package az.edu.turing.homework2;

import java.util.Scanner;

public class WaterAndIce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > 0) System.out.print("Water");
        else System.out.print("Ice");
    }
}
