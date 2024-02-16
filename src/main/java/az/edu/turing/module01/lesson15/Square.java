package az.edu.turing.module01.lesson15;

public class Square {

    public static long countOfSquares;
    private final double side;
    private String color;

    public Square(double side) {
        this.side = side;
        countOfSquares++;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) this.color = color;
    }

    public double calculateLength() {
        return this.side * 4;
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
