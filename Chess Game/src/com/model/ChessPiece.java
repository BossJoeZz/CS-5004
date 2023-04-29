package com.model;

/**
 * The ChessPiece interface defines the methods that must be implemented by all chess pieces.
 */
public interface ChessPiece {

    /**
     * Sets the row of the chess piece.
     * @param row The row to set for the chess piece.
     */
    void setRow(int row) ;

    /**
     * Sets the column of the chess piece.
     * @param col The column to set for the chess piece.
     */
    void setCol(int col) ;

    /**
     * Gets the row of the chess piece.
     * @return The row of the chess piece.
     */
    int getRow();

    /**
     * Gets the column of the chess piece.
     * @return The column of the chess piece.
     */
    int getColumn();

    /**
     * Determines if the chess piece can move to the given row and column.
     * This is for testing whether the method works.
     * @param row The row to check.
     * @param col The column to check.
     * @return true if the chess piece can move to the given row and column, false otherwise.
     */
    boolean canMove(int row, int col);

    /**
     * Determines if the chess piece can move to the given square of the chessboard in our Chess Game.
     * This is for our Chess Game. I connect this method with the chessboard.
     * @param row The row to check.
     * @param col The column to check.
     * @return true if the chess piece can move to the given row and column, false otherwise.
     */
    boolean canMoveV2(int row, int col);

    /**
     * Determines if the chess piece can kill the given chess piece.
     * @param piece The chess piece to check if it can be killed.
     * @return true if the chess piece can kill the given chess piece, false otherwise.
     */
    boolean canKill(ChessPiece piece);

    /**
     * Gets the color of the chess piece.
     * @return The color of the chess piece.
     */
    String getColor();

}
