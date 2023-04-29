package com.model;

/**
 * Interfaces specification for ChessBoard
 */
public interface ChessBoard {

    /**
     * Use this method to get piece through row and col
     *
     * @param row row in the board.
     * @param col col in the board.
     * @return the chessPiece in the row,col
     */

    public ChessPiece getPiece(int row, int col);

}
