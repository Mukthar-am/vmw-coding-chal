package questions.com.vmware.rubiks.rework.application;

import questions.com.vmware.rubiks.rework.businessobjects.Cube;
import questions.com.vmware.rubiks.rework.utils.CubeUtils;


/**
 * Manager class instantiating the Cube operations
 */
public class Manager {
    private static Cube CUBE;

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createNewCube();

        CubeUtils.rotate(CUBE);
    }

    //calls face and colors and initializes the arrays into a object
    //default config: solid color on each side so each array, representing a face, is set to a solid color
    public void createNewCube() {
        CUBE = new Cube();
    }

}
