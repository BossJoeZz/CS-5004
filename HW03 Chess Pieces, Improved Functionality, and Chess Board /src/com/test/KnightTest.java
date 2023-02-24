package com.test;

import com.company.Color;
import com.company.impl.Bishop;
import com.company.impl.Knight;
import org.junit.Test;

public class KnightTest {

    /**
     * test for canMove method
     *
     */
    @Test
    public void testCanMove() {
        Knight knight = new Knight(7, 3, Color.WHITE);
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
     * test for canKill method
     *
     */
    @Test
    public void testCanKill() {
        Knight knight = new Knight(7, 3, Color.WHITE);
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
