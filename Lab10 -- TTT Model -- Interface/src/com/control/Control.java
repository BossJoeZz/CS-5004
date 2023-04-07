package com.control;

import com.model.Player;

public interface Control {

    /**
     * Places an X mark in the specified cell
     * @param column the column of the cell
     * @param row the row of the cell
     * @throws IllegalStateException if it's Y's turn,
     * if the game is over, or if there is already a mark in the cell.
     *  @throws IndexOutOfBoundsException if the cell is out of bounds
     */
    //void moveAsX(int column, int row);

    /**
     * Places an Y mark in the specified cell
     * @param column the column of the cell
     * @param row the row of the cell
     * @throws IllegalStateException if it's X's turn,
     * if the game is over, or if there is already a mark in the cell.
     *  @throws IndexOutOfBoundsException if the cell is out of bounds
     */
    //void moveAsY(int column, int row);

    /**
     * better than moveAsX and moveAsY
     * places an X or 0 mark in the specified cell.
     * Whether it places an X or O depends on which player's turn it is.
     * @param column the column of the cell
     * @param row the row of the cell
     * @throws IllegalStateException if the game is over, or if there is already a mark in the cell.
     * @throws IndexOutOfBoundsException if the cell is out of bounds.
     */
    void move(int column , int row);

    /* Determines whether it is player X's turn to move.
     * @return whether X can play now
     */
    boolean isXsTurn();

    /* Determines whether it is player X's turn to move.
     * @return whether Y can play now
     */
    boolean isYsTurn();

    /*
     * choose as the return type, as more than three players, boolean just adjust for two players
     * Returns the player whose turn is next.
     * @return the next player
     * @throws IllegalStateException if the game is over
     */
    String nextPlayer();

    /**
     * Determines whether the game is over
     * @return whether the game is over
     */
    boolean isGameOver();

     /**
      * Returns the winner of the game, or [@code null] if the game is a tie.
      * @return the winner or {@code null}
      * @throws IllegalStateException if the game isn't over
      */
    Player getWinner();

}
