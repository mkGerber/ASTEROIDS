/**
 * This is the GameElement Class.
 * 
 * @author michael
 * @version 1
 *
 */

public abstract class GameElement implements Updatable, Drawable {
    protected Pose pose;
    protected Vector2D velocity;
    protected double radius;
    protected boolean destroy;

    /**
     * This is the constructor.
     * 
     * @param pose the pose
     * @param velocity the velocity
     * @param radius the radius
     */
    public GameElement(Pose pose, Vector2D velocity, double radius) {

        this.pose = pose;

        this.velocity = velocity;

        this.radius = radius;
    }

    /**
     * This is the getPose method.
     * 
     * @return pose
     */
    public Pose getPose() {
        return this.pose;
    }

    /**
     * This is the getVelocity method.
     * 
     * @return velocity
     */
    public Vector2D getVelocity() {
        return this.velocity;
    }

    /**
     * This is the getRadius method.
     * 
     * @return radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * This is the isDestroyed method.
     * 
     * @return destroy
     */
    public boolean isDestroyed() {
        return this.destroy;
    }

    /**
     * This is the setDestroyed method.
     * 
     * @param destroyed destroyed
     */
    public void setDestroyed(boolean destroyed) {
        this.destroy = destroyed;
    }

    /**
     * This is the checkCollision method.
     * 
     * @param other GameElement
     * @return boolean
     */
    public boolean checkCollision(GameElement other) {
        double distance = Math.abs(
                Math.pow(this.pose.getX() - other.pose.getX(), 2) + Math.pow(this.pose.getY() - other.pose.getY(), 2));
        double sqrt = Math.sqrt(distance);
        double rad = sqrt - (this.radius + other.radius);
        return rad <= 0;
    }

    /**
     * This is the update method.
     */
    public void update() {
        this.pose = this.pose.move(this.velocity);
        if (pose.getX() < 0) {
            this.pose = this.pose.newX(GameDriver.SCREEN_WIDTH);
        }
        if (pose.getX() > GameDriver.SCREEN_WIDTH) {
            this.pose = this.pose.newX(0);
        }

        if (pose.getY() < 0) {
            this.pose = this.pose.newY(GameDriver.SCREEN_WIDTH);

        }
        if (pose.getY() > GameDriver.SCREEN_HEIGHT) {
            this.pose = this.pose.newY(0);
        }

    }
}
