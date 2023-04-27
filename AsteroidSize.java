import java.util.Random;

/**
 * Asteroid Size enum.
 * 
 * @author michael gerber.
 * @version 1
 *
 */
public enum AsteroidSize {
    SMALL(10, 200), MEDIUM(20, 100), LARGE(30, 50);

    private int radius;
    private int points;

    /**
     * The constructor.
     * 
     * @param radius radius
     * @param points radius
     */
    AsteroidSize(int radius, int points) {
        this.radius = radius;
        this.points = points;
    }

    /**
     * Get radius method.
     * 
     * @return int
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * Get Radius method.
     * 
     * @return int
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Random Size method.
     * 
     * @return Size
     */
    public static AsteroidSize randomSize() {
        Random r = new Random();
        int choice = r.nextInt(4);
        if (choice == 0) {
            return AsteroidSize.SMALL;
        } else if (choice == 1) {
            return AsteroidSize.MEDIUM;
        } else {
            return AsteroidSize.LARGE;
        }
    }

}
