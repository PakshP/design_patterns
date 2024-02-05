package state;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
        this.words = new ArrayList<String>();
    }

    public String getNextWord() {
        if (words.isEmpty()) {
            return "No words available";
        }
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

    public abstract void increaseGrade();

    public abstract void decreaseGrade();
}
