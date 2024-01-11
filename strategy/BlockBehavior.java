package strategy;

public class BlockBehavior implements DefenceBehavior{

    @Override
    public String play() {
        return "Blocking the opponent.";
    }
    
}
