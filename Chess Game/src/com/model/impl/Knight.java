package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * Represents a Knight chess piece
 * A knight moves to any of the closest squares that are not on the same rank, file, or diagonal.
 * Thus, the move forms an "L"-shape: two squares vertically and one square horizontally, or two squares horizontally and one square vertically.
 * The knight is the only piece that can leap over other pieces.
 */
public class Knight implements ChessPiece {

    private int row; // the row number of the Knight on the chess board
    private int col; // the column number of the Knight on the chess board
    private Color color; // the color of the Knight

    /**
     * Sets the row of the Knight's position on the chessboard.
     * @param row The row of the Knight's position on the chessboard.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column of the Knight's position on the chessboard.
     * @param col The column of the Knight's position on the chessboard.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Default constructor for the Knight class.
     */
    public Knight() {

    }

    /**
     * Constructor for the Knight class that takes in the row position, column position, and color of the Knight.
     * @param row   The row position of the Knight on the chess board.
     * @param col   The column position of the Knight on the chess board.
     * @param color The color of the Knight (BLACK or WHITE).
     */
    public Knight(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return The color of the Knight (BLACK or WHITE).
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return The row position of the Knight on the chess board.
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return The column position of the Knight on the chess board.
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Determines whether the Knight can move to the given position on the chess board.
     * This is for our Chess Game. I connect this method with the chessboard
     * @param row The row position to check.
     * @param col The column position to check.
     * @return True if the Knight can move to the given position on the chess board, false otherwise.
     */
    @Override
    public boolean canMove(int row, int col) {
        ChessBoard2 chessBoard2 = new ChessBoard2();
        if (chessBoard2.board[row][col] != null)
            return false;

        if ((row - this.row == 1) && (col -  this.col == 2)) {
            return true;
        }
        if ((row - this.row == 1) && (col -  this.col == -2)) {
            return true;
        }
        if ((row - this.row == 2) && (col -  this.col == 1)) {
            return true;
        }
        if ((row - this.row == 2) && (col -  this.col == -1)) {
            return true;
        }
        if ((row - this.row == -1) && (col -  this.col == 2)) {
            return true;
        }
        if ((row - this.row == -1) && (col -  this.col == -2)) {
            return true;
        }
        if ((row - this.row == -2) && (col -  this.col == 1)) {
            return true;
        }
        if ((row - this.row == -2) && (col -  this.col == -1)) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the Knight can move to the specified position (row, col).
     * This is for testing whether the method works.
     *
     * @param row The row of the destination square.
     * @param col The column of the destination square.
     * @return true if the Knight can move to the specified position, false otherwise.
     */
    @Override
    public boolean canMoveV2(int row, int col) {

        if ((row - this.row == 1) && (col -  this.col == 2)) {
            return true;
        }
        if ((row - this.row == 1) && (col -  this.col == -2)) {
            return true;
        }
        if ((row - this.row == 2) && (col -  this.col == 1)) {
            return true;
        }
        if ((row - this.row == 2) && (col -  this.col == -1)) {
            return true;
        }
        if ((row - this.row == -1) && (col -  this.col == 2)) {
            return true;
        }
        if ((row - this.row == -1) && (col -  this.col == -2)) {
            return true;
        }
        if ((row - this.row == -2) && (col -  this.col == 1)) {
            return true;
        }
        if ((row - this.row == -2) && (col -  this.col == -1)) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the Knight can kill the specified ChessPiece.
     * A Knight can kill a ChessPiece if it can move to its position and the two pieces have different colors.
     * @param piece The ChessPiece to be checked if it can be killed by this Knight.
     * @return true if the Knight can kill the specified ChessPiece, false otherwise.
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * @return a string representation of the Knight object.
     */
    public String toString() {
        return "Knight";
    }
}
