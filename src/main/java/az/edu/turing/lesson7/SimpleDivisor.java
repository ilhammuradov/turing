package az.edu.turing.lesson7;

import java.util.Scanner;

public class SimpleDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=n;
        if (n <= 1) {
            System.out.println("No simple divisors");
        } else {
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
        System.out.println();
        System.out.println("Even and odd divisors: ");
        for (int i=2;i<=k;i++){
            if(k % i == 0 && i%2==0) System.out.println("even: "+i+" ");
            if(k % i == 0 && i%2!=0) System.out.println("odd: "+i+" ");
        }

    }
}
