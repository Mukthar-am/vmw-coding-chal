package questions.com.vmware.snake;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import questions.com.vmware.snake.businessobjects.Board;
import questions.com.vmware.snake.businessobjects.Cell;

/**
 * Solve the well known snake game.
 * Lazy snake tries to eat the offered food with out cutting its body in minimal movement.
 * <p>
 * Representation is purely for understanding.
 * Please design the game and make the necessary modifications to the test case.
 * You are encouraged to add relevant new test cases
 * <p>
 * Following are few of the conventions
 * Head of the Snake is marked as H, Body and tail is marked as X
 * Food is indicated by F
 */
public class SnakeJunitTest {
    private Board BOARD;
    private int SNAKE_START_POS = 0;
    private int SNAKE_END_POS = 0;

    private int BOARD_X = 20;
    private int BOARD_Y = 20;

    @BeforeTest
    public void preTest() {
        /** snake start position */
        Cell snakeStartPos = new Cell(this.SNAKE_START_POS, this.SNAKE_END_POS);

        this.BOARD = new Board().init(this.BOARD_X, this.BOARD_Y);  /** init board */
        System.out.println(this.BOARD.toString());
    }


    /**
     * Compare board cells, to check the equals() and hashCode() implementation
     */
    @Test
    public void CellCompareTest() {
        Cell firstCell = new Cell(0, 0);
        Cell secondCell = new Cell(0, 0);

        System.out.println("Length of snake: " + this.BOARD.getSnake().getLength());
        Assert.assertEquals(true, firstCell.equals(secondCell));
    }


    @Test
    public void SnakeLengthTest() {
        System.out.println("Length of snake: " + this.BOARD.getSnake().getLength());
        System.out.println("Snake: " + this.BOARD.getSnake().toString());

        Assert.assertEquals(1, this.BOARD.getSnake().getLength());
    }


