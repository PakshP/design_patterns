package strategy;

/**
 * Chase puck behavior used within the defence behavior
 * 
 * @author paksh patel
 */
public class ChasePuckBehavior implements DefenceBehavior{

    /**
     * The defensive play of chasing the puck
     * 
     * @return string representation for the play
     */
    public String play() {
        return "Chases the puck.";
    }
    
}
