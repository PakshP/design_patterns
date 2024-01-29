package decorator;
import java.util.ArrayList;

/**
 * Shield class is a decorator for Player class. It adds shield to the player.
 * 
 * @author Paksh Patel
 */
public class Shield extends PlayerDecorator {

    /**
     * Constructs a Shield object with the specified player (Player) and adds shield to the player.
     * 
     * @param player The player being decorated.
     */
    public Shield(Player player) {
        super(player);
        ArrayList<String> shieldDetails = FileReader.getLines("decorator/shield.txt");
        integrateDecor(shieldDetails);
    }
}