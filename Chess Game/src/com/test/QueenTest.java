package com.test;

import com.model.Color;
import com.model.impl.Queen;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The QueenTest class tests the functionalities of the Queen class.
 */
public class QueenTest {

    /**
     * This test checks whether the queen can move to a given square or not.
     */
    @Test
    public void testCanMove() {
        Queen queen = new Queen(7, 4, Color.WHITE);
        assertTrue(queen.canMove(5,4));
        assertTrue(queen.canMove(7,0));

        if (queen.canMove(5, 4)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (queen.canMove(7, 0)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (queen.canMove(6, 3)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (queen.canMove(6, 6)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (queen.canMove(3, 6)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }
    }

    /**
     * This test checks whether the queen can kill another piece or not.
     */
    @Test
    public void testCanKill() {
        Queen queen = new Queen(7, 4, Color.WHITE);
        assertFalse(queen.canKill(new Queen(0, 4, Color.WHITE)));
        assertTrue(queen.canKill(new Queen(7, 2, Color.BLACK)));
        assertTrue(queen.canKill(new Queen(6, 3, Color.BLACK)));
        assertFalse(queen.canKill(new Queen(2, 2, Color.BLACK)));


        if (queen.canKill(new Queen(0, 4, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(7, 2, Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(7, 2, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(7, 2, Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(6, 3, Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(6, 3, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(2, 2, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if (queen.canKill(new Queen(3, 2, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }
    }

}
