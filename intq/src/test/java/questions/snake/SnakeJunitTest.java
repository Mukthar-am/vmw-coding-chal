package questions.snake;

import org.junit.Assert;
import org.junit.Test;

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


    @Test
    public void test1_startGame() {
        //Start a 5 X 5 Snake game. Snake will be at the center
        /**
         *       _ _ _ _ _
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|H|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */
        Assert.fail();
    }

    @Test
    public void test2_stepWithoutFood() {
        //Start the game
        //Attempt a step. Since food is not there, Snake will not move.
        /**
         *       _ _ _ _ _
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|H|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */
        Assert.fail();
    }

    public void test3_stepWithFood() {
        //Start the game
        //Place the food in 0, 0
        //Attempt 4 steps, Snake should consume the food

        // Before
        /**
         *       _ _ _ _ _
         *      |F|_|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|H|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */

        // After - Body size has increased
        /**
         *       _ _ _ _ _
         *      |H X|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */
        Assert.fail();
    }

    @Test
    public void test4_existingSnake_StepWithFood() {
        //Resume an existing game with Head (H)
        //Place the food(F)
        //Attempt 2 steps, Snake should consume the food
        // Before
        /**
         *       _ _ _ _ _
         *      |X X X|_|_|
         *      |_|_|H|_|_|
         *      |_|_|_|F|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */

        // After
        /**
         *       _ _ _ _ _
         *      |X X X|_|_|
         *      |_|_|X|_|_|
         *      |_|_|X|X|_|
         *      |_|_|_|_|_|
         *      |_|_|_|_|_|
         *
         */
        Assert.fail();
    }

}
