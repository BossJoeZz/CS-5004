import org.junit.Test;

/**
 * This class contains all the unit tests for Triangle
 */
public class TriangleTest {

    /*
    * test Triangle's area
    * */
    @Test
    public void testArea() {
        Shape triangle = new Triangle(1, 1, 3,3, 4.5, 4.5);
        System.out.println(triangle.area());
    }

    /*
     * test Triangle's perimeter
     * */
    @Test
    public void testPerimeter() {
        Shape triangle = new Triangle(1, 1, 3,3, 4.5, 4.5);
        System.out.println(triangle.perimeter());
    }

}
