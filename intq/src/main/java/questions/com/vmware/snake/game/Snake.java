package questions.com.vmware.snake.game;

import questions.com.vmware.snake.businessobjects.Cell;

import java.util.LinkedList;


public class Snake {
    LinkedList<Cell> SNAKE = new LinkedList<>();
    Cell head;

    public Snake(Cell headCell) {
        head = headCell;
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
    public boolean move(Cell nextCell) {
        boolean moveSuccessful = true;

        if (!isGameAlive(nextCell))
            return false;

        moveEmptyStomach(nextCell);

//        head = this.SNAKE.getFirst();
        Cell tail = this.SNAKE.getLast();

//        int n_x = nextCell.row;
//        int n_y = nextCell.col;
//

//
//
//        int head_x = head.row;
//        int head_y = head.col;
//
//        int tail_x = tail.row;
//        int tail_y = tail.col;
//
//        /**
//         * ToDo: Bug fix: this is handling only head or tail crash, snake body carsh to be handled later
//         */
//        if ((n_x == head_x && n_y == head_y) || (n_x == tail_x || n_y == tail_y) )
//            moveSuccessful = false;

//        //head = nextCell;
//        SNAKE.addFirst(nextCell);
//        tail = SNAKE.removeLast();
//        tail.type = Cell.CELL_TYPE_EMPTY;



//        /** if the next cell was food, do not remote the tail node such that the snake length grows. */
//        if (!nextCell.isFood) {
//            tail = SNAKE.removeLast();
//            tail.type = Cell.CELL_TYPE_EMPTY;
//        }

        return moveSuccessful;   /** -1 indicating GAME OVER, 0 ALL GOOD */
    }

    private void moveEmptyStomach(Cell nextCell) {
        SNAKE.addFirst(nextCell);
        Cell tail = SNAKE.removeLast();
        tail.type = Cell.CELL_TYPE_EMPTY;
    }

    public boolean isGameAlive(Cell nextCell) {
        System.out.println("Compare: " + nextCell.toString());

        boolean gameIsOn = true;
        for (int i = 0; i < this.SNAKE.size(); i++) {
            Cell currentCell = this.SNAKE.get(i);

            /** with the help of Comparator implementation */
            if (currentCell.equals(nextCell))
                gameIsOn = false;
        }

        System.out.println("gameIsOn: " + gameIsOn);
        return gameIsOn;
    }

    public String toString() {
        StringBuilder snakeBody = new StringBuilder("tail -> ");
        for (int i = this.SNAKE.size()-1; i >=0 ; i--) {
            snakeBody.append(this.SNAKE.get(i).toString());

            if (i != 0) {
                snakeBody.append(" -> ");
            }
        }

        return snakeBody.append(" -> head ").toString();
    }

}
