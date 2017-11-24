package Shapes.component;

import Shapes.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, String shapeName) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double shapeArea() {
        return (Math.PI * Math.pow(radius,2));
    }
}
