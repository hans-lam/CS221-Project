package model.race;

import java.util.ArrayList;
import java.util.List;

public class RacesList extends Subject {
    // concrete Subject
    private List<Races> races;
    private Boolean triggered;
    private String failMessage;

    public RacesList() {
        races = new ArrayList<>();
    }

    public boolean setTriggerTrue() {
        triggered = true;
        return triggered;
    }

    public boolean setTriggerFalse() {
        triggered = false;
        return triggered;
    }

    public void addRace(Races r) {
        if (triggered = true) {
            races.add(r);
            notifyObservers(r);
        } else {
            failMessage();
        }
    }

    public String failMessage() {
        failMessage = "Needs to be triggered";
        return failMessage;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public Races getFirst() {
        return races.get(0);
    }
}
