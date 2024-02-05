package state;

/**
 * A class representing the state of a spelling list.
 * 
 * @author Paksh Patel
 */
public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Constructs a SpellingList object.
     */
    public SpellingList() {
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }

    /**
     * Returns the next word in the spelling list.
     * 
     * @return the next word in the spelling list
     */
    public String getNextWord() {
        return state.getNextWord();
    }

    /**
     * Increases the grade of the spelling list.
     */
    public void increaseGrade() {
        state.increaseGrade();
    }

    /**
     * Decreases the grade of the spelling list.
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }

    /**
     * Returns the first grade state.
     * 
     * @return the first grade state
     */
    public State getFirstGradeState() {
        return firstGradeState;
    }

    /**
     * Returns the second grade state.
     * 
     * @return the second grade state
     */
    public State getSecondGradeState() {
        return secondGradeState;
    }

    /**
     * Returns the third grade state.
     * 
     * @return the third grade state
     */
    public State getThirdGradeState() {
        return thirdGradeState;
    }

    /**
     * Sets the state of the spelling list.
     * 
     * @param state the state of the spelling list
     */
    public void setState(State state) {
        this.state = state;
    }
}
