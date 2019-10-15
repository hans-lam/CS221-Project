package model.dice;

public class DiceSidesException extends Exception {

    DiceSidesException() {
        System.out.println("ERROR: INVALID NUMBER OF SIDES.");
    }
}
