package az.edu.turing.lesson11;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        String str = s.nextLine();

        System.out.println(f1(str));
        System.out.println(len(f1(str)));

    }
    public static  String f1(String str){
        String name = str.substring(0,  str.indexOf("@"));
        return name;
    }

    public static int len(String name){
        return name.length();
    }
}
