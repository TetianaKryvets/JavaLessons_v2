package Shapes.component;

import Shapes.Shape;

public class Rectangle extends Shape
{
    private int secondSide; //length of another side of square

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }


    public Rectangle(int side, int secondSide) {
        super(side);
        this.secondSide = secondSide;
    }

    @Override
    public double shapeArea() {
        return super.getSide() * secondSide;
    }
}