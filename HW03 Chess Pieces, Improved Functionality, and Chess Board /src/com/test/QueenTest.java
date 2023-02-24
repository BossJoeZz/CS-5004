package com.test;

import com.company.Color;
import com.company.impl.Queen;
import org.junit.Test;

public class QueenTest {

    /**
     * test for canMove method
     *
     */
    @Test
    public void testCanMove() {
        Queen queen = new Queen(7, 4, Color.WHITE);
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
     * test for canKill method
     *
     */
    @Test
    public void testCanKill() {
        Queen queen = new Queen(7, 4, Color.WHITE);
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
