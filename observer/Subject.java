package observer;

import java.util.ArrayList;

/**
 * The Subject interface defines methods that subjects (such as Cook) must implement to manage their observers.
 * 
 * @author Paksh Patel
 */
public interface Subject {

    /**
     * Registers an observer to receive notifications from the subject.
     *
     * @param observer The observer to be registered.
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of registered observers.
     *
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies all registered observers with information about a new event (e.g., cook sighting).
     *
     * @param location The location of the event.
     * @param description A description of the event.
     * @param accomplices ArrayList of accomplices associated with the event.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}