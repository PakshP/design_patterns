package strategy;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private boolean possession;
    private Random random;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
        random = new Random();
        possession = random.nextBoolean();
    }

    public void addTeamMember(String firstName, String lastName, PlayerType type) {
        if (type.equals(PlayerType.GOALIE)) {
            players.add(new Goalie(firstName, lastName));
        } else if (type.equals(PlayerType.FORWARD)) {
            players.add(new Forward(firstName, lastName));
        } else if (type.equals(PlayerType.DEFENCE_MAN)) {
            players.add(new Defenceman(firstName, lastName));
        } else {
            System.out.println("Sorry, " + teamName + " wasn't added to the team.");
        }
    }

    public void changePossession() {
        possession = !possession;
    }

    public void executePlay() {
        for (Player player : players) {
            System.out.println(player + " - " + player.play(possession));
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return teamName;
    }

    public boolean hasPossession() {
        return possession;
    }
}
