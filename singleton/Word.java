/**
 * Public class to represent a word.
 * It contains the word, type, definition, and a sentence using the word.
 * 
 * @author Paksh Patel
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructor to create a word object.
     *
     * @param word the word
     * @param type the type of the word
     * @param definition the definition of the word
     * @param sentence a sentence using the word
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Method to get the word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Method to get details of the word, including type, definition, and sentence.
     * 
     * @return the details of the word
     */
    public String getDescription() {
        return "Type: " + type + "\nDefinition: " + definition + "\nSentence: " + sentence;
    }
}
