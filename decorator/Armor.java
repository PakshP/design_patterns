package decorator;

import java.util.ArrayList;

/**
 * Armor class is a decorator for Player class. It adds armor to the player.
 * 
 * @author Paksh Patel
 */
public class Armor extends PlayerDecorator{
    
    /**
     * Constructs an Armor object with the specified player (Player) and adds armor to the player.
     * 
     * @param player The player being decorated. 
     */
    public Armor(Player player) {
        super(player);
        ArrayList<String> list = FileReader.getLines("decorator/armor.txt");
        integrateDecor(list);
    }
}