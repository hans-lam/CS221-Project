package ui;

import model.classes.Bard;
import model.classes.Monk;

public class SaveClasses {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.saveBard();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.saveMonk();
    }
}
