package strategy;

public class BlockGoalBehavior implements DefenceBehavior,OffenceBehavior{

    @Override
    public String play() {
        return "Blocking the Goal.";
    }

    
}
