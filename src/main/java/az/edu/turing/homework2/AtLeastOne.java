package az.edu.turing.homework2;

import java.util.Scanner;

public class AtLeastOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2!=0 || (n>=100 && n<=999)) System.out.print("YES");
        else System.out.print("NO");
    }
}
