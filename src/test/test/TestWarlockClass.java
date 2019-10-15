package test;

import model.classes.Barbarian;
import model.classes.Classes;
import model.classes.Warlock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWarlockClass {
    private Classes testWarlock;

    @BeforeEach
    void runBefore() {
        testWarlock = new Warlock();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testWarlock.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testWarlock.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        assertEquals(null, testWarlock.getClassInfo());
    }

    @Test
    void testPrint() {
        Classes testWarlock2 = new Warlock();
        assertEquals(null, testWarlock.print());
    }
}
