package state;

public class SpellingList {
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    public SpellingList() {
        firstGradeState = new FirstGradeState();
        secondGradeState = new SecondGradeState();
        thirdGradeState = new ThirdGradeState();
        state = firstGradeState;
    }
    public void increaseGrade() {
        state.increaseGrade();
    }
    public void decreaseGrade() {
        state.decreaseGrade();
    }
    public State getFirstGradeState() {
        return firstGradeState;
    }
    public State getSecondGradeState() {
        return secondGradeState;
    }
    public State getThirdGradeState() {
        return thirdGradeState;
    }
}
