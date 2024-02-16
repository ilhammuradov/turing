package az.edu.turing.module01.lesson15;

public class Square {

  private   String color;
   private final double side;
   public static long countOfSquares;

   public Square(double side){
       this.side=side;
       countOfSquares++;
   }

    public double getSide() {
        return side;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) this.color=color;
    }

    public String getColor() {
        return color;
    }

    public double calculateLength(){
        return this.side*4;
    }

    public double calculateArea(){
        return this.side*this.side;
    }
}
