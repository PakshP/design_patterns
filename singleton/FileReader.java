import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {
    public static final String FILE_NAME = "singleton/txt/words.txt";

    /**
     * Reads in the file and creates a list of anagorams
     * 
     * @param Difficulty Easy, Medium, or Hard
     * @return A list of Anagorams
     */
    public static ArrayList<Word> getWords() {
        ArrayList<Word> words = new ArrayList<Word>();

        try {
            File file = new File(FILE_NAME);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split("#");
                // System.out.println(data);
                if (data.length < 4) {
                    continue;
                }
                words.add(new Word(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim()));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return words;
    }
}
