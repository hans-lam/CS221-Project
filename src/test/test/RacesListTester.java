package test;

import model.race.Goblin;
import model.race.Races;
import model.race.RacesList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RacesListTester {
    private RacesList racesList;
    private Races r;

    @BeforeEach
    void runBefore() {
        racesList = new RacesList();
    }


    @Test
    void testAddRace() {
        r = new Goblin("s","s","s","s","s","s","s");
        racesList.setTriggerOn();
        racesList.addRace(r);
        assertEquals(r, racesList.getFirst());
    }

    @Test
    void testAddRaceFail() {
        r = new Goblin("s","s","s","s","s","s","s");
        racesList.addRace(r);
        assertEquals(racesList.failMessage(), racesList.getFailMessage());
    }
}
