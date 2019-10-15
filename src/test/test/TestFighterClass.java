package test;

import model.classes.Barbarian;
import model.classes.Classes;
import model.classes.Fighter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFighterClass {
    private Classes testFighter;

    @BeforeEach
    void runBefore() {
        testFighter = new Fighter();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testFighter.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testFighter.getLevelTwoTraits());
    }

    @Test
    void testPrint() {
        Classes testFighter2 = new Fighter();
        assertEquals(testFighter2, testFighter.print());
    }
}
