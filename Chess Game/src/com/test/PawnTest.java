package com.test;

import com.model.Color;
import com.model.impl.Pawn;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 The PawnTest class tests the functionality of the canMove and canKill methods in the Pawn class.
 */
public class PawnTest {

    /**
     * This method tests the canMove method of the Pawn class.
     */
    @Test
    public void testCanMove() {
        Pawn pawn = new Pawn(7, 1, Color.WHITE);
        assertTrue(pawn.canMove(6,1));
        assertFalse(pawn.canMove(8,1));

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
     * This method tests the canKill method of the Pawn class.
     */
    @Test
    public void testCanKill() {
        Pawn pawn = new Pawn(7, 1, Color.WHITE);
        assertFalse(pawn.canKill(new Pawn(6, 1, Color.WHITE)));
        assertTrue(pawn.canKill(new Pawn(6, 1, Color.BLACK)));
        assertTrue(pawn.canKill(new Pawn(6, 1, Color.BLACK)));
        assertFalse(pawn.canKill(new Pawn(8, 1, Color.BLACK)));

        if(pawn.canKill(new Pawn(6, 1, Color.WHITE))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(6, 1, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(6, 1, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }

        if(pawn.canKill(new Pawn(8, 1, Color.BLACK))) {
            System.out.println("canKill");
        } else {
            System.out.println("cannotKill");
        }
    }

}
