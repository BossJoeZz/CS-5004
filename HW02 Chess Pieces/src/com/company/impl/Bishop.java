package com.company.impl;

import com.company.ChessPiece;
import com.company.Color;

public class Bishop implements ChessPiece {

    private int row;
    private int col;
    private Color color;

    public Bishop() {

    }


    public Bishop(int row, int col, Color color) {
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
        if(Math.abs(row - this.row) == Math.abs(col - this.col)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        if (this.canMove(piece.getRow(), piece.getColumn()) && this.color.getType() != piece.getColor()) {
            return true;
        }
        return false;
    }
}
