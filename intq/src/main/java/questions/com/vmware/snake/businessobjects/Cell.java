package questions.com.vmware.snake.businessobjects;

import java.util.Comparator;
import java.util.Objects;

public class Cell implements Comparator<Cell> {
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

    public String toString() {
        return "(" + this.row + "," + this.col + ")";
    }

    @Override
    public int compare(Cell o1, Cell o2) {

        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cell)) {
            return false;
        }

        Cell cell = (Cell) o;

        return (cell.row == this.row && cell.col == this.col);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        return Objects.hash(this.row, this.col);
    }
}
