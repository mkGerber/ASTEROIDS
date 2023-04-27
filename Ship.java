
/**
 * This is the Ship Class.
 * 
 * @author Michael
 * @version 1
 */
public class Ship extends GameElement {
    public static final int SHIP_WIDTH = 10;
    public static final int SHIP_HEIGHT = 20;
    public static final double SHIP_TURN = 0.1;
    public static final double SHIP_MOVE = 0.1;
    public static final double FRICTION = 0.02;

    /**
     * This is the ship constructor.
     */
    public Ship() {
        super(new Pose(GameDriver.SCREEN_WIDTH / 2, GameDriver.SCREEN_WIDTH / 2, Math.PI / 2),
                new Vector2D(Math.PI / 2, 0), SHIP_WIDTH);
    }

    /**
     * Turns the ship left.
     */
    public void turnLeft() {
        this.pose = this.pose.newHeading(this.pose.getHeading() + SHIP_TURN);

    }

    /**
     * Turns the ship right.
     */
    public void turnRight() {
        this.pose = this.pose.newHeading(this.pose.getHeading() - SHIP_TURN);

    }

    /**
     * Thrusts the ship.
     */
    public void thrust() {

        Vector2D vel = new Vector2D(this.pose.getHeading(), SHIP_MOVE);
        this.velocity = this.velocity.add(vel);
    }

    /**
     * This draws the ship.
     */
    public void draw() {
        GameUtils.drawPoseAsTriangle(pose, SHIP_WIDTH, SHIP_HEIGHT);
    }

    /**
     * This updates the ship.
     */
    public void update() {
        super.update();
        if (this.velocity.getMagnitude() < .02) {
            this.velocity = velocity.newMagnitude(0);
        }
        if (this.velocity.getMagnitude() >= .02) {
            double speed = this.velocity.getMagnitude() - FRICTION;
            this.velocity = velocity.newMagnitude(speed);
        }

    }

}