package iterator;

import java.util.ArrayList;

public class MasterDriver {
	public void run() {
		SCRUMBoard board = new SCRUMBoard("Recipe Application");
		board.addTicket("Create Git Repo", "Katie", 0);
		board.addTicket("Create Recipe Stub", "Jim", 1);
		board.addTicket("Create all JSON Files", "Katie", 3);
		board.addTicket("Create User Class", "Sam", 2);
		board.addTicket("Create Author Class", "Sam", 2);
		board.addTicket("Create Recipe Class", "Jim", 3);

		board.startTicket("Create Git Repo");
		board.finishTicket("Create Git Repo");
		board.startTicket("Create all JSON FIles");
		board.startTicket("Create Recipe Stub");

		System.out.println(board);
	}

	public static void main(String[] args) {
		MasterDriver driver = new MasterDriver();
		driver.run();
	}
}
