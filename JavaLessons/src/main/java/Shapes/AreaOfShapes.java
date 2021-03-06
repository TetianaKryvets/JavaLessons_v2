package Shapes;

import Shapes.component.Circle;
import Shapes.component.Rectangle;
import Shapes.component.Square;
import Shapes.component.Triangle;

import javax.swing.JFrame;

// TASK: create  Triangle, Circle, Square and  Rectangle objects which inherit Shape class.
// calculate Area of each shape.
public class AreaOfShapes
{
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5,7,"Triangle");
        print(triangle);

        Triangle triangle1 = new Triangle(3,4,5, "Triangle-1");
        print(triangle1);

        Rectangle rectangle = new Rectangle(2,5, "Rectangle");
        print(rectangle);

        Circle circle = new Circle(10, "Circle");
        print(circle);

        Square square = new Square(7, "Square");
        print(square);

    }

    public static void print(Shape shape) {
        System.out.println("Shape is " + shape.getShapeName() + ", " + "Area = " + shape
                .shapeArea());
    }
}
