package ui;

import model.Class.Bard;
import model.Class.Monk;
import model.Race.Goliath;
import model.Race.Races;

public class Main {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.PrintBard();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.PrintMonk();
    }
}
