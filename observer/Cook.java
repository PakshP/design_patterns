package observer;

import java.util.ArrayList;

public class Cook implements Subject {

    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices) {
        ArrayList<String> accompliceList = new ArrayList<>();
        for (String accomplice : accomplices.split(",")) {
            accompliceList.add(accomplice.trim());
        }
        notifyObservers(location, description, accompliceList);
    }

    public String getName() {
        return this.name;
    }

}
