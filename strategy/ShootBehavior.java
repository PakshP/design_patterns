package strategy;

public class ShootBehavior implements OffenceBehavior{

    @Override
    public String play() {
        return "Taking a shot at the goal.";
    }
    
}
