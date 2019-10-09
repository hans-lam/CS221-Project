package test;

import model.race.Goblin;
import model.race.Races;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.race.Goblin.DarkVision;
import static model.race.Goblin.NimbleEscape;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGoblin {
    private String abilityScores = "Dex +2, Con +1";
    private String size = "Small";
    private String speed = "30 ft.";
    private String age = "Goblins reach adulthood around age 8. They age noticeably faster than humans, and though "
            + "few goblins live to old age, the most cautious rarely live longer than 60 years.";
    private String alignment = "Most of the goblins of Ravnica are chaotic, with no inclination towards good or evil.";
    private String racialTraits = "";
    private String languages = "You can speak, read, and write Common and Goblin. In Ravnica, Goblin is a simplistic "
            + "language with a limited vocabulary and fluid rules of grammar, unsuited for any sophisticated "
            + "conversation.";
    private Races Goblin;

    @BeforeEach
    void runBefore() {
        Goblin = new Goblin(abilityScores, size, speed, age, alignment, racialTraits, languages);
    }

    @Test
    void testGetRacialTraits() {
        assertEquals("DarkVision: " + DarkVision + "\n" + "Nimble Escape: " + NimbleEscape,
                Goblin.getRacialTraits());
    }

    @Test
    void testGetAbilityScores() {
        assertEquals(abilityScores, Goblin.getAbilityScores());
    }

    @Test
    void testGetSize() {
        assertEquals(size, Goblin.getSize());
    }

    @Test
    void testGetSpeed() {
        assertEquals(speed, Goblin.getSpeed());
    }
}
