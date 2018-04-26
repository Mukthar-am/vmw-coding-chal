package questions.com.vmware.rubiks.rework.businessobjects;


/**
 * Pre-defined Cube object with constructor overloading - initializing cube with colors over its faceSplits.
 */
public class Cube {
    char[][] cubes = new char[8][3];

    public Cube() {
        char[] color = {'y', 'y', 'y', 'y', 'g', 'g', 'g', 'g', 'w', 'w', 'w', 'w', 'b', 'b', 'b', 'b', 'r', 'r', 'r', 'r', 'o', 'o', 'o', 'o'};
        char[] input = new char[24];
        for (int x = 0; x < 24; x++) {
            input[x] = color[x];
        }

        /** init */


        cubes[0] = new char[]{input[0],    input[16],  input[14]};
        cubes[1] = new char[]{input[1],    input[15],  input[21]};
        cubes[2] = new char[]{input[2],    input[4],   input[17]};
        cubes[3] = new char[]{input[3],    input[20],  input[5]};
        cubes[4] = new char[]{input[10],   input[12],  input[18]};
        cubes[5] = new char[]{input[11],   input[23],  input[13]};
        cubes[6] = new char[]{input[8],    input[19],  input[6]};
        cubes[7] = new char[]{input[9],    input[7],   input[22]};

        char[][] cubieColors = new char[][]{
                {'y', 'r', 'b'}, {'r', 'b', 'y'}, {'b', 'y', 'r'},
                {'y', 'b', 'o'}, {'b', 'o', 'y'}, {'o', 'y', 'b'},
                {'y', 'g', 'r'}, {'g', 'r', 'y'}, {'r', 'y', 'g'},
                {'y', 'o', 'g'}, {'o', 'g', 'y'}, {'g', 'y', 'o'},
                {'w', 'b', 'r'}, {'b', 'r', 'w'}, {'r', 'w', 'b'},
                {'w', 'o', 'b'}, {'o', 'b', 'w'}, {'b', 'w', 'o'},
                {'w', 'r', 'g'}, {'r', 'g', 'w'}, {'g', 'w', 'r'},
                {'w', 'g', 'o'}, {'g', 'o', 'w'}, {'o', 'w', 'g'}
        };
    }

    public char[][] getCubes() {
        return this.cubes;
    }


    public Cube createCube() {
        return this;
    }

    public Cube rotate(int row, int column, String direction, int turns){
        /*Turns must be between 0 - 4
Row must be 1 or 2, column must be 1 or 2, direction must be clockwise, counterclockwise, up or down (0 means no turn, 1 is top row or left column; 2 is bottom row or right column)
*/
        return this;
    }

    public int turns(){
        return -1;
    }


    /** methods for rotation in the give direction */
    public Cube clockwise(){
        return this;
    }

    public Cube counterClockwise(){
        return this;
    }

    public Cube up(){
        return this;
    }

    public Cube down(){
        return this;
    }


}
