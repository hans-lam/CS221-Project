package ui;

import model.classes.Barbarian;
import model.classes.Bard;
import model.classes.Cleric;
import model.classes.Monk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SaveAndLoadClasses {
    public static void main(String[] args) throws IOException {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.save();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.save();

        Barbarian myBarbarian = new Barbarian();
        myBarbarian.getClassInfo();
        myBarbarian.save();

        Cleric myCleric = new Cleric();
        myCleric.getClassInfo();
        myCleric.save();

        // this reads the chosen file
        BufferedReader br = new BufferedReader(new FileReader("Cleric.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
