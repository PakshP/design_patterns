package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * A class representing the state of a spelling list.
 * 
 * @author Paksh Patel
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Constructs a State object.
     * 
     * @param spellingList the spelling list
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
        this.words = new ArrayList<String>();
    }

    /**
     * Returns the next word in the spelling list.
     * 
     * @return the next word in the spelling list
     */
    public String getNextWord() {
        if (words.isEmpty()) {
            return "No words available";
        }
        int index = rand.nextInt(words.size());
        return words.get(index);
    }

    /**
     * abstract for increasing the grade of the spelling list.
     */
    public abstract void increaseGrade();

    /**
     * abstract for decreasing the grade of the spelling list.
     */
    public abstract void decreaseGrade();
}
