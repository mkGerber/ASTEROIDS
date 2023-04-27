/**
 * Asteroid class.
 * 
 * @author michael gerber.
 * @version 1
 *
 */
public class Asteroid extends Enemy {
    public static final int ASTEROID_SPEED = 1;

    /**
     * Asteroid constructor.
     * 
     * @param size enum
     */
    public Asteroid(AsteroidSize size) {
        super(ASTEROID_SPEED, size.getRadius(), size.getPoints());
    }

    /**
     * Draw method.
     */
    public void draw() {
        StdDraw.circle(this.pose.getX(), this.pose.getY(), this.getRadius());
    }
}
