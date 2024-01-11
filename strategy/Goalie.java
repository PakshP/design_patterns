package strategy;

public class Goalie extends Player {
    public Goalie(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }

    @Override
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    @Override
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    @Override
    public String toString(){
        return super.toString() + " plays the position Goalie";
}
}