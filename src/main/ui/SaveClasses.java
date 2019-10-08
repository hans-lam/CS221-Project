package ui;

import model.Class.Bard;
import model.Class.Monk;

public class SaveClasses {
    public static void main(String[] args) {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.SaveBard();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.SaveMonk();
    }
}
