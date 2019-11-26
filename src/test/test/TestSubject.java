package test;

import model.race.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubject {
    Subject testSubject;
    RaceObserver o = new RaceUpdater(0);
    List<RaceObserver> testObservers;

    @BeforeEach
    void runBefore() {
        this.testSubject = new RacesList();
        this.testObservers = new ArrayList<>();
    }

    @Test
    void testAddObserver() {
        testSubject.addObserver(o);
        testObservers.add(o);
        assertEquals(testObservers, testSubject.getObservers());
    }

    @Test
    void testNotifyObserver() {
        Races r = new Goblin("s","s","s","s","s","s","s");
        o.update(r);
    }
}
