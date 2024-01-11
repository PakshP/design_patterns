package strategy;

public class BlockGoalBehavior implements DefenceBehavior,OffenceBehavior{

    public String play() {
        return "Blocking the Goal.";
    }

    
}
