package state;

/**
 * A class representing the state of a spelling list for first graders.
 * 
 * @author Paksh Patel
 */
public class FirstGradeState extends State {

    /**
     * Constructs a FirstGradeState object.
     * 
     * @param spellingList the spelling list
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/first.txt");
    }

    /**
     * Increases the grade of the spelling list.
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    /**
     * Decreases the grade of the spelling list.
     * Does nothing because there is no lower grade.
     */
    public void decreaseGrade() {
    }
}
