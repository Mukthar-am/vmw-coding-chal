package questions.com.vmware.snake.businessobjects;

public class Cell {
    public final static int CELL_TYPE_EMPTY = 0;
    public final static int CELL_TYPE_FOOD = 10;
    public final static int CELL_TYPE_SNAKE_NODE = 20;

    public final int row, col;      /** cell co-ordinates in terms of (x, y) */
    public int type;
    public boolean isFood = false;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
