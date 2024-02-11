import java.util.*;

/**
 * Singleton class to manage flash cards and provide a random word
 * from the list of words.
 * 
 * @author Paksh Patel
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Private constructor to prevent instantiation from other classes.
     * Initializes the random number generator and reads the words from the file.
     * 
     */
    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * Static method to get the instance of the FlashCards class.
     *
     * @return the instance of the FlashCards class
     */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    /**
     * Method to get a random word from the list of words.
     *
     * @return the random word
     */
    public Word getWord() {
        if (words == null || words.isEmpty()) {
            System.out.println("No words available");
            return null;
        }

        int index = rand.nextInt(words.size());
        currentWord = words.get(index);
        return currentWord;
    }

}
