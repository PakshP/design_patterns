package decorator;

import java.util.ArrayList;

/**
 * Player class is the base class for all players. It is the component in the decorator pattern. 
 * It is an abstract class that is extended by all players.
 * 
 * @author Paksh Patel
 */
public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Constructs a Player object with the specified lines (ArrayList<String>) and name (String). 
     * 
     * @param lines A list of strings associated with the player.
     * @param name The name of the player.
     */
    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    /**
     * Retrieves the name of the player.
     * 
     * @return The name of the player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Retrieves the lines of the player.
     * 
     * @return The lines of the player.
     */
    public String toString() {
        StringBuilder bldString = new StringBuilder();
        for(String line: lines) {
            bldString.append("\n" + line);
        }
        return bldString.toString();
    }
}