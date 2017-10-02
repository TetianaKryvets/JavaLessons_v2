package Shapes.component;

import Shapes.Shape;

public class Circle extends Shape


{
    public Circle(int radius) {
        super(radius);
        //a will be radius of circle
    }

    @Override
    public double shapeArea() {
        return (Math.PI * Math.pow(super.getSide(),2));
    }
}
