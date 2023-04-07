import com.model.Player;
import com.view.View;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

/**
 * as a test for class View
 */
public class ViewTest {

    View view;

    @Before
    public void setUp() {
        view = new View() {
            @Override
            public Player[][] getGrid() {
                return new Player[0][];
            }

            @Override
            public Player getMarkAt(int column, int row) {
                return null;
            }
        };
    }

    // Verify that grid
    @Test
    public void getGridTest1() {
        // test object view's grid(0, 0) is X
        assertSame(view.getGrid()[0][0].toString(), "X");
        // test object view's grid(1, 1) is X
        assertSame(view.getGrid()[1][1].toString(), "X");
    }

    // Verify that grid
    @Test
    public void getGridTest2() {
        // test object view's grid(2, 0) is O
        assertSame(view.getGrid()[2][0].toString(), "O");
        // test object view's grid(2, 1) is O
        assertSame(view.getGrid()[2][1].toString(), "O");
    }

    // Verify that the grid's point is X or O
    @Test
    public void getMarkAtTest1() {
        // test the grid's point(1, 1) is X
        assertSame(view.getMarkAt(1, 1).toString(), "X");

        // test the grid's point(-1, -1) can not get
        try {
            view.getMarkAt(-1, -1);
        } catch (IndexOutOfBoundsException ex) {
            assertSame(ex.toString(), "java.util.IndexOutOfBoundsException");
        }
    }

    // Verify that the grid's point is X or O
    @Test
    public void getMarkAtTest2() {
        // test the grid's point(1, 1) is O
        assertSame(view.getMarkAt(1, 1).toString(), "O");

        // test the grid's point(3, 3) can not get
        try {
            view.getMarkAt(3, 3);
        } catch (IndexOutOfBoundsException ex) {
            assertSame(ex.toString(), "java.util.IndexOutOfBoundsException");
        }
    }

}
