package az.edu.turing.module01.lesson15;

public class SquareApp {

    public static void main(String[] args) {

        Square square1=new Square(6);
        square1.setColor("pink");
        System.out.println("color: "+square1.getColor()+" "+"length: "+square1.calculateLength()+" "+"area: "+square1.calculateArea());
        System.out.println(Square.countOfSquares);
    }
}
