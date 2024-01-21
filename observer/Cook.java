package observer;

import java.util.ArrayList;

/**
 * The Cook class implements the Subject interface and represents a cook being observed by observers, i.e. Police and Cartel.
 * 
 * @author Paksh Patel
 */
public class Cook implements Subject {

    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructs a Cook object with the specified name and initializes the observers ArrayList.
     *
     * @param name The name of the cook.
     */
    public Cook(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * Registers an observer to receive notifications about the cook.
     *
     * @param observer The observer to be registered.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of registered observers.
     *
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with information about a new cook sighting.
     *
     * @param location The location where the cook was sighted.
     * @param description A description of the sighting.
     * @param accomplices ArrayList of accomplices associated with the sighting.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * Enters a new cook sighting and notifies observers.
     *
     * @param location The location where the cook was sighted.
     * @param description A description of the sighting.
     * @param accomplices Comma-separated string of accomplices associated with the sighting.
     */
    public void enterSighting(String location, String description, String accomplices) {
        ArrayList<String> accompliceList = new ArrayList<>();
        for (String accomplice : accomplices.split(",")) {
            accompliceList.add(accomplice.trim());
        }
        notifyObservers(location, description, accompliceList);
    }

    /**
     * Retrieves the name of the cook.
     *
     * @return The name of the cook.
     */
    public String getName() {
        return this.name;
    }

}
