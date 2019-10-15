package test;

import model.classes.Bard;
import model.classes.Monk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMain {
    private Bard testBard;
    private Monk testMonk;

    @BeforeEach
    void runBefore() {
        testBard = new Bard();
        testMonk = new Monk();
    }

    @Test
    void testMainRuns() {
        testBard.getClassInfo();
        testBard.print();


        testMonk.getClassInfo();
        testMonk.print();
    }
}
