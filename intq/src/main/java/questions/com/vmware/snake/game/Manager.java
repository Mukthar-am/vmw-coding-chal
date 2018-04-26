package questions.com.vmware.snake.game;

import questions.com.vmware.snake.businessobjects.Board;
import questions.com.vmware.snake.businessobjects.Cell;
import questions.com.vmware.snake.businessobjects.Directions;

import java.util.Scanner;

public class Manager {
    private boolean RUN = true;
    private Snake SNAKE;
    private Board BOARD;
    private int SNAKE_START_POS = 0;
    private int SNAKE_END_POS = 0;

    private int BOARD_X = 20;
    private int BOARD_Y = 20;


    private int direction;

    int point_x = this.SNAKE_START_POS;
    int point_y = this.SNAKE_END_POS;


    public static void main(String[] args) {
        new Manager().start();
    }


    private void start() {
        /** for kill -9 */
        Runtime.getRuntime().addShutdownHook(new ProcessorHook());

        /** snake start position */
        Cell snakeStartPos = new Cell(this.SNAKE_START_POS, this.SNAKE_END_POS);

        this.SNAKE = new Snake(snakeStartPos);      /** init snake */
        this.BOARD = new Board().init(this.BOARD_X, this.BOARD_Y);  /** init board */

        Scanner sc = new Scanner(System.in);

        while (RUN) {
            System.out.println("Enter your move?");
            String move = sc.next().toString();
            System.out.println("Moving - " + move);

            /** Calling setDirection() and obtaining the next cell */
            if (this.SNAKE.move(setDirection(move)) == -1) {
                System.out.printf("GAME OVER as you have hit obstacle (Head or tail for now)");
                System.exit(0);
            }
        }

        sc.close();
    }


    public Cell setDirection(String direction) {

        switch (direction.toLowerCase()) {
            case "left":
                if (this.point_x != 0)
                    this.point_x--;

                break;

            case "right":
                if (this.point_y < this.SNAKE_END_POS)
                    this.point_x++;

                break;

            case "up":
                if (this.point_y != this.SNAKE_END_POS - 1)
                    this.point_y++;


                break;

            case "down":
                if (this.point_x != 0)
                    this.point_y--;

                break;

            default:
                this.direction = Integer.parseInt(String.valueOf(Directions.NONE));
        }

        /** Return the next Cell as per the move chosen */
        return this.BOARD.getBoard()[this.point_x][this.point_y];
    }


    public class ProcessorHook extends Thread {
        @Override
        public void run() {
            System.out.println("Shutting down now.");
            System.exit(0);
        }
    }
}
