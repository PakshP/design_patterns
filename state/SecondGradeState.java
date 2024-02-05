package state;

/**
 * A class representing the state of a spelling list for second graders.
 * 
 * @author Paksh Patel
 */
public class SecondGradeState extends State {

    /**
     * Constructs a SecondGradeState object.
     * 
     * @param spellingList the spelling list
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/second.txt");
    }

    /**
     * Increases the grade of the spelling list.
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    /**
     * Decreases the grade of the spelling list.
     */
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
