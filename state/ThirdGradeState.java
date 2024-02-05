package state;

/**
 * A class representing the state of a spelling list for third graders.
 * 
 * @author Paksh Patel
 */
public class ThirdGradeState extends State {

    /**
     * Constructs a ThirdGradeState object.
     * 
     * @param spellingList the spelling list
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/third.txt");
    }

    /**
     * Increases the grade of the spelling list.
     * Does nothing because there is no higher grade.
     */
    public void increaseGrade() {

    }

    /**
     * Decreases the grade of the spelling list.
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
