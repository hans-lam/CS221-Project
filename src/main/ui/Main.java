package ui;

import model.classes.Bard;
import model.classes.Monk;

public class Main {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.printBard();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.printMonk();
    }
}
