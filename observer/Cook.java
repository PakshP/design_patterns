package observer;

import java.util.ArrayList;

public class Cook {
    
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name){

    }
    
    public void registerObserver(Observer observer){

    }

    public void notifyObservers(String location, String descriptionm, ArrayList<String> accomplices){

    }

    public void enterSighting(String location, String description, String accomplices){

    }

    public String getName(){
        return name;
    }

}
