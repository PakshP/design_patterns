package observer;

import java.util.ArrayList;

public class Police {
    
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook){

    }

    public void update(String location, String description, ArrayList<String> accomplices){

    }

    public String getLog(){
        return notes;
    }
}
