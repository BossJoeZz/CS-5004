package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * The King class represents a chess piece of the King type.
 * It implements the ChessPiece interface, which provides the basic functionality of a chess piece.
 * The King class is responsible for storing and manipulating the position and color of the King on the chessboard.
 * Provides a method to judge whether a move is effective against the king and whether it can kill another ChessPiece.
 * The king moves one square in any direction.
 */
public class King implements ChessPiece {

    private int row; // the row number of the King on the chess board
    private int col; // the column number of the King on the chess board
    private Color color; // the color of the King

    /**
     * Sets the row of the King's position on the chessboard.
     * @param row The row of the King's position on the chessboard.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column of the King's position on the chessboard.
     * @param col The column of the King's position on the chessboard.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Default constructor for the King class. Initializes row, column, and color to default values.
     */
    public King() {

    }

    /**
     * Parameterized constructor for the King class. Initializes row, column, and color to the specified values.
     * @param row The row of the King's position on the chessboard.
     * @param col The column of the King's position on the chessboard.
     * @param color The color of the King (either white or black).
     */
    public King(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return The row of the King's position on the chessboard.
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return The column of the King's position on the chessboard.
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Determines whether a move is valid for the King.
     * This is for our Chess Game. I connect this method with the chessboard.
     * @param row The row of the target position on the chessboard.
     * @param col The column of the target position on the chessboard.
     * @return True if the move is valid for the King, false otherwise.
     */
    @Override
    public boolean canMove(int row, int col) {
        ChessBoard2 chessBoard2 = new ChessBoard2();
        if (chessBoard2.board[row][col] != null)
            return false;

        if (row - this.row == 1 && (col - this.col == 1 || col - this.col == -1 || col - this.col == 0))
            return true;
        if (row - this.row == -1 && (col - this.col == 1 || col - this.col == -1 || col - this.col == 0))
            return true;
        if (row - this.row == 0 && (col - this.col == 1 || col - this.col == -1))
            return true;
        return false;
    }

    /**
     * Determines if the King can move to the specified row and column on the chess board.
     * This is for testing whether the method works
     * @param row the row to move to
     * @param col the column to move to
     * @return true if the King can move to the specified row and column, false otherwise
     */
    @Override
    public boolean canMoveV2(int row, int col) {

        if (row - this.row == 1 && (col - this.col == 1 || col - this.col == -1 || col - this.col == 0))
            return true;
        if (row - this.row == -1 && (col - this.col == 1 || col - this.col == -1 || col - this.col == 0))
            return true;
        if (row - this.row == 0 && (col - this.col == 1 || col - this.col == -1))
            return true;
        return false;
    }

    /**
     * Determines whether this King can kill the given ChessPiece by moving to its position
     * @param piece The ChessPiece to check if can be killed
     * @return true if this King can kill the given ChessPiece, false otherwise
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * @return The color of this King as a string
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return A string representation of this King
     */
    public String toString() {
        return "King  ";
    }
}
