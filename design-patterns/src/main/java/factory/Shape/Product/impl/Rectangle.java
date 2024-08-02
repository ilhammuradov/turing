package factory.Shape.Product.impl;

import factory.Shape.Product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
