package uiTests;

import org.junit.jupiter.api.Test;
import ui.Feats;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestFeats {
    private Feats testFeats;

    @Test
    void testGetFeats(){
        assertFalse(testFeats.getFeatProficiency());
    }
}
