package model.race;

import java.util.ArrayList;
import java.util.List;

public class RacesList extends Subject {
    private List<Races> races;

    public RacesList() {
        races = new ArrayList<>();
    }

    // MODIFIES: this
    public void addRace(Races r) {
        races.add(r);
        notifyObservers(r);
    }

    public Races getFirst() {
        return races.get(0);
    }
}
