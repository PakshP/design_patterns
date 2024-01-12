package strategy;

/**
 * Offensive play for doing a slap shot for players
 * 
 * @author paksh patel
 */
public class SlapShotBehavior implements OffenceBehavior{

    /**
     * Plays the offensive action of performing a slap shot.
     * 
     * @return A string describing the offensive action of shooting the puck from the blue line.
     */
    public String play() {
        return "Shoots the puck from the blue line.";
    }

    
}
