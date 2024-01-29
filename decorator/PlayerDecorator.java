package decorator;

import java.util.ArrayList;

/**
 * PlayerDecorator class is the decorator for Player class. It is the decorator in the decorator pattern.
 * It is an abstract class that is extended by all decorators.
 * 
 * @author Paksh Patel
 */
public abstract class PlayerDecorator extends Player{
    private Player player;
    
    /**
     * Constructs a PlayerDecorator object with the specified player (Player).
     * 
     * @param player The player being decorated.
     */
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    /**
     * Decorates the player with the specified decor (ArrayList<String>).
     * 
     * @param decor The decor being added to the player.
     */
    protected void integrateDecor(ArrayList<String> decor) {
        int i = 0;
        for(String line: this.player.lines) {
            String lineDecor = decor.get(i);
            if (lineDecor.length() == 0) {
                i++;
                continue;
            }
            
            int minLength = Math.min(lineDecor.length(), line.length());
            StringBuilder temp = new StringBuilder();
            int j = 0;

            while (j < minLength) {
                char decChar = lineDecor.charAt(j);
                char lineChar = line.charAt(j);
                temp.append((decChar != ' ') ? decChar : lineChar);
                j++;
            }
            
            temp.append(lineDecor.substring(j));
            temp.append(line.substring(j));

            lines.set(i, temp.toString());
            i++;
        }
    }
}