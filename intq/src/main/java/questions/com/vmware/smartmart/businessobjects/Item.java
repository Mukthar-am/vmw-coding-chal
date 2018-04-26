package questions.com.vmware.smartmart.businessobjects;


/**
 * @Comments by mukthar
 * Refactoring required here:
 *      1. Item properties being public exposes them for a potential hack/runtime modification.
 *      However, Its all good since its not critical but AS A GOOD practise, properties of an pojo are expected to be private
 *      with setters and getters to access those.
 *
 *      2. as per the above, setters and getters apart from Item object properties like name, sellIn and quality to be private.
 *
 *      3. Global variables to be in upper case rather than camel case as per Java programming guidelines but should be ok to have for a pojo.
 */

public class Item {
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}