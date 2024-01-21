package observer;

import java.util.ArrayList;

/**
 * The Sighting class represents information about a cook sighting, including location, details, and accomplices.
 * 
 * @author Paksh Patel
 */
public class Sighting {

    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructs a Sighting object with the specified location, details, and accomplices.
     *
     * @param location The location where the cook was sighted.
     * @param details Details of the cook sighting.
     * @param accomplices ArrayList of accomplices associated with the sighting.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Retrieves the location where the cook was sighted.
     *
     * @return The location of the cook sighting.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Retrieves details of the cook sighting.
     *
     * @return Details of the cook sighting.
     */
    public String getDetails() {
        return this.details;
    }

    /**
     * Retrieves a formatted string of accomplices associated with the cook sighting.
     *
     * @return A string containing the names of accomplices, separated by commas.
     */
    public String getAccomplices() {
        String accompliceString = "";
        for (int i = 0; i < accomplices.size(); i++) {
            accompliceString += accomplices.get(i);
            if (i < accomplices.size() - 1) {
                accompliceString += ", ";
            }
        }
        return accompliceString;
    }
}