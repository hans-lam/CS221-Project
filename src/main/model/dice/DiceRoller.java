package model.dice;

public class DiceRoller {
    private int sides;
    private int numberOfDice;
    private int storage = 0;
    private String errors = "";

    // EFFECTS: creates a default 20-sided die
    public DiceRoller(int sides, int numberOfDice) {
        this.sides = sides;
        this.numberOfDice = numberOfDice;
    }

    public void setSides(int i) {
        this.sides = i;
    }

    public void setNumberOfDice(int i) {
        this.numberOfDice = i;
    }

    public int getSides() {
        return sides;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    // Max Limit for number of sides and dice is 20
    private void rollingDice() throws DiceNumberException, DiceSidesException {
        if (numberOfDice <= 20 && numberOfDice > 0) {
            if (sides <= 20 && sides > 0) {
                diceCalc();
                System.out.println("The sum of your dice rolls is: " + storage);
            } else {
                throw new DiceSidesException();
            }
        } else {
            throw new DiceNumberException();
        }
    }

    public String diceRoll() {
        try {
            rollingDice();
        } catch (DiceNumberException dne) {
            System.out.println("Try again next time.");
            errors = "ERROR: INVALID NUMBER OF DICE." + "Try again next time.";
        } catch (DiceSidesException dse) {
            System.out.println("Please try again.");
            errors = "ERROR: INVALID NUMBER OF SIDES." + "Please try again.";
        } finally {
            System.out.println("Thank you come again!");
        }
        return errors + "Thank you come again!";
    }

    private int diceCalc() {
        for (int i = 0; i < numberOfDice; i++) {
            int diceValue = (int) (Math.random() * sides) + 1;
            System.out.println(diceValue);
            storage = storage + diceValue;
        }
        return storage;
    }
}
