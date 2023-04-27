/**
 * The Saucer class.
 * 
 * @author michael gerber.
 * @version 1
 *
 */
public class Saucer extends Enemy {
    public static final int HALF_WIDTH = 10;
    public static final int HALF_HEIGHT = 5;
    public static final int SAUCER_SPEED = 2;
    public static final int SAUCER_POINTS = 400;
    public static final double SPAWN_PROB = 0.002;
    public static final double TURN_PROB = 0.05;

    /**
     * Saucer constructor.
     */
    public Saucer() {
        super(SAUCER_SPEED, Math.max(HALF_WIDTH, HALF_HEIGHT), SAUCER_POINTS);
    }

    /**
     * Draw method.
     */
    public void draw() {
        StdDraw.rectangle(pose.getX(), pose.getY(), HALF_WIDTH, HALF_HEIGHT);
    }

    /**
     * Update method.
     */
    public void update() {
        this.pose = this.pose.move(this.velocity);
        if (pose.getX() < 0) {
            this.points = 0;
            this.setDestroyed(true);
        }
        if (pose.getX() > GameDriver.SCREEN_WIDTH) {
            this.points = 0;
            this.setDestroyed(true);
        }

        if (pose.getY() < 0) {
            this.points = 0;
            this.setDestroyed(true);

        }
        if (pose.getY() > GameDriver.SCREEN_HEIGHT) {
            this.points = 0;
            this.setDestroyed(true);
        }

        if (GameDriver.GENERATOR.nextDouble() < TURN_PROB) {
            velocity = velocity.newHeading(AsteroidsGame.randomHeading());
        }

    }

}
