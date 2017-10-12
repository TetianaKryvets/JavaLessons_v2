package Shapes;

public abstract class Shape
{
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double shapeArea();

    public String getShapeName() {
        return shapeName;
    }

}
