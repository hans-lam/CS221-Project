package test;

import model.classes.Classes;
import model.classes.Wizard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWizardClass {
    private Classes testWizard;

    @BeforeEach
    void runBefore() {
        testWizard = new Wizard();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals(null, testWizard.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals(null, testWizard.getLevelTwoTraits());
    }

    @Test
    void testPrint() {
        Classes testWizard2 = new Wizard();
        assertEquals(testWizard2, testWizard.print());
    }
}
