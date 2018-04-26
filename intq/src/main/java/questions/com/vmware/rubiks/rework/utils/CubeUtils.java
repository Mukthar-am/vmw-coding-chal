package questions.com.vmware.rubiks.rework.utils;

import questions.com.vmware.rubiks.rework.businessobjects.Cube;

public class CubeUtils {

    public static void rotate(Cube cube) {
        /**
         map each cube numbers 1-54, faces 1 – 4 are 1 – 36 while top faceSplits is 37 - 45 and bottom is 46 – 54
         1 turn: clockwise = +9
         1 turn: counterclockwise = -9 loops back to 45
         1 turn: up = + 37
         1 turn: down = -37 loops back to 46
         2 turns: clockwise = +9(2)
         2 turns: counterclockwise = -9(2)
         2 turns: up = +37(2)
         2 turns: down = -37(2)
         3 turns: clockwise = +9(3)
         3 turns: counterclockwise = -9(3)
         3 turns: up = +37(3)
         3 turns: down = -37(3)
         */
    }
}
