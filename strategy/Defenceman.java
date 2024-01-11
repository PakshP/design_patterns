package strategy;
import java.util.Random;

public class Defenceman extends Player{
    public Defenceman(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    public void setDefenceBehavior() {
        Random rand = new Random();
        int prob = rand.nextInt(10);
        if(prob <= 4){
        defenceBehavior = new ChasePuckBehavior();
        } else if (prob <= 9){
            defenceBehavior = new BlockBehavior();
        }
    }

    public void setOffenceBehavior() {
        Random rand = new Random();
        int prob = rand.nextInt(10);
        if(prob <= 8) {
        offenceBehavior = new PassBehavior();
        } else if (prob <= 9){
            offenceBehavior = new SlapShotBehavior();
        }
    }

    public String toString(){
        return super.toString() + " plays the position Defenceman";
    }
}
