package com.test;
import com.model.Color;
import com.model.impl.King;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This tests that the King class can correctly get the row and column, move to a new position,
 * and kill a piece on the board.
 */
public class KingTest {

    /**
     * Test method to verify that the King class can correctly get the row.
     */
    @Test
    public void testGetRow()
    {
        // test class King1 get row is 3
        King king1 = new King(3, 3, Color.BLACK);
        assertEquals(king1.getRow(), 3);

        // test class King1 get row is 2
        King king2 = new King(2, 2, Color.BLACK);
        assertNotEquals(king2.getRow(), 3);

        // test class King1 get row is 4
        King king3 = new King(4, 4, Color.BLACK);
        assertNotEquals(king3.getRow(), 3);
    }

    /**
     * Test method to verify that the King class can correctly get the column.
     */
    @Test
    public void testGetCol()
    {
        // test class King1 get col is 3
        King king1 = new King(3, 3, Color.BLACK);
        assertEquals(king1.getColumn(), 3);

        // test class King2 get col is 2
        King king2 = new King(2, 2, Color.BLACK);
        assertNotEquals(king2.getColumn(), 3);

        // test class King3 get col is 4
        King king3 = new King(4, 4, Color.BLACK);
        assertNotEquals(king3.getColumn(), 3);
    }

    /**
     * Test method to verify that the King class can move to a new position.
     * when called with a valid new position and false when called with an invalid position.
     */
    @Test
    public void testCanMove()
    {
        // test class King2 can move 3,2
        King king1 = new King(3, 3, Color.BLACK);
        assertTrue(king1.canMove(3,2));

        // test class King2 can move 3,2
        King king2 = new King(2, 2, Color.BLACK);
        assertTrue(king1.canMove(3,2));

        // test class King2 can move 4,3
        King king3 = new King(4, 4, Color.BLACK);
        assertTrue(king1.canMove(4,3));
    }

    /**
     * Test method to verify that the King class can correctly kill the piece.
     */
    @Test
    public void testCanKill()
    {
        // test class King2 can kill 3,2
        King king1 = new King(3, 3, Color.BLACK);
        assertTrue(king1.canKill(new King(3, 2,Color.WHITE)));

        // test class King2 can kill 3,2
        King king2 = new King(2, 2, Color.BLACK);
        assertTrue(king1.canKill(new King(3, 2,Color.WHITE)));

        // test class King2 can kill 4,3
        King king3 = new King(4, 4, Color.BLACK);
        assertTrue(king1.canKill(new King(4, 3,Color.WHITE)));
    }

}
