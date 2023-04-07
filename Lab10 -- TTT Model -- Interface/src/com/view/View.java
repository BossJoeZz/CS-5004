package com.view;

import com.model.Player;

public interface View {

    /**
     * Returns a two-dimensional array representing the state of the grid.
     * The first index is the column and the second the row.
     * The resulting array is newly allocated and unconnected to the model:thus,
     * mutating it will have no effect on the model or subsequent calls to [@code getGrid].
     * @return a copy of the grid
     */
    Player[][] getGrid();

    /**
     * Returns the [@link Player] whose mark is in the cell at the given coordinates, or [@code null] if that cell is empty.
     * @param column the column of the cell
     * @param row the row of the cell
     * @return a [@code Player] or [@code null]
     * @throws IndexOutOfBoundsException if the cell is out of bounds.
     */
    Player getMarkAt(int column, int row);

}
