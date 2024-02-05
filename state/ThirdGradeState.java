package state;

public class ThirdGradeState extends State {
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/third.txt");
    }

    public void increaseGrade() {

    }

    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
