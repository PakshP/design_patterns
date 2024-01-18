package observer;

import java.util.ArrayList;

public class Police implements Observer {

    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook) {
        this.notes = "";
        this.locations = new ArrayList<>();
        this.people = new ArrayList<>();
        this.cook = cook;
        this.cook.registerObserver(this);
    }

    public void update(String location, String description, ArrayList<String> accomplices) {
        this.locations.add(location);
        this.notes += "- " + description + "\n";
        for (String accomplice : accomplices) {
            if (!people.contains(accomplice)) {
                this.people.add(accomplice);
            }
        }
    }

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
