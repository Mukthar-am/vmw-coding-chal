package questions.com.vmware.snake.businessobjects;

/**
 * Description:
 * Snake game play grid object which holds the traverse path and the food-node in it.
 */
public class FoodGrid {
    GridNode left;
    GridNode right;
    GridNode up;
    GridNode down;
    FoodNode foodNode;


    /**
     * constructor taking care of init and setting good.
     * @param x
     * @param y
     * @param foodNode
     */
    public FoodGrid(int x, int y, FoodNode foodNode) {
        /**
         *  initialize grid node with its x and y ranges and a food to start with.
         */
    }

    public void setFoodNode(FoodNode fNode) {
        this.foodNode = fNode;
    }
}
