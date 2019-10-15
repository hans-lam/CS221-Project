package test;

import model.classes.Classes;
import model.classes.Rogue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRogueClass {
    private Classes testRogue;

    @BeforeEach
    void runBefore() {
        testRogue = new Rogue();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testRogue.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testRogue.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        assertEquals(null, testRogue.getClassInfo());
    }

    @Test
    void testPrint() {
        Classes testRogue2 = new Rogue();
        assertEquals(null, testRogue.print());
    }
}
