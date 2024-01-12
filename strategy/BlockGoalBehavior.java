package strategy;
import java.util.Random;

/**
 * Block goal behavior that is set as a defence behavior and offence
 * Only the goalie uses this
 * 
 * @return string representation for the chose action
 * 
 */
public class BlockGoalBehavior implements DefenceBehavior,OffenceBehavior{

    public String play() {
        Random rand = new Random();
        int prob = rand.nextInt(10);
        if(prob <=4){
            return "Blocking the Goal.";
        } else if (prob <= 9){
            return "Catching the puck.";
        }
        return null;
    }
}