package com.test;

import com.company.Color;
import com.company.impl.Bishop;
import org.junit.Test;

public class BishopTest {

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
