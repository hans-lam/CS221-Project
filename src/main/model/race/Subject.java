package model.race;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // this is the subject
    private List<RaceObserver> observers;

    Subject() {
        observers = new ArrayList<>();
    }

    // MODIFIES: observers
    // EFFECTS: adds an observer to the observers list
    public void addObserver(RaceObserver o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    // EFFECTS: calls the update method when an observer is added
    void notifyObservers(Races r) {
        for (RaceObserver o : observers) {
            o.update(r);
        }
    }

    public List<RaceObserver> getObservers() {
        return observers;
    }
}
