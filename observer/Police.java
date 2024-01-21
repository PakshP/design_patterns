package observer;

import java.util.ArrayList;

/**
 * The Police class implements the Observer interface and represents a police observer that tracks cook sightings,
 * maintains a log of locations, notes, and accomplices associated with the sightings.
 * 
 * @author Paksh Patel
 */
public class Police implements Observer {

    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * Constructs a Police object with the specified cook (Subject) and registers itself as an observer.
     * Initializes locations, notes, and people ArrayLists.
     *
     * @param cook The cook being observed.
     */
    public Police(Subject cook) {
        this.notes = "";
        this.locations = new ArrayList<>();
        this.people = new ArrayList<>();
        this.cook = cook;
        this.cook.registerObserver(this);
    }

    /**
     * Updates the Police with information about a new cook sighting.
     *
     * @param location The location where the cook was sighted.
     * @param description A description of the sighting.
     * @param accomplices ArrayList of accomplices associated with the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        this.locations.add(location);
        this.notes += "- " + description + "\n";
        for (String accomplice : accomplices) {
            if (!people.contains(accomplice)) {
                this.people.add(accomplice);
            }
        }
    }

    /**
     * Retrieves the log of locations, notes, and accomplices in a formatted string.
     *
     * @return A string containing the log of locations, notes, and accomplices.
     */
    public String getLog() {
        String log = "Locations:\n";
        for (String location : locations) {
            log += "- " + location + "\n";
        }
        log += "\nNotes:\n" + notes + "\nAccomplices:\n";
        for (String person : people) {
            log += "- " + person + "\n";
        }
        return log;
    }
}
