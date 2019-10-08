package ModelTests.TestRaces;

import model.Race.Goliath;
import model.Race.Races;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static model.Race.Goliath.NaturalAthlete;
import static model.Race.Goliath.PowerfulBuild;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestGoliath {
        private String AbilityScores;
        private String Size;
        private String Speed;
        private String Age;
        private String Alignment;
        private String RacialTraits;
        private String Languages;
        private Races Goliath;

        @BeforeEach
        void runBefore() {
            Goliath = new Goliath(AbilityScores, Size, Speed, Age, Alignment, RacialTraits, Languages);
        }

        @Test
        void testGetRacialTraits() {
            assertEquals("Powerful Build: " + PowerfulBuild + "\n" + "Natural Athlete: " + NaturalAthlete,
                    Goliath.getRacialTraits());
        }

        @Test
        void testGetAbilityScores() {
            assertEquals(AbilityScores, Goliath.getAbilityScores());
        }

        @Test
        void testGetSize() {
            assertEquals(Size, Goliath.getSize());
        }

        @Test
        void testGetSpeed() {
            assertEquals(Speed, Goliath.getSpeed());
        }
    }

