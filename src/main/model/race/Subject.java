package model.race;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<RaceObserver> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(RaceObserver o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    public void notifyObservers(Races r) {
        for (RaceObserver o : observers) {
            o.update(r);
        }
    }

    public List<RaceObserver> getObservers() {
        return observers;
    }
}
