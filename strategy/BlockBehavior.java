package strategy;
import java.util.Random;

/**
 * Block behavior that is set for players using the defence behavior
 * 
 * @author paksh patel
 */
public class BlockBehavior implements DefenceBehavior{

    /**
     * Chooses from three plays randomly, all with equal chances
     * 
     * @return a string representing the defensive action
     */
    public String play() {
        Random rand = new Random();
        int prob = rand.nextInt(9);
        if(prob <= 2){
        return "Blocks player from passing.";
        } else if(prob <= 5){
            return "Blocks player from shooting.";
        } else {
            return "Checks player with puck.";
        }
    }
    
}
