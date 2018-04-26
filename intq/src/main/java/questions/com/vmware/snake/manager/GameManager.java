package questions.com.vmware.snake.manager;

import questions.com.vmware.snake.businessobjects.FoodGrid;
import questions.com.vmware.snake.businessobjects.FoodNode;

/**
 * Description:
 * Start point interface to the game play
 */
public class GameManager {
    public static void main(String[] args) {

    }


    /**
     * Init the game and start consuming user inputs
     * @return
     */
    private GameManager init() {
        int x = 10;
        int y = 15;

        FoodNode foodNode = new FoodNode(5, 5);
        FoodGrid foodGrid = new FoodGrid(x, y, foodNode);


        return this;
    }


    private void start() {
        /**
         * Logic:
         *  - If no user input, keep traversing in the existing direction
         *      - If input, then go by the input direction.
         *
         *      while traversing, food-found, consume and increase the length of the snake body.
         *          else keep traversing the current direction.
         *
         *          if (obstacle or self hit) -> conclude game with a "game lost" status
         */
    }
}
