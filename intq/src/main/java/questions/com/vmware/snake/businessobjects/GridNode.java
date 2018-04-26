package questions.com.vmware.snake.businessobjects;

public class GridNode {
    private int value;

    public void GridNode(int id) {
        this.value = id;
    }

    public int getValue() { return this.value; }

    public String toString() { return "[" + this.value + "]"; }
}
