package questions.com.vmware.rubiks.rework.businessobjects;

/**
 * cube surface object
 */
public class FaceSplit {
    public Color color;

    public FaceSplit(Color color) {
    }

    public enum Color {
        B, G, R, Y, O, P
    }

    public String getName() {
        return this.color.name();
    }

}
