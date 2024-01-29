package state;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SpellingDriver {
    private static final int NUM_WORDS = 5;
    private Scanner reader;
    private SpellingList spellingList;
    private static final String[] mainOptions = { "Show Round of Words", "Increase Grade", "Decrease Grade", "Quit" };

    public SpellingDriver() {
        reader = new Scanner(System.in);
        spellingList = new SpellingList();
    }

    public void run() {
        clear();
        System.out.println("Welcome to our Spelling Program");
        System.out.println("You must have someone read the words to you.");
        System.out.println("Currently you are in first grade.\n");

        while (true) {
            int option = getUserOption();
            clear();

            if (option == 1) {
                showWordRound();
            } else if (option == 2) {
                spellingList.increaseGrade();
            } else if (option == 3) {
                spellingList.decreaseGrade();
            } else if (option == 4) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Sorry Invalid command");
            }
        }
    }

    private void showWordRound() {
        for (int i = 0; i < NUM_WORDS; i++) {
            System.out.println(spellingList.getNextWord());
            timeout();
            clear();
        }
    }

    private int getUserOption() {
        for (int i = 0; i < mainOptions.length; i++) {
            System.out.println((i + 1) + ". " + mainOptions[i]);
        }
        return Integer.parseInt(reader.nextLine());
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void timeout() {
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    public static void main(String[] args) {
        SpellingDriver driver = new SpellingDriver();
        driver.run();
    }
}
