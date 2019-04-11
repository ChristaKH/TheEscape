package edu.miracostacollege.cs134.theescape.model;

/**
 * The <code>Player</code> class represents the player (coder) in The Escape game.
 * Players can move UP, DOWN, LEFT or RIGHT.  A player's position is kept by row/col
 * coordinates on a 2D board.
 */
public class Player {
    private int mRow;
    private int mCol;

    /**
     * Instantiates a new <code>Player</code> at a given row and column position.
     * @param row The row value
     * @param col The column value
     */
    public Player(int row, int col) {
        mRow = row;
        mCol = col;
    }

    /**
     * Moves a <code>Player</code> in one of four directions:
     * UP, DOWN, LEFT or RIGHT as long as no obstacle is in the way.
     * @param gameBoard The board on which to move the player.
     * @param direction The direction, UP, DOWN, LEFT or RIGHT
     */
    public void move(int[][] gameBoard, Direction direction) {

        switch (direction)
        {
            case RIGHT:
                if (gameBoard[mRow][mCol + 1] != BoardValues.OBST)
                    mCol++;
                break;
            case LEFT:
                if (gameBoard[mRow][mCol - 1] != BoardValues.OBST)
                    mCol--;
                break;
            case UP:
                if (gameBoard[mRow - 1][mCol] != BoardValues.OBST)
                    mRow--;
                break;
            case DOWN:
                if (gameBoard[mRow + 1][mCol] != BoardValues.OBST)
                    mRow++;
                break;

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
