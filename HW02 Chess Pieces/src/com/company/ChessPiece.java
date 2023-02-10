package com.company;

public interface ChessPiece {

    public int getRow();

    public int getColumn();

    public boolean canMove(int row, int col);

    public boolean canKill(ChessPiece piece);

    public String getColor();

}
