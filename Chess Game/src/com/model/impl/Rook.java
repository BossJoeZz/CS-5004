package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * A class representing a Rook chess piece that implements the ChessPiece interface.
 * A rook can move any number of squares along a rank or file, but cannot leap over other pieces.
 * Along with the king, a rook is involved during the king's castling move.
 */
public class Rook implements ChessPiece {

    private int row; // the row number of the Rook on the chess board
    private int col; // the column number of the Rook on the chess board
    private Color color; // the color of the Rook

    /**
     * Sets the row where the rook is located on the chess board.
     * @param row The row where the rook is located.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column where the rook is located on the chess board.
     * @param col The column where the rook is located.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Constructs a new Rook instance with default values for row, col and color.
     */
    public Rook() {

    }

    /**
     * Constructs a new Rook instance with the specified values for row, col and color.
     * @param row   The row where the rook is located.
     * @param col   The column where the rook is located.
     * @param color The color of the rook.
     */
    public Rook(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return The color of the rook.
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return The row where the rook is located.
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return The column where the rook is located.
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Returns a boolean indicating if the rook can move to the specified position (row, col).
     * This is for our Chess Game. I connect this method with the chessboard
     * @param row The row where the rook is trying to move.
     * @param col The column where the rook is trying to move.
     * @return true if the rook can move to the specified position, false otherwise.
     */
    @Override
    public boolean canMove(int row, int col) {
        ChessBoard2 chessBoard2 = new ChessBoard2();
        if (chessBoard2.board[row][col] != null)
            return false;

        if (this.row == row && checkMoveStraightLine(row, col)) {
            return true;
        }
        if (this.col == col && checkMoveStraightLine(row, col)) {
            return true;
        }
        return false;
    }

    /**
     * Returns a boolean indicating if the rook can move to the specified position (row, col).
     * This is for testing whether the method works
     * @param row The row where the rook is trying to move.
     * @param col The column where the rook is trying to move.
     * @return true if the rook can move to the specified position, false otherwise.
     */
    @Override
    public boolean canMoveV2(int row, int col) {
        if (this.row == row && checkMoveStraightLine(row, col)) {
            return true;
        }
        if (this.col == col && checkMoveStraightLine(row, col)) {
            return true;
        }
        return false;
    }

    /**
     * Determines if this Rook chess piece can kill the provided chess piece.
     * @param piece the chess piece to check if it can be killed by this Rook piece.
     * @return true if this Rook piece can kill the provided piece, false otherwise.
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * Determines if this Rook chess piece can move to the given row and column in a straight line without any
     * pieces in its path.
     * @param row the row to check if this Rook piece can move to.
     * @param col the column to check if this Rook piece can move to.
     * @return true if this Rook piece can move to the given row and column in a straight line without any pieces in
     * its path, false otherwise.
     */
    public boolean checkMoveStraightLine(int row, int col) {
        int minRow = Math.min(this.row, row);
        int maxRow = Math.max(this.row, row);
        int minCol = Math.min(this.col, col);
        int maxCol = Math.max(this.col, col);

        if (row != this.row) {
            for (int i = minRow + 1; i < maxRow; i ++) {
                if (ChessBoardImpl.chessBoard[i][col] != null) {
                    return false;
                }
            }
        }

        if (col != this.col) {
            for (int i = minCol + 1; i < maxCol; i ++) {
                if (ChessBoardImpl.chessBoard[row][i] != null) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * @return a String representation of this Rook chess piece.
     */
    public String toString() {
        return "Rook  ";
    }
}
