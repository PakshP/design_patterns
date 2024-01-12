package strategy;

/**
 * Represents a hockey team player that is a goalie
 * 
 * @author paksh patel
 */
public class Goalie extends Player {

    /**
     * Initializes the goalie with a first name and last name.
     * Calls setDefenceBehavior and setOffenceBehavior to set defensive and offensive behaviors.
     * 
     * @param firstName first name of the goalie
     * @param lastName last name of the goalie
     */
    public Goalie(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    /**
     * Sets the defensive behavior for the goalie to block the goal.
     */
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Sets the offensive behavior for the goalie to block the goal.
     */
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    /**
     * Overrides the toString method to provide a custom string representation of the goalie.
     * 
     * @return A string containing the player's name for the goalie position
     */
    @Override
    public String toString(){
        return super.toString() + " plays the position Goalie";
}
}