package strategy;

import java.util.Scanner;

public class HockeyDriver {
	private Scanner scanner;
	private Team mapleLeafs;

	public HockeyDriver() {
		scanner = new Scanner(System.in);
	}

	public void play() {
		mapleLeafs = initializeTeam();
		displayTeam();
		displayPossessionStatus();

		while (true) {
			int command = getCommand();

			if (command == 3) {
				break;
			} else if (command == 1) {
				System.out.println("\n####### Executing Play ####### ");
				mapleLeafs.executePlay();
			} else if (command == 2) {
				System.out.println("\n####### Possession Change ####### ");
				mapleLeafs.changePossession();
				displayPossessionStatus();
			}
		}

		System.out.println("Goodbye");
	}

	private Team initializeTeam() {
		Team mapleLeafs = new Team("Maple Leafs");
		mapleLeafs.addTeamMember("Matt", "Murray", PlayerType.GOALIE);
		mapleLeafs.addTeamMember("John", "Tavares", PlayerType.FORWARD);
		mapleLeafs.addTeamMember("Phil", "Kessel", PlayerType.FORWARD);
		mapleLeafs.addTeamMember("Timothy", "Liljegren", PlayerType.DEFENCE_MAN);
		mapleLeafs.addTeamMember("Justin", "Holl", PlayerType.DEFENCE_MAN);
		return mapleLeafs;
	}

	private void displayTeam() {
		System.out.println("\n####### " + mapleLeafs.getName() + "####### ");

		for (Player player : mapleLeafs.getPlayers()) {
			System.out.println(" - " + player);
		}
	}

	private void displayPossessionStatus() {
		if (mapleLeafs.hasPossession()) {
			System.out.println("Has Possession");
		} else {
			System.out.println("Doesn't have Possession");
		}
	}

	private int getCommand() {
		while (true) {
			System.out.print("\n1. Execute Play, 2. Change Possession, 3. Quit: ");
			try {
				int option = Integer.parseInt(scanner.nextLine().trim());

				if (option >= 1 && option <= 3) {
					return option;
				}
			} catch (Exception e) {
			}
			System.out.println("Please enter a valid number between 1 and 3.");
		}

	}

	public static void main(String[] args) {
		HockeyDriver hockey = new HockeyDriver();
		hockey.play();
	}

}
