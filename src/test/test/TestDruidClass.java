package test;

import model.classes.Classes;
import model.classes.Druid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDruidClass {
    private Classes testDruid;

    @BeforeEach
    void runBefore() {
        testDruid = new Druid();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testDruid.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testDruid.getLevelTwoTraits());
    }

    @Test
    void testDruid() {
        Classes testDruid2 = new Druid();
        assertEquals(testDruid2, testDruid.print());
    }
}
