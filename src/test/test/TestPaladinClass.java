package test;

import model.classes.Barbarian;
import model.classes.Classes;
import model.classes.Paladin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPaladinClass {
    private Classes testPaladin;

    @BeforeEach
    void runBefore() {
        testPaladin = new Paladin();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testPaladin.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testPaladin.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        assertEquals(null, testPaladin.getClassInfo());
    }

    @Test
    void testPrint() {
        Classes testPaladin2 = new Paladin();
        assertEquals(null, testPaladin.print());
    }
}
