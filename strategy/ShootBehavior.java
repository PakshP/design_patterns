package strategy;

/**
 * Offensive play for shooting for players
 * 
 * @author paksh patel
 */
public class ShootBehavior implements OffenceBehavior{

    /**
     * Plays the offensive action of taking a shot at the goal.
     * 
     * @return A string describing the offensive action of shooting.
     */
    public String play() {
        return "Taking a shot at the goal.";
    }
    
}
