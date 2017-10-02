package Shapes.component;

/**
 * User: tetiana.kryvets
 * Date: 10/2/17
 */
public class Square extends Rectangle
{
    public Square(int a) {
        super(a,a);
    }

    @Override
    public double shapeArea() {
        return Math.pow(super.getSide(), 2);
    }
    //todo: как сделать одну сторону равной другой


}
