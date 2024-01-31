package az.edu.turing.lesson10;

public class CharMethodApp {

    public static void main(String[] args) {
        char[] arr = {'x', 'y', 'z', 'k'};
        print(arr);
    }

    public static void print(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
