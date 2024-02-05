package state;

public class SecondGradeState extends State {
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("./state/second.txt");
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }

    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
