package Shapes.component;

import Shapes.Shape;

public class Rectangle extends Shape
{
    //private String shapeName;
    protected int sideA;
    protected int sideB;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }


    public Rectangle(int sideA, int sideB, String shapeName) {
        super(shapeName);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double shapeArea() {
        return sideA * sideB;
    }
}