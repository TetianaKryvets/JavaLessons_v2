package Shapes.component;

import Shapes.Shape;
import com.oracle.jrockit.jfr.InvalidValueException;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

public class Triangle extends Shape
{
    private String shapeName = "Triangle";
    private int sideA;
    private int sideB;
    private int sideC;
    private int height; //the height of the segment from the vertex of the triangle to the side a
    private double semiPerimeter;


    public Triangle(int sideA, int height, String shapeName) {
        super(shapeName);
        this.sideA = sideA;
        this.height = height;
    }

    public Triangle(int sideA, int sideB, int sideC, String shapeName) {
        super(shapeName);
//        if (sideA <= 0){
//            throw new InvalidValueException("Side A cant be negative");
//        }                                                             //todo find exception
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
//    }
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