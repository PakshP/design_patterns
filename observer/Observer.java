package observer;

import java.util.ArrayList;

/**
 * The Observer interface defines methods that observers must implement to receive and process updates
 * about cook sightings.
 * 
 * @author Paksh Patel
 */
public interface Observer {
    
    /**
     * Updates the observer with information about a new cook sighting.
     *
     * @param location The location where the cook was sighted.
     * @param description A description of the sighting.
     * @param accomplices ArrayList of accomplices associated with the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices);

    /**
     * Retrieves the log of sightings in a formatted string.
     *
     * @return A string containing the log of sightings.
     */
    public String getLog();
}