package decorator;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class VideoGameDriver {
	private static final String ERROR_USER_CHOICE = "Please enter a valid number between 1 and ";
	private String[] options = { "Sword", "Shield", "Armor", "Quit" };
	private Scanner scanner;

	/*
	 * Original ascii drawing was found here:
	 * https://www.asciiart.eu/people/occupations/knights
	 */
	public VideoGameDriver() {
		scanner = new Scanner(System.in);
	}

	public void play() {
		Player warrior = new Warrior("Sir. Richard");

		while (true) {
			clear();
			System.out.println("Here's our warrior: ");
			System.out.println(warrior);

			displayMenu();
			int userOption = getUserChoice();

			if (userOption == 0) {
				warrior = new Sword(warrior);
			} else if (userOption == 1) {
				warrior = new Shield(warrior);
			} else if (userOption == 2) {
				warrior = new Armor(warrior);
			} else if (userOption == 3) {
				break;
			}
		}

		System.out.println("Goodbye");
	}

	private void displayMenu() {
		System.out.println("What would you like to give our warrior? ");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
	}

	private int getUserChoice() {
		while (true) {
			System.out.print("Enter Number: ");
			try {
				int index = Integer.parseInt(scanner.nextLine());

				if (index < 1 || index > options.length) {
					System.out.println(ERROR_USER_CHOICE + options.length);
					continue;
				}
				return index - 1;

			} catch (Exception e) {
				System.out.println(ERROR_USER_CHOICE + options.length);
			}
		}
	}

	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		VideoGameDriver driver = new VideoGameDriver();
		driver.play();
	}
}
