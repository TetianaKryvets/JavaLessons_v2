package ShapesWithInterfaces;

/**
 * User: tetiana.kryvets
 * Date: 10/10/17
 */
class Triangle implements Shape{
    private String shapeName = "Triangle";
    private int sideA;
    private int sideB;
    private int sideC;
    private int height; //the height of the segment from the vertex of the triangle to the side a
    private double semiPerimeter;

    public Triangle(int sideA, int height) {
        super();
        this.sideA = sideA;
        this.height = height;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double shapeArea() {

        if (height != 0) {
            return  (0.5 * sideA * height);
        } else {
            semiPerimeter = (sideA + sideB + sideC)/2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter -
                    sideC));
        }

    }

    public String getShapeName() {
        return shapeName;
    }


}
