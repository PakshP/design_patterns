package strategy;

/**
 * Represents a hockey team player that is a defenceman
 * 
 * @author paksh patel
 */
public class Defenceman extends Player{

    /**
     * Initializes firstName and lastName
     * Calls setDefenceBehavior and setOffenceBehavior
     * 
     * @param firstName first name of the defenceman
     * @param lastName last name of the defenceman
     */
    public Defenceman(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the defensive behavior for the defenceman based on random probabilities.
     * 50-50 chance
     */
    public void setDefenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 4){
        defenceBehavior = new ChasePuckBehavior();
        } else if (prob <= 9){
            defenceBehavior = new BlockBehavior();
        }
    }

    /**
     * Sets the offensive behavior for the defenceman based on random probabilities.
     * 90-10 chance
     */
    public void setOffenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 8) {
        offenceBehavior = new PassBehavior();
        } else if (prob <= 9){
            offenceBehavior = new SlapShotBehavior();
        }
    }

    /**
     * Overrides the toString method to provide a custom string representation of the defenceman.
     * 
     * @return A string containing the player's name for the position defenceman
     */
    @Override
    public String toString(){
        return super.toString() + " plays the position Defenceman";
    }
}
