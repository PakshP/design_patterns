package observer;

import java.util.ArrayList;

public class Sighting {

    private String location;
    private String details;
    private ArrayList<String> accomplices;

    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    public String getLocation() {
        return this.location;
    }

    public String getDetails() {
        return this.details;
    }

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