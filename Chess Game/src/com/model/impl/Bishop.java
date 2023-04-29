package com.model.impl;

import com.model.ChessBoard2;
import com.model.ChessPiece;
import com.model.Color;

/**
 * Represents a Bishop chess piece
 * A bishop can move any number of squares diagonally
 * but cannot leap over other pieces.
 */
public class Bishop implements ChessPiece {

    private int row; // the row number of the Bishop on the chess board
    private int col; // the column number of the Bishop on the chess board
    private Color color; // the color of the Bishop

    /**
     * Sets the row of the Bishop on the chess board.
     * @param row the row of the Bishop on the chess board
     */
    @Override
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Sets the column of the Bishop on the chess board.
     * @param col the column of the Bishop on the chess board
     */
    @Override
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Constructs a new Bishop object with default row, column, and color values.
     */
    public Bishop() {

    }

    /**
     * Constructs a new Bishop object with the given row, column, and color values.
     * @param row the row of the Bishop on the chess board
     * @param col the column of the Bishop on the chess board
     * @param color the color of the Bishop (either "WHITE" or "BLACK")
     */
    public Bishop(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    /**
     * @return the color of the Bishop (either "WHITE" or "BLACK")
     */
    @Override
    public String getColor() {
        return this.color.getType();
    }

    /**
     * @return the row of the Bishop on the chess board
     */
    @Override
    public int getRow() {
        return this.row;
    }

    /**
     * @return the column of the Bishop on the chess board
     */
    @Override
    public int getColumn() {
        return this.col;
    }

    /**
     * Determines if the Bishop can move to the specified row and column on the chess board.
     * This is for our Chess Game. I connect this method with the chessboard
     * @param row the row to move to on the chess board
     * @param col the column to move to on the chess board
     * @return true if the Bishop can move to the specified row and column, false otherwise
     */
    @Override
    public boolean canMove(int row, int col) {
        ChessBoard2 chessBoard2 = new ChessBoard2();
        if (chessBoard2.board[row][col] != null)
            return false;

        if((Math.abs(row - this.row) == Math.abs(col - this.col) && checkMoveDiagonalLine(row, col))) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the Bishop can move to the specified row and column without any obstructions(according to rules of Chess Game).
     * This is for testing whether the method works
     * @param row the row to move to on the chess board
     * @param col the column to move to on the chess board
     * @return true if the Bishop can move diagonally to the specified row and column without any obstructions, false otherwise
     */
    @Override
    public boolean canMoveV2(int row, int col) {

        if((Math.abs(row - this.row) == Math.abs(col - this.col) && checkMoveDiagonalLine(row, col))) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the Bishop can kill the target piece.
     * A bishop can kill the target piece if the target is on the diagonal line and the color is different.
     * @param piece the target piece
     * @return true if the Bishop can kill the target piece, false otherwise
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the Bishop can move diagonally to the specified row and column without any obstructions.
     * @param row the row to move to on the chess board
     * @param col the column to move to on the chess board
     * @return true if the Bishop can move diagonally to the specified row and column without any obstructions, false otherwise
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
        return "Bishop";
    }
}
