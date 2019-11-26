package model.race;

import java.util.ArrayList;
import java.util.List;

public class RacesList extends Subject {
    // concrete Subject
    private List<Races> races;
    private String failMessage;
    private Boolean triggered = false;

    public RacesList() {
        races = new ArrayList<>();
    }


    public boolean setTriggerOn() {
        if (triggered = false) {
            triggered = true;
        } else {
            return true;
        }
        return triggered;
    }


    // MODIFIES: races
    // EFFECTS: adds a race r to races, then notifies observers
    public void addRace(Races r) {
        if (triggered = true) {
            races.add(r);
            notifyObservers(r);
        } else {
            failMessage();
        }
    }

    // EFFECTS: returns the failure message if the trigger has not been triggered
    public String failMessage() {
        failMessage = "Needs to be triggered";
        return failMessage;
    }

    public String getFailMessage() {
        return failMessage;
    }

    // EFFECTS: gets the first item in the races list
    public Races getFirst() {
        return races.get(0);
    }
}
