package strategy;
import java.util.Random;

/**
 * Block goal behavior that is set as a defence behavior and offence
 * Only the goalie uses this
 * 
 * @return string representation for the chose action
 * 
 * @author paksh patel
 */
public class BlockGoalBehavior implements DefenceBehavior,OffenceBehavior{

    public String play() {
        Random rand = new Random();
        int prob = rand.nextInt(9);
        if(prob <=2){
            return "Blocking the puck with stick.";
        } else if (prob <= 5){
            return "Catching the puck.";
        } else if (prob <= 8){
            return "Blocking the puck with hand.";
        }
        return null;
    }
}