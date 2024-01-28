package decorator;

import java.util.ArrayList;


public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    
    public Player(ArrayList<String> lines, String name) {
        this.name = name;
        this.lines = lines;
    }

    
    public String getName() {
        return this.name;
    }

    
    public String toString() {
        StringBuilder bldString = new StringBuilder();
        for(String line: lines) {
            bldString.append("\n" + line);
        }
        return bldString.toString();
    }
}