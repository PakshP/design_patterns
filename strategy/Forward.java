package strategy;

import java.util.Random;

public class Forward extends Player{
    private Random rand;
    public Forward(String firstName, String lastName){
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
       if(rand.nextBoolean()) {
        offenceBehavior = new PassBehavior();
       } else {
        offenceBehavior = new ShootBehavior();
       }
    }

    @Override
    public String toString(){
        return super.toString() + " plays the position Forward";
    }
    
}
