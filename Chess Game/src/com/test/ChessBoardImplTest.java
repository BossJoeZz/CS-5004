package com.test;

import com.model.ChessBoard;
import com.model.ChessPiece;
import com.model.Color;
import com.model.impl.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * This is the test for ChessBoardImpl class
 */

public class ChessBoardImplTest {

    /**
     * This test case checks if the ChessBoardImpl is correctly initialized
     */
    @Test
    public void testChessBoardInit() {

        ArrayList<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(new Bishop(0, 1, Color.BLACK));
        chessPieces.add(new Knight(0, 2, Color.BLACK));
        chessPieces.add(new Pawn(0, 1, Color.BLACK));
        chessPieces.add(new Queen(0, 3, Color.BLACK));
        chessPieces.add(new Rook(0, 4, Color.BLACK));

        chessPieces.add(new Bishop(7, 1, Color.WHITE));
        chessPieces.add(new Knight(7, 2, Color.WHITE));
        chessPieces.add(new Pawn(6, 1, Color.WHITE));
        chessPieces.add(new Queen(7, 3, Color.WHITE));
        chessPieces.add(new Rook(7, 4, Color.WHITE));

        ChessBoard chessBoard = new ChessBoardImpl(chessPieces);

        // TRUE
        ChessPiece chessPiece1 = chessBoard.getPiece(0, 1);
        System.out.println(chessPiece1);

        // the result is null     FALSE
        ChessPiece chessPiece2 = chessBoard.getPiece(3, 3);
        System.out.println(chessPiece2);
    }

    /**
     * Test for if a ChessPiece can move in a straight line
     */
    @Test
    public void testCheckMoveStraightLine() {
        ArrayList<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(new Bishop(0, 1, Color.BLACK));
        chessPieces.add(new Knight(0, 2, Color.BLACK));
        chessPieces.add(new Pawn(0, 1, Color.BLACK));
        chessPieces.add(new Queen(0, 3, Color.BLACK));
        chessPieces.add(new Rook(0, 4, Color.BLACK));

        chessPieces.add(new Bishop(7, 1, Color.WHITE));
        chessPieces.add(new Knight(7, 2, Color.WHITE));
        chessPieces.add(new Pawn(6, 1, Color.WHITE));
        chessPieces.add(new Queen(7, 3, Color.WHITE));
        chessPieces.add(new Rook(7, 4, Color.WHITE));

        ChessBoard chessBoard = new ChessBoardImpl(chessPieces);

        // the path has other piece
        ChessPiece rook1 = new Rook(4, 1, Color.BLACK);
        boolean isPrime1 = ((Rook) rook1).checkMoveStraightLine(7, 1);
        assertFalse(((Rook) rook1).checkMoveStraightLine(7, 1));
        System.out.println(isPrime1);

        // the path has not other piece
        ChessPiece rook2 = new Rook(4, 1, Color.BLACK);
        boolean isPrime2 = ((Rook) rook2).checkMoveStraightLine(0, 1);
        assertTrue(((Rook) rook2).checkMoveStraightLine(0, 1));
        System.out.println(isPrime2);
    }


    /**
     * Test for moving diagonal line
     */
    @Test
    public void testCheckMoveDiagonalLine() {
        ArrayList<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(new Bishop(0, 1, Color.BLACK));
        chessPieces.add(new Knight(0, 2, Color.BLACK));
        chessPieces.add(new Pawn(0, 1, Color.BLACK));
        chessPieces.add(new Queen(0, 3, Color.BLACK));
        chessPieces.add(new Rook(0, 4, Color.BLACK));

        chessPieces.add(new Bishop(7, 1, Color.WHITE));
        chessPieces.add(new Knight(7, 2, Color.WHITE));
        chessPieces.add(new Pawn(6, 1, Color.WHITE));
        chessPieces.add(new Queen(7, 3, Color.WHITE));
        chessPieces.add(new Rook(7, 4, Color.WHITE));

        ChessBoard chessBoard = new ChessBoardImpl(chessPieces);

        // the path has not other piece
        ChessPiece rook1 = new Bishop(4, 4, Color.BLACK);
        boolean isPrime1 = ((Bishop) rook1).checkMoveDiagonalLine(1, 1);
        assertTrue(((Bishop) rook1).checkMoveDiagonalLine(1, 1));
        System.out.println(isPrime1);

        // the path has other piece
        ChessPiece rook2 = new Bishop(5, 2, Color.BLACK);
        boolean isPrime2 = ((Bishop) rook2).checkMoveDiagonalLine(7, 0);
        assertFalse(((Bishop) rook2).checkMoveDiagonalLine(7, 0));
        System.out.println(isPrime2);
    }

}
