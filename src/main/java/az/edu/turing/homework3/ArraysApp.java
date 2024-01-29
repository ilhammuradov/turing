package az.edu.turing.homework3;

import java.util.Random;

public class ArraysApp {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int[] arr = new int[4];
            for (int j = 0; j < 4; j++) {
                arr[j] = random.nextInt(101);
                printArrays(arr);
            }
            System.out.println();
        }
    }

    public static void printArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: " + i + "Value: " + arr[i]);
        }
    }

}
