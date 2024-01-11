package strategy;

public class PassBehavior implements OffenceBehavior{

    @Override
    public String play() {
        return "Passing the puck to a teammate.";
    }
    
    
}
