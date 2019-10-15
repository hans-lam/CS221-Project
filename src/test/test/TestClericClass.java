package test;

import model.classes.Classes;
import model.classes.Cleric;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClericClass {
    private Classes testCleric;

    @BeforeEach
    void runBefore() {
        testCleric = new Cleric();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testCleric.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testCleric.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        assertEquals(null, testCleric.getClassInfo());
    }

    @Test
    void testPrint() {
        Classes testCleric2 = new Cleric();
        assertEquals(null, testCleric.print());
    }
}
