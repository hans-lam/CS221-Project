package ui;

import model.race.*;

public class ObserverRunner {
    public static void main(String[] args) {
        RacesList races = new RacesList();
        RaceUpdater race1 = new RaceUpdater(0);
        Races goblin = new Goblin("s", "s", "s", "s", "s", "s",
                "s");
        Races goliath = new Goliath("s", "s", "s", "s", "s", "s",
                "s");

        races.addObserver(race1);

        System.out.println("here are your races");
        races.addRace(goblin);
        races.addRace(goliath);
    }
}
