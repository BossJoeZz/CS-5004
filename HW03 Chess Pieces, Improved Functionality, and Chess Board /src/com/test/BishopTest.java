package com.test;

import com.company.Color;
import com.company.impl.Bishop;
import org.junit.Test;

/**
 * This is the test for Bishop
 *
 */
public class BishopTest {
    /**
     * Test for canMove method
     *
     */

    @Test
    public void testCanMove() {
        Bishop bishop = new Bishop(7, 3, Color.WHITE);
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
     * Test for canKill method
     *
     */
    @Test
    public void testCanKill() {
        Bishop bishop = new Bishop(7, 3, Color.WHITE);
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
