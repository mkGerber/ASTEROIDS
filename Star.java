/**
 * This is the star class.
 * 
 * @author michael
 * @version 1
 */

public class Star implements Drawable {

    public static final int STAR_RADIUS = 1;
    private Point location;

    /**
     * This is the constructor.
     * 
     * @param x coordinate
     * @param y coordinate
     */
    public Star(double x, double y) {
        location = new Point(x, y);
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
     * This is the draw method.
     */
    public void draw() {

        StdDraw.filledCircle(location.getX(), location.getY(), STAR_RADIUS);
    }
}
