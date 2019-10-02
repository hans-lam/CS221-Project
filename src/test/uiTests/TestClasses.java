package uiTests;

import org.junit.jupiter.api.Test;
import ui.Classes;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestClasses {
    private Classes testClasses;

    @Test
    void testGetClasses() {
        assertFalse(testClasses.getClassProficiency());
    }
}
