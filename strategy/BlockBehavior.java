package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior{

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
