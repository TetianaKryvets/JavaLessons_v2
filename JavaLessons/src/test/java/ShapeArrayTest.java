import Shapes.component.Rectangle;
import Shapes.component.Triangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * User: tetiana.kryvets
 * Date: 10/6/17
 */
public class ShapeArrayTest {

    @Test
    public void testAreaIsCorrect() {
        assertEquals("Area of triangle is incorrect", 6.0, (new Triangle(3,4,5,"Triangle")).shapeArea());
        assertEquals("Area of triangle is incorrect", 7.5, (new Triangle(3,5,"Triangle")).shapeArea());
        assertEquals("Area of triangle is incorrect", 10.0, (new Rectangle(2,-5,"Rectangle")).shapeArea());
    }


}
