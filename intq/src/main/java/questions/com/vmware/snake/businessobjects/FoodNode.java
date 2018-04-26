package questions.com.vmware.snake.businessobjects;


/**
 * FoodNode - which indicates which node has food.
 *  - Exposes methods as;
 *          - constructor, to init the food to start with
 *          - eat(), indicating that food is eaten so that its not displayed at the grid.
 *          - setFood(), to set the food back for game play.
 */
public class FoodNode {
    int x;
    int y;
    boolean foodPresent = false;

    public FoodNode(int x, int y) {
        this.x = x;
        this.y = y;
        this.foodPresent = true;
    }

    public void eat() {
        this.foodPresent = false;
    }

    public void setFood(int x, int y) {
        this.x = x;
        this.y = y;
        this.foodPresent = true;
    }

    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + "foodPresent=" + this.foodPresent + "]";
    }
}
