package az.edu.turing.lesson12;

import java.util.Scanner;

public class ReverseStringApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }
    public static  String reverse(String str){
        char[] arr=new char[str.length()];
        int count=0;
        for (int i = str.length()-1; i>=0; i--) {
            arr[count]= str.charAt(i);
            count++;
        }
        return new String(arr);
    }

    public static String reverse2(String str){
        String reversed="";
        for (int i = str.length()-1; i>=0; i--) {
          //reversed+=str.charAt(i);
            reversed=reversed.concat(String.valueOf(str.charAt(i)));
        }
        return reversed;
    }
}
