package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static model.classes.BardDescriptions.*;

public class Bard implements Classes {
    private String bard;

    public Bard() {
        this.bard = "Bard traits: ";
    }

    // MODIFIES: this
    // EFFECTS: sets bard to be equal to some traits
    public void setTraits(String trait1, String trait2) {
        this.bard = bard + "\n" + trait1 + "\n" + trait2;
    }

    @Override
    public String getLevelOneTraits() {
        setTraits(BardicInspiration, Spellcasting);
        return bard;
    }

    @Override
    public String getLevelTwoTraits() {
        setTraits(JackOfAllTrades, SongOfRest);
        return bard;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return bard;
    }

    @Override
    // REQUIRES: bard cannot be null
    // EFFECTS: saves bard into a file named Bard.txt
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Bard.txt"));
            writer.write(bard);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // EFFECTS: returns and prints out bard
    @Override
    public String print() {
        System.out.println(bard);
        return bard;
    }
}
