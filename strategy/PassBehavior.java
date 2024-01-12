package strategy;

/**
 * Offensive play for passing for players
 * 
 * @author paksh patel
 */
public class PassBehavior implements OffenceBehavior{

    /**
     * Plays the offensive action of passing the puck to a teammate.
     * 
     * @return A string describing the offensive action of passing.
     */
    public String play() {
        return "Passing the puck to a teammate.";
    }
    
    
}
