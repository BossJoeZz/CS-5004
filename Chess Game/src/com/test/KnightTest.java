package com.test;

import com.model.Color;
import com.model.impl.Knight;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 The KnightTest class tests the functionality of the canMove and canKill methods in the Knight class.
 */
public class KnightTest {

    /**
     * This method tests the canMove method of the Knight class.
     */
    @Test
    public void testCanMove() {
        Knight knight = new Knight(7, 3, Color.WHITE);
        assertTrue(knight.canMove(6,1));
        assertFalse(knight.canMove(6,3));

        if (knight.canMove(6, 1)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (knight.canMove(6, 3)) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }
    }

    /**
     * This method tests the canKill method of the Knight class.
     */
    @Test
    public void testCanKill() {
        Knight knight = new Knight(7, 3, Color.WHITE);

        assertFalse(knight.canKill(new Knight(6, 1, Color.WHITE)));
        assertTrue(knight.canKill(new Knight(6, 1, Color.BLACK)));
        assertTrue(knight.canKill(new Knight(6, 1, Color.BLACK)));
        assertFalse(knight.canKill(new Knight(7, 6, Color.BLACK)));

        if (knight.canKill(new Knight(6, 1, Color.WHITE))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (knight.canKill(new Knight(6, 1, Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (knight.canKill(new Knight(6, 1, Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }

        if (knight.canKill(new Knight(7, 6, Color.BLACK))) {
            System.out.println("canMove");
        } else {
            System.out.println("cannotMove");
        }
    }

}
