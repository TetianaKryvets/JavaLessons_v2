package Shapes;

public abstract class Shape
{
    private int side; //lenth of one side for shape (or radius for circle)

    public Shape(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setA() {
        this.side = side;
    }

    public abstract double shapeArea();

}
