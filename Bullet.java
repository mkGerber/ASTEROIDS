/**
 * This is the bullet class.
 * 
 * @author Michael
 * @version 1
 *
 */
public class Bullet extends GameElement implements Drawable, Updatable {
    public static final double BULLET_RADIUS = 1.5;
    public static final double BULLET_SPEED = 20;
    public static final double BULLET_DURATION = 20;
    private int counter;

    /**
     * This is the bullet constructor.
     * 
     * @param pose the Pose given.
     */
    public Bullet(Pose pose) {
        super(pose, new Vector2D(pose.getHeading(), BULLET_SPEED), BULLET_RADIUS);
    }

    /**
     * This is the update method.
     */
    public void update() {

        if (counter < 20) {
            this.velocity = this.velocity.newHeading(this.pose.getHeading());
            super.update();
            this.counter += 1;
        } else {
            this.setDestroyed(true);
        }
    }

    /**
     * This is the draw method.
     */
    public void draw() {
        StdDraw.filledCircle(pose.getX(), pose.getY(), BULLET_RADIUS);
    }
}
