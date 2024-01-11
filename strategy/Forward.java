package strategy;

public class Forward extends Player{
    public Forward(String firstName, String lastName){
        super(firstName, lastName);
        setDefenceBehavior();
        setOffenceBehavior();
    }


    public void setDefenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 4){
            defenceBehavior = new ChasePuckBehavior();
        } else if (prob <= 9) {
            defenceBehavior = new BlockBehavior();
        }
    }

    public void setOffenceBehavior() {
        int prob = super.rand.nextInt(10);
        if(prob <= 4) {
        offenceBehavior = new PassBehavior();
       } else if (prob <= 9){
        offenceBehavior = new ShootBehavior();
       }
    }

    @Override
    public String toString(){
        return super.toString() + " plays the position Forward";
    }
    
}
