package observer;

import java.util.ArrayList;

public class Cartel implements Observer {

    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting sighting = new Sighting(location, description, accomplices);
        this.sightings.add(sighting);
    }

    public String getLog() {
        String ret = "";
        for (Sighting sighting : sightings) {
            ret += sighting.getLocation() + " (" + sighting.getDetails() + "), with " + sighting.getAccomplices()
                    + "\n";
        }
        return ret;
    }
}
