import com.control.Control;
import com.model.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * as a test for class Control
 */
public class ControlTest {

    Control control;
    @Before
    public void setUp() {
        control = new Control() {
            @Override
            public void move(int column, int row) {

            }

            @Override
            public boolean isXsTurn() {
                return false;
            }

            @Override
            public boolean isYsTurn() {
                return false;
            }

            @Override
            public String nextPlayer() {
                return null;
            }

            @Override
            public boolean isGameOver() {
                return false;
            }

            @Override
            public Player getWinner() {
                return null;
            }
        };
    }

    // Verify that TTT move correctly
    @Test
    public void moveTest1() {
        // test object control's point(1, 2) can move
        control.move(1, 2);

        // test object control's point(3, 3) can not move
        try {
            control.move(3, 3);
        } catch (IllegalStateException ex) {
            assertSame(ex.toString(), "java.util.IllegalStateException");
        }
    }

    // Verify that TTT move correctly
    @Test
    public void moveTest2() {
        // test object control's point(2, 2) can move
        control.move(2, 2);

        // test object control's point(3, 3) can not move
        try {
            control.move(3, 3);
        } catch (IndexOutOfBoundsException ex) {
            assertSame(ex.toString(), "java.util.IndexOutOfBoundsException");
        }
    }

    // Verify that TTT's next turn
    @Test
    public void isXsTurnTest1() {
        // test object control's next turn  is x
        assertTrue(control.isXsTurn());

        // test object control's next turn is not x
        assertFalse(control.isXsTurn());
    }

    // Verify that TTT's next turn
    @Test
    public void isXsTurnTest2() {
        // test object control's next turn  is x
        assertTrue(control.isXsTurn());

        // test object control's next turn is not x
        assertFalse(control.isXsTurn());
    }

    // Verify that TTT's next turn
    @Test
    public void isYsTurnTest1() {
        // test object control's next turn  is Y
        assertTrue(control.isYsTurn());

        // test object control's next turn is not Y
        assertFalse(control.isYsTurn());
    }

    // Verify that TTT's next turn
    @Test
    public void isYsTurnTest2() {
        // test object control's next turn  is Y
        assertTrue(control.isYsTurn());

        // test object control's next turn is not Y
        assertFalse(control.isYsTurn());
    }

    // Verify that nextPlayer is X or O
    @Test
    public void nextPlayerTest1() {
        // test object control's nextPlayer is X
        assertEquals(control.nextPlayer(), (String)"X");
        // test object control's nextPlayer is Y
        assertEquals(control.nextPlayer(), (String)"O");
    }

    // Verify that nextPlayer is X or O
    @Test
    public void nextPlayerTest2() {
        // test object control's nextPlayer is X
        assertEquals(control.nextPlayer(), (String)"X");
        // test object control's nextPlayer is Y
        assertEquals(control.nextPlayer(), (String)"O");
    }

    // Verify that game is over
    @Test
    public void isGameOverTest1() {
        // test object control is over
        assertTrue(control.isGameOver());
        // test object control is not over
        assertFalse(control.isGameOver());
    }

    // Verify that game is over
    @Test
    public void isGameOverTest2() {
        // test object control is over
        assertTrue(control.isGameOver());
        // test object control is not over
        assertFalse(control.isGameOver());
    }

    // Verify that winner is X or O
    @Test
    public void getWinnerTest1() {
        // test that winner is  X
        assertSame(control.getWinner().toString(), "X");

        // test that winner is null, as TTT not over
        try {
            control.getWinner();
        } catch (IllegalStateException ex) {
            assertSame(ex.toString(), "java.util.IllegalStateException");
        }
    }

    // Verify that winner is X or O
    @Test
    public void getWinnerTest2() {
        // test that winner is  O
        assertSame(control.getWinner().toString(), "O");

        // test that winner is null, as TTT not over
        try {
            control.getWinner();
        } catch (IllegalStateException ex) {
            assertSame(ex.toString(), "java.util.IllegalStateException");
        }
    }

}
