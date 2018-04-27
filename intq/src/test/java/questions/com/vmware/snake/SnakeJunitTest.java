package questions.com.vmware.snake;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import questions.com.vmware.snake.businessobjects.Board;
import questions.com.vmware.snake.businessobjects.Cell;
import questions.com.vmware.snake.game.Snake;

/**
 *  Solve the well known snake game.
 *  Lazy snake tries to eat the offered food with out cutting its body in minimal movement.
 *
 *  Representation is purely for understanding.
 *  Please design the game and make the necessary modifications to the test case.
 *  You are encouraged to add relevant new test cases
 *
 *   Following are few of the conventions
 *   Head of the Snake is marked as H, Body and tail is marked as X
 *   Food is indicated by F
 */
public class SnakeJunitTest {
    private Snake SNAKE;
    private Board BOARD;
    private int SNAKE_START_POS = 0;
    private int SNAKE_END_POS = 0;

    private int BOARD_X = 20;
    private int BOARD_Y = 20;

    @BeforeTest
    public void preTest() {
        /** snake start position */
        Cell snakeStartPos = new Cell(this.SNAKE_START_POS, this.SNAKE_END_POS);

        this.SNAKE = new Snake(snakeStartPos);      /** init snake */
        this.BOARD = new Board().init(this.BOARD_X, this.BOARD_Y);  /** init board */
    }


    @Test
    public void CellCompareTest() {
        Cell firstCell = new Cell(0,0);
        Cell secondCell = new Cell(0,0);

        Assert.assertEquals(false, firstCell.equals(secondCell));
    }


    @Test
    public void SnakeCrashTest() {
        boolean gameOver;
        System.out.println("My snake: " + this.SNAKE.toString() + "\n");

        Cell nextCell = new Cell(0,1);
        this.SNAKE.move(nextCell);
        System.out.println("My snake: " + this.SNAKE.toString() + "\n");

        nextCell = new Cell(0,2);
        this.SNAKE.move(nextCell);
        System.out.println("My snake: " + this.SNAKE.toString() + "\n");

        nextCell = new Cell(0,2);
        gameOver = this.SNAKE.move(nextCell);

        if (!gameOver)
            System.out.println("game is over");

        Assert.assertEquals(gameOver, this.SNAKE.move(nextCell));
    }


    @Test
    public void SnakeEatFoodTest() {
        System.out.println("My snake: " + this.SNAKE.toString() + "\n");


        Cell nextCell = new Cell(0,1);
        nextCell.setFood();
        this.BOARD.generateFood(0,1);

        this.SNAKE.move(nextCell);
        System.out.println("My snake: " + this.SNAKE.toString() + "\n");

//        nextCell = new Cell(0,2);
//        this.SNAKE.move(nextCell);
//        System.out.println("My snake: " + this.SNAKE.toString() + "\n");
//
//        nextCell = new Cell(0,2);
//        if (!this.SNAKE.move(nextCell))
//            System.out.println("game is over");
//
//        System.out.println("My snake: " + this.SNAKE.toString() + "\n");
    }






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
