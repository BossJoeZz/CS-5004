package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * This class represents the Queen chess piece.
 * A queen combines the power of a rook and bishop and can move any number of squares along a rank, file, or diagonal,
 * but cannot leap over other pieces.
 */
public class Queen implements ChessPiece {

    private int row; // the row number of the Queen on the chess board
    private int col; // the column number of the Queen on the chess board
    private Color color; // the color of the Queen

    /**
     * Sets the row in which the Queen is located.
     * @param row the row in which the Queen is located.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column in which the Queen is located.
     * @param col the column in which the Queen is located.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Constructs a new Queen object with default values.
     */
    public Queen() {

    }

    /**
     * Constructs a new Queen object with specified row, column, and color values.
     * @param row the row in which the Queen is located.
     * @param col the column in which the Queen is located.
     * @param color the color of the Queen, either "BLACK" or "WHITE".
     */
    public Queen(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return the color of the Queen, either "BLACK" or "WHITE".
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return the row in which the Queen is located.
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return the column in which the Queen is located.
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Determines if the Queen can move to the specified row and column.
     * This is for our Chess Game. I connect this method with the chessboard
     * @param row the row to move the Queen to.
     * @param col the column to move the Queen to.
     * @return true if the Queen can move to the specified row and column, false otherwise.
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
        if((Math.abs(row - this.row) == Math.abs(col - this.col)) && checkMoveDiagonalLine(row, col)) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the Queen can move to the specified row and column
     * This is for testing whether the method works
     * @param row the row to move the Queen to.
     * @param col the column to move the Queen to.
     * @return true if the Queen can move to the specified row and column, false otherwise.
     */
    @Override
    public boolean canMoveV2(int row, int col) {
        if (this.row == row && checkMoveStraightLine(row, col)) {
            return true;
        }
        if (this.col == col && checkMoveStraightLine(row, col)) {
            return true;
        }
        if((Math.abs(row - this.row) == Math.abs(col - this.col)) && checkMoveDiagonalLine(row, col)) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the Queen can kill the given ChessPiece.
     * @param piece the ChessPiece to check for killing
     * @return true if the Queen can kill the given ChessPiece, false otherwise
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the Queen can move in a straight line to the specified row and column on the chessboard.
     * @param row the row to move to
     * @param col the column to move to
     * @return true if the Queen can move in a straight line to the specified row and column, false otherwise
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
     * Checks if the Queen can move in a diagonal line to the specified row and column on the chessboard.
     * @param row the row to move to
     * @param col the column to move to
     * @return true if the Queen can move in a diagonal line to the specified row and column, false otherwise
     */
    public boolean checkMoveDiagonalLine(int row, int col) {
        if (this.row < row && this.col < col) {
            for (int i = this.row + 1, j = this.col + 1; i < row && j < col; i ++, j ++) {
                if (ChessBoardImpl.chessBoard[i][j] != null) {
                    return false;
                }
            }
        }

        if (this.row < row && this.col > col) {
            for (int i = this.row + 1, j = this.col - 1; i < row && j > col; i ++, j --) {
                if (ChessBoardImpl.chessBoard[i][j] != null) {
                    return false;
                }
            }
        }

        if (this.row > row && this.col > col) {
            for (int i = this.row - 1, j = this.col - 1; i > row && j > col; i --, j --) {
                if (ChessBoardImpl.chessBoard[i][j] != null) {
                    return false;
                }
            }
        }

        if (this.row > row && this.col < col) {
            for (int i = this.row - 1, j = this.col + 1; i > row && j < col; i --, j ++) {
                if (ChessBoardImpl.chessBoard[i][j] != null) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * @return a string representation of the Queen
     */
    public String toString() {
        return "Queen ";
    }
}
