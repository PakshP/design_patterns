package decorator;

import java.util.ArrayList;


public abstract class PlayerDecorator extends Player{
    private Player player;
    
    
    public PlayerDecorator(Player player) {
        super(player.lines, player.name);
        this.player = player;
    }

    
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