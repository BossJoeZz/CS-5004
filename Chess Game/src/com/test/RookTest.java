package com.test;

import com.model.Color;
import com.model.impl.Rook;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The RookTest class tests the methods of the Rook class.
 */
public class RookTest {

    /**
     * Tests the canMove method of the Rook class.
     */
    @Test
    public void testCanMove() {

        Rook rook = new Rook(7, 6, Color.BLACK);
        assertTrue(rook.canMove(6,6));
        assertTrue(rook.canMove(7,0));

        if (rook.canMove(6, 6)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canMove(7, 0)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canMove(3, 3)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

    }

    /**
     * Tests the canKill method of the Rook class.
     */
    @Test
    public void testCanKill() {

        Rook rook = new Rook(7, 6, Color.BLACK);
        assertTrue(rook.canKill(new Rook(7, 0, Color.WHITE)));
        assertFalse(rook.canKill(new Rook(7, 0, Color.BLACK)));
        assertFalse(rook.canKill(new Rook(6, 3, Color.BLACK)));
        assertFalse(rook.canKill(new Rook(2, 2, Color.BLACK)));

        if (rook.canKill(new Rook(7, 0,Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canKill(new Rook(7, 0,Color.WHITE))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canKill(new Rook(6, 6,Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canKill(new Rook(6, 6,Color.WHITE))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canKill(new Rook(3, 3,Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (rook.canKill(new Rook(3, 3,Color.WHITE))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

    }

}
