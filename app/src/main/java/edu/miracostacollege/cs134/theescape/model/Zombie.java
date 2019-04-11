package edu.miracostacollege.cs134.theescape.model;

/**
 * The <code>Zombie</code> class represents the enemy (zombie) in The Escape game.
 * Zombies can move UP, DOWN, LEFT or RIGHT.  A zombie's position is kept by row/col
 * coordinates on a 2D board.
 */

public class Zombie {

    private int mRow;
    private int mCol;

    /**
     * Instantiates a new <code>Zombie</code> at a given row and column position.
     * @param row The row value
     * @param col The column value
     */
    public Zombie(int row, int col) {
        mRow = row;
        mCol = col;
    }

    /**
     * Moves a <code>Zombie</code> in the direction of the player,
     * as long as no obstacle is in the way.
     * @param gameBoard The board on which to move the zombie.
     * @param playerRow The player's current row value
     * @param playerCol The player's current column value
     */
    public void move(int[][] gameBoard, int playerRow, int playerCol) {
        if (mCol < playerCol && gameBoard[mRow][mCol + 1] == BoardValues.FREE) {
            mCol++;
        } else if (mCol > playerCol && gameBoard[mRow][mCol - 1] == BoardValues.FREE) {
            mCol--;
        } else if (mRow < playerRow && gameBoard[mRow + 1][mCol] == BoardValues.FREE) {
            mRow++;
        } else if (mRow > playerRow && gameBoard[mRow - 1][mCol] == BoardValues.FREE) {
            mRow--;
        }
    }

    public void setRow(int row) {
        mRow = row;
    }
    public int getRow() {
        return mRow;
    }
    public void setCol(int col) {
        mCol = col;
    }
    public int getCol() {
        return mCol;
    }

}
