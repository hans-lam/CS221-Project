package test;

import model.dice.DiceNumberException;
import model.dice.DiceRoller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiceRollerTest {
    private DiceRoller diceRoller;

    @BeforeEach
    void RunBefore() {
        diceRoller = new DiceRoller(20, 1);
    }

    @Test
    void testSetSides() {
        DiceRoller diceRoller1 = new DiceRoller(10,1);
        diceRoller.setSides(10);
        assertEquals(diceRoller1.getSides(), diceRoller.getSides());
    }

    @Test
    void testSetNumberOfDice() {
        DiceRoller diceRoller1 = new DiceRoller(6,8);
        diceRoller.setNumberOfDice(8);
        assertEquals(diceRoller1.getNumberOfDice(), diceRoller.getNumberOfDice());
    }

    @Test
    void testDiceRoll() {
        assertEquals("Thank you come again!", diceRoller.diceRoll());

        diceRoller.setNumberOfDice(20);
        assertEquals("Thank you come again!", diceRoller.diceRoll());
        diceRoller.setNumberOfDice(1);
        assertEquals("Thank you come again!", diceRoller.diceRoll());
        diceRoller.setSides(1);
        assertEquals("Thank you come again!", diceRoller.diceRoll());

        diceRoller = new DiceRoller(1,1);
        diceRoller.setNumberOfDice(0);
        assertEquals("ERROR: INVALID NUMBER OF DICE." + "Try again next time." + "Thank you come again!",
                diceRoller.diceRoll());
        diceRoller.setNumberOfDice(21);
        assertEquals("ERROR: INVALID NUMBER OF DICE." + "Try again next time." + "Thank you come again!",
                diceRoller.diceRoll());

        diceRoller = new DiceRoller(1,1);
        diceRoller.setSides(0);
        assertEquals("ERROR: INVALID NUMBER OF SIDES." + "Please try again." + "Thank you come again!",
                diceRoller.diceRoll());
        diceRoller.setSides(21);
        assertEquals("ERROR: INVALID NUMBER OF SIDES." + "Please try again." + "Thank you come again!",
                diceRoller.diceRoll());
    }
}
