import Shapes.component.Rectangle;
import Shapes.component.Triangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * User: tetiana.kryvets
 * Date: 10/6/17
 */
public class ShapeArrayTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAreaIsCorrect() {
        assertEquals("Area of triangle is incorrect", (new Triangle(-5, 7,-5)).shapeArea(), 17.5);
        assertEquals("Area of triangle is incorrect", (new Triangle(3,4,5)).shapeArea(), 6.0);
        assertEquals("Area of triangle is incorrect", (new Rectangle(-2,5)).shapeArea(), 10);




    }


}
