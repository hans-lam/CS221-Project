package ModelTests.TestClasses;

import model.classes.CharacterClass;
import model.classes.Classes;
import model.classes.Monk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.classes.Monk.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMonkClass {
    private Classes TestMonk;
    @BeforeEach
    void runBefore() {
        TestMonk = new Monk();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Monk traits: " + "\n" + UnarmoredDefense + "\n" + MartialArts,
                TestMonk.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + UnarmoredMovement + "\n" + Ki,
                TestMonk.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass TestMonk2;
        TestMonk2 = new Monk();

        TestMonk.getLevelOneTraits();
        assertEquals(TestMonk.getLevelTwoTraits(), TestMonk2.getClassInfo());
    }
}