    @Test
    public void SnakeMoveTest() {
        System.out.println("Start(): " + this.BOARD.getSnake().getLength());
        System.out.println("Snake (orig): " + this.BOARD.getSnake().toString() + "\n");

        Cell nextCell = new Cell(0,1, true, true);
        this.BOARD.moveSnake(nextCell);

        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(1,1, true, true);
        this.BOARD.moveSnake(nextCell);

        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(2,1, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(3,1, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(3,2, true, true);
        this.BOARD.moveSnake(nextCell);

        nextCell = new Cell(3,3, true, true);
        this.BOARD.moveSnake(nextCell);

        nextCell = new Cell(2,3, true, true);
        this.BOARD.moveSnake(nextCell);

        nextCell = new Cell(1,3, true, true);
        this.BOARD.moveSnake(nextCell);

        nextCell = new Cell(0,3, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());


        nextCell = new Cell(0,2, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println("Snake now1(): " + this.BOARD.toString());
        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
    }


    /**
     //     * Assert based on successful crash of the snake to either of its body parts including head and tail of snake
     //     */
    @Test
    public void SnakeCrashTest() {
        System.out.println("Start(): " + this.BOARD.getSnake().getLength());
        System.out.println("Snake (orig): " + this.BOARD.getSnake().toString() + "\n");

        Cell nextCell = new Cell(0,1, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(1,1, true, true);
        this.BOARD.moveSnake(nextCell);
        System.out.println("Snake now2(): " + this.BOARD.getSnake().toString());
        System.out.println(this.BOARD.toString());

        nextCell = new Cell(2,1, true, false);
        this.BOARD.moveSnake(nextCell);
        System.out.println("Snake now2(): " + this.BOARD.getSnake().toString());
        System.out.println(this.BOARD.toString());

//        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
//        System.out.println(this.BOARD.toString());
//
//        nextCell = new Cell(2,1, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println(this.BOARD.toString());
//
//        nextCell = new Cell(3,1, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println(this.BOARD.toString());
//
//        nextCell = new Cell(3,2, true, true);
//        this.BOARD.moveSnake(nextCell);
//
//        nextCell = new Cell(3,3, true, true);
//        this.BOARD.moveSnake(nextCell);
//
//        nextCell = new Cell(2,3, true, true);
//        this.BOARD.moveSnake(nextCell);
//
//        nextCell = new Cell(1,3, true, true);
//        this.BOARD.moveSnake(nextCell);
//
//        nextCell = new Cell(0,3, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
//
//
//        nextCell = new Cell(0,2, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println("Snake now1(): " + this.BOARD.toString());
//        System.out.println("Snake now1(): " + this.BOARD.getSnake().toString());
//
//        /** Game over here */
//        nextCell = new Cell(0,1, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println("Snake now1(): " + this.BOARD.toString());
//
//
//        /** Game over here */
//        nextCell = new Cell(0,0, true, true);
//        this.BOARD.moveSnake(nextCell);
//        System.out.println("Snake now1(): " + this.BOARD.toString());
    }
//
//
//    /**
//     * assert based on the head progressed and added with another node (0,1)
//     */
//    @Test
//    public void SnakeEatFoodTest() {
//        System.out.println("My snake: " + this.SNAKE.toString() + "\n");
//
//        Cell nextCell = new Cell(0,1);
//        nextCell.setFood();
//        this.BOARD.generateFood(0,1);
//        this.SNAKE.move(nextCell);
//
//        /** asserts based on the head being moved from default/start cell (0,0) to (0,1) */
//        Cell headCell = this.SNAKE.getHead();
//        if (headCell.equals(nextCell))
//            Assert.assertTrue(true);
//        else
//            Assert.assertTrue(false);
//    }
//
//
//    /**
//     * Assertion based on length of the snake body
//     */
//    @Test
//    public void snakeLengthCheck() {
//        int bodyToBeGrownBy = 2;
//        System.out.println("My snake: " + this.SNAKE.toString() + "\n");
//
//
//        Cell nextCell = new Cell(0,1);
//        nextCell.setFood();
//        this.BOARD.generateFood(0,1);
//        this.SNAKE.move(nextCell);
//
//        int snakeCurrentLength = this.SNAKE.getLength();
//        System.out.println("My snake: " + this.SNAKE.toString() + ", Grown by length = " + snakeCurrentLength + "\n");
//
//        Assert.assertEquals(bodyToBeGrownBy, snakeCurrentLength);
//    }


//    @Test
//    public void test1_startGame() {
//
//        /**
//         *       _ _ _ _ _
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|H|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//        Assert.fail();
//    }
//
//    @Test
//    public void test2_stepWithoutFood() {
//        //Start the game
//        //Attempt a step. Since food is not there, Snake will not move.
//        /**
//         *       _ _ _ _ _
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|H|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//        Assert.fail();
//    }
//
//    public void test3_stepWithFood() {
//        //Start the game
//        //Place the food in 0, 0
//        //Attempt 4 steps, Snake should consume the food
//
//        // Before
//        /**
//         *       _ _ _ _ _
//         *      |F|_|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|H|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//
//        // After - Body size has increased
//        /**
//         *       _ _ _ _ _
//         *      |H X|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//        Assert.fail();
//    }
//
//    @Test
//    public void test4_existingSnake_StepWithFood() {
//        //Resume an existing game with Head (H)
//        //Place the food(F)
//        //Attempt 2 steps, Snake should consume the food
//        // Before
//        /**
//         *       _ _ _ _ _
//         *      |X X X|_|_|
//         *      |_|_|H|_|_|
//         *      |_|_|_|F|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//
//        // After
//        /**
//         *       _ _ _ _ _
//         *      |X X X|_|_|
//         *      |_|_|X|_|_|
//         *      |_|_|X|X|_|
//         *      |_|_|_|_|_|
//         *      |_|_|_|_|_|
//         *
//         */
//        Assert.fail();
//    }


}
