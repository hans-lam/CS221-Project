package uiTests;

import org.junit.jupiter.api.Test;
import ui.Backgrounds;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestBackgrounds {
    private Backgrounds testBackgrounds;

    @Test
    void testGetBackgrounds() {
        assertFalse(testBackgrounds.getBackgroundProficiency());
    }
}
