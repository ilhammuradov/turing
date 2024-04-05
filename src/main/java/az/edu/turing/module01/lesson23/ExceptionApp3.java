package az.edu.turing.module01.lesson23;

public class ExceptionApp3 {

    public static void main(String[] args) {
        try {
            int result = 1 / 5;
            System.out.println(result);
            System.out.println("Ilham".charAt(10));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Happened!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException happened!");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException happened!");
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
            e.printStackTrace();
        }
    }
}
