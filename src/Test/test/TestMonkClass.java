package test;

import model.classes.CharacterClass;
import model.classes.Classes;
import model.classes.Monk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.classes.Monk.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMonkClass {
    private Classes testMonk;
    @BeforeEach
    void runBefore() {
        testMonk = new Monk();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Monk traits: " + "\n" + UnarmoredDefense + "\n" + MartialArts,
                testMonk.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + UnarmoredMovement + "\n" + Ki,
                testMonk.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass testMonk2;
        testMonk2 = new Monk();

        testMonk.getLevelOneTraits();
        assertEquals(testMonk.getLevelTwoTraits(), testMonk2.getClassInfo());
    }
}
