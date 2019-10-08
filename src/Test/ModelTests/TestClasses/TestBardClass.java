package ModelTests.TestClasses;

import model.classes.Bard;
import model.classes.CharacterClass;
import model.classes.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.classes.Bard.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBardClass {
    private Classes TestBard;

    @BeforeEach
    void runBefore() {
        TestBard = new Bard();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Bard traits: " + "\n" + BardicInspiration + "\n" + Spellcasting,
                TestBard.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + JackOfAllTrades + "\n" + SongOfRest,
                TestBard.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass TestBard2;
        TestBard2 = new Bard();

        TestBard.getLevelOneTraits();
        assertEquals(TestBard.getLevelTwoTraits(), TestBard2.getClassInfo());
    }
}

