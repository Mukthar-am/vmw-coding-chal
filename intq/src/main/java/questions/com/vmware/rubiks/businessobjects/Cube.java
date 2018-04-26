package questions.com.vmware.rubiks.businessobjects;


/**
 * Description: individual cube, building blocks of the Rubik's grid
 */
public class Cube {
    private String surfaceColor1;
    private String surfaceColor2;
    private String surfaceColor3;
    private String surfaceColor4;
    private String surfaceColor5;
    private String surfaceColor6;

    /**
     * Description: Constructor overloading, as its a light weight operation and reducing the lines of code at the
     * Grid.java class at the time of grid generation.
     *
     * @param - color of the cube
     */
    public Cube(String color1,
                String color2,
                String color3,
                String color4,
                String color5,
                String color6) {

        this.surfaceColor1 = color1;
        this.surfaceColor2 = color2;
        this.surfaceColor3 = color3;
        this.surfaceColor4 = color4;
        this.surfaceColor5 = color5;
        this.surfaceColor6 = color6;

    }


    /**
     * ToDo: Need to re-think of holding the objects better here.
     */
    public String getSurfaceColor1() {
        return this.surfaceColor1;
    }

    public String toString() {
        return "[Cube:- SurfaceColor1=" + this.surfaceColor1 + "]";
    }
}
