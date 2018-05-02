package questions.com.vmware.snake.businessobjects;

import questions.com.vmware.snake.game.Snake;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

public class Board {
    private int ROWS, COLS;
    Cell[][] BOARD;
    Snake SNAKE;


    public Board init(int rowCount, int columnCount) {
        this.ROWS = rowCount;
        this.COLS = columnCount;

        this.BOARD = new Cell[this.ROWS][this.COLS];
        for (int row = 0; row < this.ROWS; row++) {
            for (int column = 0; column < this.COLS; column++) {
                this.BOARD[row][column] = new Cell(row, column);
            }
        }


        /** init snake as well, over the board */
        Cell snakeInitCell = new Cell(0, 0, true);

        this.SNAKE = new Snake(snakeInitCell);
        this.BOARD[0][0] = snakeInitCell;

        return this;
    }

    public Snake getSnake() {
        return this.SNAKE;
    }

    public void moveSnake(Cell nextCell) {
        System.out.println("\nMoving to - (" + nextCell.getRow() + ", " + nextCell.getColumn() + ")" );
        if (!nextCell.isFood()) {
            Cell snakeTail = this.SNAKE.getTail();
            this.BOARD[snakeTail.getRow()][snakeTail.getColumn()].release();
        }


        boolean moveSuccessful;
        moveSuccessful = this.SNAKE.move(nextCell);
        if (moveSuccessful) {
            this.BOARD[nextCell.getRow()][nextCell.col] = nextCell;

        } else {
            System.out.println("Game over!!!");
            System.exit(0);
        }
    }

    public void generateFood() {
        int row = new Random().nextInt(this.ROWS);
        int column = new Random().nextInt(this.COLS);
        System.out.println("Generating food at (x,y): (" + row + "," + column + ")");
        this.BOARD[row][column].setFood();
    }

    public void generateFood(int row, int column) {
        System.out.println("Generating food at (x,y): (" + row + "," + column + ")");
        this.BOARD[row][column].setFood();
    }

    public Cell[][] getBoard() {
        return this.BOARD;
    }

    public String toString() {
        StringBuilder board = new StringBuilder();
        int rows = this.BOARD.length;
        int columns = this.BOARD[0].length;
        board.append("\n>>> Snake board looks like:-");
        board.append("\n-----------------------------------------\n");
        for (int r = 0; r < rows; r++) {
            board.append("|");
            for (int c = 0; c < columns; c++) {

                board.append(this.BOARD[r][c].toString());

                if (c != columns - 1)
                    board.append(" ");
            }
            board.append("|");
            board.append("\n");
        }
        board.append("-----------------------------------------");

        return board.toString();
    }
}
