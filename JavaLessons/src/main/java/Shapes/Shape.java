package Shapes;

public abstract class Shape
{
    protected String shapeName;

    public Shape() {}

    public abstract double shapeArea();

    public String getShapeName() {
        return shapeName;
    }

}
