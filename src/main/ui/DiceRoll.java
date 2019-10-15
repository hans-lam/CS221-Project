package ui;

import model.dice.DiceNumberException;
import model.dice.DiceRoller;
import model.dice.DiceSidesException;

public class DiceRoll {
    public static void main(String[] args) {
        DiceRoller d20 = new DiceRoller(20, 0);
        d20.diceRoll();
    }
}
