/**
 The Pawn class represents a pawn in a game of chess.
 A pawn can move forward to the unoccupied square immediately in front of it on the same file,
 or on its first move it can advance two squares along the same file,
 provided both squares are unoccupied (black dots in the diagram).
 A pawn can capture an opponent's piece on a square diagonally in front of it by moving to that square (black crosses).
 It cannot capture a piece while advancing along the same file.
 */

package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * The Pawn class represents a pawn in a game of chess.
 * A pawn can move forward to the unoccupied square immediately in front of it on the same file,
 * or on its first move it can advance two squares along the same file,
 * provided both squares are unoccupied.
 * A pawn can capture an opponent's piece on a square diagonally in front of it by moving to that square.
 * It cannot capture a piece while advancing along the same file.
 */
public class Pawn implements ChessPiece {

    private int row; // the row number of the Pawn on the chess board
    private int col; // the column number of the Pawn on the chess board
    private Color color; // the color of the Pawn

    /**
     * Sets the row of the pawn on the chess board.
     * @param row The row to set for the pawn.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column of the pawn on the chess board.
     * @param col The column to set for the pawn.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Constructs a new Pawn object with default values.
     */
    public Pawn() {

    }

    /**
     * Constructs a new Pawn object with specified row, column, and color values.
     * @param row The row of the pawn on the chess board.
     * @param col The column of the pawn on the chess board.
     * @param color The color of the pawn.
     */
    public Pawn(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return The color of the pawn, either "BLACK" or "WHITE".
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return The row of the pawn on the chess board.
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return The column of the pawn on the chess board.
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Determines if the pawn can move to the specified row and column.
     * This is for our Chess Game. I connect this method with the chessboard
     * @param row The row to move the pawn to.
     * @param col The column to move the pawn to.
     * @return True if the pawn can move to the specified row and column, false otherwise.
     */
    @Override
    public boolean canMove(int row, int col) {
        ChessBoard2 chessBoard2 = new ChessBoard2();
        if (chessBoard2.board[row][col] != null)
            return false;

        if (this.color.getType().equals("BLACK")) {
            if(row - this.row == 1 && col == this.col) {
                return true;
            }
        }
        if (this.color.getType().equals("WHITE")) {
            if(this.row - row == 1 && col == this.col) {
                return true;
            }
        }
        return false;
    }

    /**
     * Determines if the pawn can move to the specified row and column, without considering if the move results in a capture.
     * This is for testing whether the method works
     * @param row The row to move the pawn to.
     * @param col The column to move the pawn to.
     * @return True if the pawn can move to the specified row and column, false otherwise.
     */
    @Override
    public boolean canMoveV2(int row, int col) {

        if (this.color.getType().equals("BLACK")) {
            if(row - this.row == 1 && col == this.col) {
                return true;
            }
        }
        if (this.color.getType().equals("WHITE")) {
            if(this.row - row == 1 && col == this.col) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns whether this pawn can kill the given chess piece.
     * @param piece the chess piece to check if it can be killed by this pawn.
     * @return true if the given piece can be killed by this pawn, false otherwise.
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of this pawn.
     * @return the string "Pawn" followed by two spaces.
     */
    public String toString() {
        return "Pawn  ";
    }
}
