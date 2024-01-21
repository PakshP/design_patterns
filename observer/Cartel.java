package observer;

import java.util.ArrayList;

/**
 * The Cartel class implements the Observer interface and represents an observer that tracks sightings 
 * of a cook (Subject) and maintains a log of these sightings.
 * 
 * @author Paksh Patel
 */
public class Cartel implements Observer {

    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Constructs a Cartel object with the specified cook (Subject) and registers itself as an observer.
     * Initializes the sightings ArrayList.
     *
     * @param cook The cook being observed.
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }

    /**
     * Updates the Cartel with information about a new sighting.
     *
     * @param location The location where the cook was sighted.
     * @param description A description of the sighting.
     * @param accomplices ArrayList of accomplices associated with the sighting.
     */
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting sighting = new Sighting(location, description, accomplices);
        this.sightings.add(sighting);
    }

    /**
     * Retrieves the log of sightings in a formatted string.
     *
     * @return A string containing the log of sightings.
     */
    public String getLog() {
        String ret = "";
        for (Sighting sighting : sightings) {
            ret += sighting.getLocation() + " (" + sighting.getDetails() + "), with " + sighting.getAccomplices()
                    + "\n";
        }
        return ret;
    }
}
