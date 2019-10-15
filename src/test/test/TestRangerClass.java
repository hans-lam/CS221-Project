package test;

import model.classes.Classes;
import model.classes.Ranger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRangerClass {
    private Classes testRanger;

    @BeforeEach
    void runBefore() {
        testRanger = new Ranger();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testRanger.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testRanger.getLevelTwoTraits());
    }

    @Test
    void testRanger() {
        Classes testRanger2 = new Ranger();
        assertEquals(testRanger2, testRanger.print());
    }
}
