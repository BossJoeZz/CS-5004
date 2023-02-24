package com.company.impl;

import com.company.ChessPiece;
import com.company.Color;

public class Queen implements ChessPiece {

    private int row;
    private int col;
    private Color color;

    public Queen() {

    }

    public Queen(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color.getType();
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.col;
    }

    @Override
    public boolean canMove(int row, int col) {
        if (this.row == row) {
            return true;
        }
        if (this.col == col) {
            return true;
        }
        if(Math.abs(row - this.row) == Math.abs(col - this.col)) {
            return true;
        }
        return false;
    }

    /**
     * check the piece can move
     *
     * @param row row in the board.
     * @param col col in the board.
     * @return in the row,col has chessPiece is true, else is false
     */
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

    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMoveV2(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }

    /**
     * check the move path throw straight line
     *
     * @param row row in the board.
     * @param col col in the board.
     * @return from this loacted to row,col has not pieces return true, else return false
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
     * check the move path throw diagonal line
     *
     * @param row row in the board.
     * @param col col in the board.
     * @return from this loacted to row,col has not pieces return true, else return false
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
}
