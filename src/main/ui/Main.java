package ui;

import model.classes.Bard;
import model.classes.Monk;

public class Main {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.print();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.print();
    }
}
