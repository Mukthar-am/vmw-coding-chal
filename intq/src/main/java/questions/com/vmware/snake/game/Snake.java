package questions.com.vmware.snake.game;

import questions.com.vmware.snake.businessobjects.Cell;

import java.util.LinkedList;


public class Snake {
    LinkedList<Cell> SNAKE = new LinkedList<>();
    Cell head;

    public Snake(Cell initPos) {
        head = initPos;
        SNAKE.add(head);
    }

    /**
     * snake length grow by adding elements to the linkedlist
     */
    public void grow() {
        SNAKE.add(head);
    }


    /**
     * snake traversing by moving occupied and empty cells - display of the cell shows the snake movement
     *
     * @param nextCell Handling snake eating food and growing in its length
     */
    public int move(Cell nextCell) {
        int n_x = nextCell.row;
        int n_y = nextCell.col;

        head = this.SNAKE.getFirst();
        Cell tail = this.SNAKE.getLast();

        int head_x = head.row;
        int head_y = head.col;

        int tail_x = tail.row;
        int tail_y = tail.col;

        /**
         * ToDo: Bug fix: this is handling only head or tail crash, snake body carsh to be handled later
         */
        if ((n_x == head_x && n_y == head_y) || (n_x == tail_x || n_y == tail_y) )
            return -1;

        head = nextCell;
        SNAKE.addFirst(head);

        /** if the next cell was food, do not remote the tail node such that the snake length grows. */
        if (!nextCell.isFood) {
            tail = SNAKE.removeLast();
            tail.type = Cell.CELL_TYPE_EMPTY;
        }

        return 0;   /** -1 indicating GAME OVER, 0 ALL GOOD */
    }

}
