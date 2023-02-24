package com.test;

import com.company.Color;
import com.company.impl.Rook;
import org.junit.Test;

public class RookTest {

    /**
     * test for canMove method
     *
     */
    @Test
    public void testCanMove() {

        Rook rook = new Rook(7, 6, Color.BLACK);
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
     * test for canKill method
     *
     */
    @Test
    public void testCanKill() {

        Rook rook = new Rook(7, 6, Color.BLACK);
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
