package test;

import model.classes.Classes;
import model.classes.Sorcerer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSorcererClass {
    private Classes testSorcerer;

    @BeforeEach
    void runBefore() {
        testSorcerer = new Sorcerer();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testSorcerer.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testSorcerer.getLevelTwoTraits());
    }

    @Test
    void testPrint() {
        Classes testSorcerer2 = new Sorcerer();
        assertEquals(testSorcerer2, testSorcerer.print());
    }
}
