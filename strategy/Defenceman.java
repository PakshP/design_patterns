package strategy;
import java.util.Random;

public class Defenceman extends Player{
    private Random rand;
    public Defenceman(String firstName, String lastName){
        super(firstName, lastName);
        rand = new Random();
        setDefenceBehavior();
        setOffenceBehavior();
    }

    @Override
    public void setDefenceBehavior() {
        if(rand.nextBoolean()){
        defenceBehavior = new ChasePuckBehavior();
        } else {
            defenceBehavior = new BlockBehavior();
        }
    }

    @Override
    public void setOffenceBehavior() {
        if(rand.nextDouble() < 0.9) {
        offenceBehavior = new PassBehavior();
        } else {
            offenceBehavior = new SlapShotBehavior();
        }
    }

    @Override
    public String toString(){
        return super.toString() + " plays the position Defenceman";
    }
}
