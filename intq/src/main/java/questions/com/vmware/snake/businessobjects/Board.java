package questions.com.vmware.snake.businessobjects;

import java.util.Random;

public class Board {
    private int ROWS, COLS;
    Cell[][] BOARD;

    public Board init(int rowCount, int columnCount) {
        this.ROWS = rowCount;
        this.COLS = columnCount;

        this.BOARD = new Cell[this.ROWS][this.COLS];
        for (int row = 0; row < this.ROWS; row++) {
            for (int column = 0; column < this.COLS; column++) {
                this.BOARD[row][column] = new Cell(row, column);
            }
        }

        return this;
    }

    public void generateFood() {
        int row = new Random().nextInt(this.ROWS);
        int column = new Random().nextInt(this.COLS);

        this.BOARD[row][column].setFood();
    }

    public Cell[][] getBoard() {
        return this.BOARD;
    }
}
