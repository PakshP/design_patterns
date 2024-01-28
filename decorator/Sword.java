package decorator;

import java.util.ArrayList;


public class Sword extends PlayerDecorator {
    
    public Sword(Player player) {
        super(player);
        ArrayList<String> swordDetails = FileReader.getLines("decorator/sword.txt");
        integrateDecor(swordDetails);
    }
}