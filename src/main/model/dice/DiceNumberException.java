package model.dice;

public class DiceNumberException extends Exception {

    DiceNumberException() {
        System.out.println("ERROR: INVALID NUMBER OF DICE.");
    }
}
