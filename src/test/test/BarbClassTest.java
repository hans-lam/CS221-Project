package test;

import model.classes.Barbarian;
import model.classes.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbClassTest {
    private Classes testBarbarian;

    @BeforeEach
    void runBefore() {
        testBarbarian = new Barbarian();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testBarbarian.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testBarbarian.getLevelTwoTraits());
    }

    @Test
    void testPrint() {
        Classes testBarbarian2 = new Barbarian();
        assertEquals(testBarbarian2, testBarbarian.print());
    }
}
