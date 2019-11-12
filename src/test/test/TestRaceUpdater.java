package test;

import model.race.Goblin;
import model.race.RaceUpdater;
import model.race.Races;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRaceUpdater {
    RaceUpdater raceUpdater;
    Races testRace;

    @BeforeEach
    void runBefore() {
        this.raceUpdater = new RaceUpdater(0);
    }

    @Test
    void testUpdate() {
        testRace = new Goblin("s","s","s","s","s","s","s");
        raceUpdater.update(testRace);
        assertEquals(1, raceUpdater.getCounter());
    }
}
