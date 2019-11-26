package ui;

import model.classes.Barbarian;
import model.classes.Bard;
import model.classes.Cleric;
import model.classes.Monk;
import model.dice.DiceRoller;

public class PrintClassInfo {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.print();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.print();

        Cleric myCleric = new Cleric();
        myCleric.getClassInfo();
        myCleric.print();

        Barbarian myBarbarian = new Barbarian();
        myBarbarian.getClassInfo();
        myBarbarian.print();
    }
}
