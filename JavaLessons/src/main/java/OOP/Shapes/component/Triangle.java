package OOP.Shapes.component;

import OOP.Shapes.Shape;

public class Triangle extends Shape
{
    private int sideA;
    private int sideB;
    private int sideC;
    private int height; //the height of the segment from the vertex of the triangle to the side a
    private double semiPerimeter;


    public Triangle(int sideA, int height, String shapeName) throws IllegalArgumentException{
        super(shapeName);
        if ((sideA < 0)||(height < 0)) {
            throw new IllegalArgumentException("Triangle side or height can't be negative");
        }
        this.sideA = sideA;
        this.height = height;
    }

    public Triangle(int sideA, int sideB, int sideC, String shapeName) throws IllegalArgumentException{
        super(shapeName);
        if ((sideA <= 0) || (sideB <= 0)|| (sideB <= 0)) {
            throw new IllegalArgumentException("Triangle side can't be negative");
        }else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

    }

    @Override
    public double shapeArea() {

        if (height != 0) {
            return  (0.5 * sideA * height);
        } else {
            semiPerimeter = (sideA + sideB + sideC)/2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter -
                    sideC));
        }

    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
}