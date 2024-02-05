package state;

public class FirstGradeState extends State {
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/first.txt");
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    public void decreaseGrade() {
    }
}
