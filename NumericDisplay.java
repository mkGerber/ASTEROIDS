/**
 * This is the NumericDisplay Abstract Class.
 * 
 * @author michael
 * @version 1
 *
 */
public class NumericDisplay implements Drawable {

    private String prefix;
    private int value;
    private Point location;

    /**
     * This is the constructor.
     * 
     * @param xPos xCord
     * @param yPos yCord
     * @param prefix pref
     * @param value val
     */
    public NumericDisplay(int xPos, int yPos, String prefix, int value) {
        this.location = new Point(xPos, yPos);
        this.prefix = prefix;
        this.value = value;
    }

    /**
     * This is the getLocation method.
     * 
     * @return location
     */
    public Point getLocation() {
        return this.location;
    }

    /**
     * This is the getValue method.
     * 
     * @return value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * This is the setValue method.
     * 
     * @param value val
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * This is the draw method.
     */
    public void draw() {
        StdDraw.text(location.getX() + 30, location.getY(), prefix + value);
    }

}
