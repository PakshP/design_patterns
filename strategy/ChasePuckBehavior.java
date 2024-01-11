package strategy;

public class ChasePuckBehavior implements DefenceBehavior{

    @Override
    public String play() {
        return "Chases the puck.";
    }
    
}
