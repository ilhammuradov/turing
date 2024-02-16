package az.edu.turing.module01.lesson15;

public class Circle {

   private double radius;
   private String color;

   public static long countOfCircles;


    public Circle(double radius){
        this.radius=radius;
        countOfCircles++;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) this.color=color;
    }

    public double calculateLength(){
        return 2*Math.PI*this.radius;
    }
}









