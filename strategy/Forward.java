package strategy;

/**
 * Represents a hockey team player that is a forward
 * 
 * @author paksh patel
 */
public class Forward extends Player{

    /**
     * Initializes the forward with a first name and last name.
     * Calls setDefenceBehavior and setOffenceBehavior to set defensive and offensive behaviors.
     * 
     * @param firstName first name of the forward
     * @param lastName last name of the forward
     */
    public Forward(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the defensive behavior for the forward based on random probabilities.
     * 50-50 chance
     */
    public void setDefenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 4){
            defenceBehavior = new ChasePuckBehavior();
        } else if (prob <= 9) {
            defenceBehavior = new BlockBehavior();
        }
    }

    /**
     * Sets the offensive behavior for the forward based on random probabilities.
     * 50-50 chance
     */
    public void setOffenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 4) {
        offenceBehavior = new PassBehavior();
       } else if (prob <= 9){
        offenceBehavior = new ShootBehavior();
       }
    }

    /**
     * Overrides the toString method to provide a custom string representation of the forward.
     * 
     * @return A string containing the player's name for the position forward
     */
    @Override
    public String toString(){
        return super.toString() + " plays the position Forward";
    }
    
}
