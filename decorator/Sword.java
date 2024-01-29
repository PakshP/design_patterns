package decorator;

import java.util.ArrayList;

/**
 * Sword class is a decorator for Player class. It adds sword to the player.
 * 
 * @author Paksh Patel
 */
public class Sword extends PlayerDecorator {
    
    /**
     * Constructs a Sword object with the specified player (Player) and adds sword to the player.
     * 
     * @param player The player being decorated.
     */
    public Sword(Player player) {
        super(player);
        ArrayList<String> swordDetails = FileReader.getLines("decorator/sword.txt");
        integrateDecor(swordDetails);
    }
}