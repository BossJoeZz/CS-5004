package com.test;

import com.model.Color;
import com.model.impl.Bishop;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The BishopTest class is responsible for testing the methods of the Bishop class.
 */
public class BishopTest {
    /**
     * Tests the canMove() method of the Bishop class.
     * This test creates a Bishop object with initial coordinates and Color.
     * Then it tests the canMove() method by passing new coordinates.
     * It prints whether the Bishop can move to the new coordinates.
     */
    @Test
    public void testCanMove() {
        Bishop bishop = new Bishop(7, 3, Color.WHITE);
        assertTrue(bishop.canMove(6,2));
        assertFalse(bishop.canMove(6,3));

        if (bishop.canMove(6, 2)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (bishop.canMove(6, 3)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }
    }

    /**
     * Tests the canKill() method of the Bishop class.
     * This test creates a Bishop object with initial coordinates and Color
     * Then it tests the canKill() method by passing four different Bishop objects with coordinates.
     * Finally, it prints whether the Bishop can kill each of the other Bishop objects.
     */
    @Test
    public void testCanKill() {
        Bishop bishop = new Bishop(7, 3, Color.WHITE);
        assertFalse(bishop.canKill(new Bishop(6, 2, Color.WHITE)));
        assertTrue(bishop.canKill(new Bishop(6, 2, Color.BLACK)));
        assertFalse(bishop.canKill(new Bishop(6, 6, Color.BLACK)));
        assertTrue(bishop.canKill(new Bishop(5, 1, Color.BLACK)));

        if (bishop.canKill(new Bishop(6, 2, Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (bishop.canKill(new Bishop(6, 2, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (bishop.canKill(new Bishop(6, 6, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (bishop.canKill(new Bishop(5, 1, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }
    }

}
