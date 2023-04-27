
/**
 * The Enemy Class.
 * 
 * @author michael gerber.
 * @version 1
 */
public abstract class Enemy extends GameElement {
    protected int points;

    /**
     * Enemy constructor.
     * 
     * @param speed speed
     * @param radius speed
     * @param points speed
     */
    public Enemy(double speed, double radius, int points) {
        super(new Pose(AsteroidsGame.randomXPosition(), AsteroidsGame.randomYPosition(), AsteroidsGame.randomHeading()),
                new Vector2D(0, speed), radius);
        this.points = points;
        this.velocity = this.velocity.newHeading(this.pose.getHeading());

    }

    /**
     * Get Points method.
     * 
     * @return int points
     */
    public int getPoints() {
        return this.points;
    }
}
