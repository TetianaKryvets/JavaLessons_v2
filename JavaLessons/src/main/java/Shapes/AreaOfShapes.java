package Shapes;

import Shapes.component.Circle;
import Shapes.component.Rectangle;
import Shapes.component.Square;
import Shapes.component.Triangle;

import javax.swing.JFrame;

public class AreaOfShapes
{
    public static void main(String[] args) {
        // Создаем объект родительского класса, который будет работать с классами потомками
        Shape triangle = new Triangle(5,7);
        System.out.println("Area of triangle = " + triangle.shapeArea());

        Shape rectangle = new Rectangle(2,5);
        System.out.println("Area of rectangle = " + rectangle.shapeArea());

        Shape circle = new Circle(10);
        System.out.println("Area of circle = " + circle.shapeArea());

        Shape square = new Square(7);
        System.out.println("Area of square = " + square.shapeArea());

    }
}
