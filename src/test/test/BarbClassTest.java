package test;

import model.classes.Barbarian;
import model.classes.CharacterClass;
import model.classes.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.classes.Barbarian.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbClassTest {
    private Classes testBarbarian;

    @BeforeEach
    void runBefore() {
        testBarbarian = new Barbarian();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Barbarian traits: " + "\n" + Rage + "\n" + UnarmoredDefense,
                testBarbarian.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + DangerSense + "\n" + RecklessAttack,
                testBarbarian.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass testBarbarian2;
        testBarbarian2 = new Barbarian();

        testBarbarian.getLevelOneTraits();
        assertEquals(testBarbarian.getLevelTwoTraits(), testBarbarian2.getClassInfo());
    }

    @Test
    void testPrint() {
        Classes testBarbarian2 = new Barbarian();
        assertEquals(null, testBarbarian.print());
    }
}
