package com.test;

import com.company.Color;
import com.company.impl.Pawn;
import org.junit.Test;

public class PawnTest {

    /**
     * test for canMove method
     *
     */
    @Test
    public void testCanMove() {
        Pawn pawn = new Pawn(7, 1, Color.WHITE);
        if(pawn.canMove(6,1)) {
            System.out.println("canMove");
        } else {
            System.out.println("connotMove");
        }

        if(pawn.canMove(8,1)) {
            System.out.println("canMove");
        } else {
            System.out.println("connotMove");
        }
    }

    /**
     * test for canKill method
     *
     */
    @Test
    public void testCanKill() {
        Pawn pawn = new Pawn(7, 1, Color.WHITE);
        if(pawn.canKill(new Pawn(6, 1,Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(6, 1,Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(6, 1,Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(8, 1,Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }
    }

}
