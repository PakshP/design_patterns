package strategy;
import java.util.Random;

public abstract class Player {
    //private
    private String firstName;
    private String lastName;

    //protected
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    public String play(boolean possession){
       if (possession){
        return offenceBehavior.play();
       } else {
        return defenceBehavior.play();
       }
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
