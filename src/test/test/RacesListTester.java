package test;

import model.race.Goblin;
import model.race.Races;
import model.race.RacesList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacesListTester {
    RacesList racesList;
    Races r;

    @BeforeEach
    public void runBefore() {
        racesList = new RacesList();
    }


    @Test
    void testAddRace() {
        r = new Goblin("s","s","s","s","s","s","s");
        racesList.setTriggerTrue();
        racesList.addRace(r);
        assertEquals(r, racesList.getFirst());

        racesList.setTriggerFalse();
        racesList.addRace(r);
        assertEquals(racesList.failMessage(), racesList.getFailMessage());
    }
}
