package test;

import model.race.Races;
import model.race.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHuman {
    private String abilityScores;
    private String size;
    private String speed;
    private String age;
    private String alignment;
    private String racialTraits;
    private String languages;
    private Races Human;

    @BeforeEach
    void runBefore() {
        Human = new Human(abilityScores, size, speed, age, alignment, racialTraits, languages);
    }

    @Test
    void testGetRacialTraits() {
        assertEquals(null, Human.getRacialTraits());
    }
}
