import org.junit.Test;

/**
 * This class contains all the unit tests for Triangle
 */
public class PerimComparatorTest {

    /**
     * test circle's perimeter > triangle's perimeter return positive
     * test circle's perimeter < rectangle's perimeter return nagetive
     * test circle's perimeter = circle's perimeter return zero
     */
    @Test
    public void testPerimComparator() {
        Shape circle = new Circle(2);
        Shape triangle = new Triangle(2 ,2,4,4,6,4);
        Shape rectangle = new Rectangle(2,2,4,4);
        PerimComparator pc = new PerimComparator();

        System.out.println(pc.comparator(circle, triangle));
        System.out.println(pc.comparator(circle, rectangle));
        System.out.println(pc.comparator(rectangle, rectangle));
    }

}
