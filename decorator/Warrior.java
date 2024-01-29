package decorator;

/**
 * Warrior class is a concrete class that extends Player. It is a concrete component in the decorator pattern.
 * It is a player that has no armor, shield, or sword.
 * 
 * @author Paksh Patel
 */
public class Warrior extends Player {
    
    /**
     * Constructs a Warrior object with the specified name (String).
     * 
     * @param name The name of the warrior.
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/warrior.txt"), name);
    }
}