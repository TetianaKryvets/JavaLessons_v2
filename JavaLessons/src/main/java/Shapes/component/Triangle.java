package Shapes.component;

import Shapes.Shape;

public class Triangle extends Shape
{
    private int height; //the height of the segment from the vertex of the triangle to the side a

    public Triangle(int side, int height) {
        super(side);
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return  (0.5 * super.getSide() * height);
    }
}