package ModelTests.TestClasses;

import model.Class.Bard;
import model.Class.CharacterClass;
import model.Class.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.Class.Bard.*;
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

