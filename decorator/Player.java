package decorator;

import java.util.ArrayList;

abstract class Player {
    
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name){

    }
    
    public String getName(){
        return name;
    }

    public String toString(){
        return null;
    }
}
