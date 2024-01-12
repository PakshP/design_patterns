package strategy;
import java.util.Random;

/**
 * A hockey team player
 * @author paksh patel
 * 
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    /**
     * Constructor for the Player class.
     * Initializes the first name, last name, and random number generator
     * @param firstName first name of the player
     * @param lastName last name of the player
     * 
     */
    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
    }

    /**
     * Abstract methods to set the defence behavior for the player.
     * Subclasses must implement these methods
     * 
     */
    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    /**
     * Creates a string for the players action based on possession
     * If possession is true, then the offence plays are use else the defence plays are used
     * 
     * @reutrn string representing the play for each possession
     * @param possession boolean indicating if they have possession or not
     * 
     */
    public String play(boolean possession){
       if (possession){
        return offenceBehavior.play();
       } else {
        return defenceBehavior.play();
       }
    }

    /**
     * Creates a string for the name of the player
     * @return a string of the player name
     */
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
