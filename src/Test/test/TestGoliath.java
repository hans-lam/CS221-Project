package test;

import model.race.Goliath;
import model.race.Races;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.race.Goliath.NaturalAthlete;
import static model.race.Goliath.PowerfulBuild;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGoliath {
        private String abilityScores = "Str +2, Con +1";
        private String size = "Medium";
        private String speed = "30 ft.";
        private String age ="Goliaths have lifespans comparable to humans. They enter adulthood in their late teens "
                + "and usually live less than a century.";
        private String alignment = "Goliath society, with its clear roles and tasks, has a strong lawful bent. "
                + "The goliath sense of fairness, balanced with an emphasis no self sufficiency and personal "
                + "accountability, pushes them toward neutrality.";
        private String racialTraits = "";
        private String languages = "You can speak, read, and write Common and Giant.";
        private Races Goliath;

        @BeforeEach
        void runBefore() {
            Goliath = new Goliath(abilityScores, size, speed, age, alignment, racialTraits, languages);
        }

        @Test
        void testGetRacialTraits() {
            assertEquals("Powerful Build: " + PowerfulBuild + "\n" + "Natural Athlete: " + NaturalAthlete,
                    Goliath.getRacialTraits());
        }

        @Test
        void testGetAbilityScores() {
            assertEquals(abilityScores, Goliath.getAbilityScores());
        }

        @Test
        void testGetSize() {
            assertEquals(size, Goliath.getSize());
        }

        @Test
        void testGetSpeed() {
            assertEquals(speed, Goliath.getSpeed());
        }
    }

