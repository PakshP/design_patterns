import java.util.Scanner;

public class UI {
    private Scanner reader;
    private static final String YES = "y";
    private static final String NO = "n";

    public UI() {
        reader = new Scanner(System.in);
    }

    public void run() {
        FlashCards flashCards = FlashCards.getInstance();
        clear();
        System.out.println("Welcome to our Flash Card Studying System!\n");

        while (true) {
            Word word = flashCards.getWord();
            System.out.println("***** " + word.getWord() + " *****");

            System.out.print("Press enter to see the definition.");
            reader.nextLine();
            clear();

            System.out.println("***** " + word.getWord() + " *****");
            System.out.println(word.getDescription() + "\n");

            if (!playAgain())
                break;
            clear();
        }
        System.out.println("Have a nice day");
    }

    public boolean playAgain() {
        while (true) {
            System.out.println("Would you like to continue (Y)es or (N)o: ");

            String result = reader.nextLine().trim();

            if (result.equals(YES)) {
                return true;
            } else if (result.equals(NO)) {
                return false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();
    }
}
