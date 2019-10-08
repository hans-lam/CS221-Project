package ModelTests.TestRaces;

import model.Race.Goblin;
import model.Race.Races;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.Race.Goblin.DarkVision;
import static model.Race.Goblin.NimbleEscape;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGoblin {
    private String AbilityScores;
    private String Size;
    private String Speed;
    private String Age;
    private String Alignment;
    private String RacialTraits;
    private String Languages;
    private Races Goblin;

    @BeforeEach
    void runBefore() {
        Goblin = new Goblin(AbilityScores, Size, Speed, Age, Alignment, RacialTraits, Languages);
    }

    @Test
    void testGetRacialTraits() {
        assertEquals("DarkVision: " + DarkVision + "\n" + "Nimble Escape: " + NimbleEscape,
                Goblin.getRacialTraits());
    }

    @Test
    void testGetAbilityScores() {
        assertEquals(AbilityScores, Goblin.getAbilityScores());
    }

    @Test
    void testGetSize() {
        assertEquals(Size, Goblin.getSize());
    }

    @Test
    void testGetSpeed() {
        assertEquals(Speed, Goblin.getSpeed());
    }
}
