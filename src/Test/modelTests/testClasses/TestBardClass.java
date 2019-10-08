package modelTests.testClasses;

import model.classes.Bard;
import model.classes.CharacterClass;
import model.classes.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.classes.Bard.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBardClass {
    private Classes testBard;

    @BeforeEach
    void runBefore() {
        testBard = new Bard();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Bard traits: " + "\n" + BardicInspiration + "\n" + Spellcasting,
                testBard.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + JackOfAllTrades + "\n" + SongOfRest,
                testBard.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass testBard2;
        testBard2 = new Bard();

        testBard.getLevelOneTraits();
        assertEquals(testBard.getLevelTwoTraits(), testBard2.getClassInfo());
    }
}

