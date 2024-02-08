package az.edu.turing.homework4;

import java.util.Scanner;

public class TheFirstIsNotGreaterFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            if (arr[i] <= 2.5) {
                System.out.printf(i + 1 + " %.2f", arr[i]);
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Not Found");
    }
}
