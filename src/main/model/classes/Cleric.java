package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static model.classes.ClericDescriptions.*;

public class Cleric implements Classes {
    private String cleric;

    public Cleric() {
        this.cleric = "Cleric traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        setTraits(Spellcasting, DivineDomain);
        return cleric;
    }

    @Override
    public String getLevelTwoTraits() {
        setTraits(ChannelDivinity, DivineDomainFeature);
        return cleric;
    }

    // EFFECTS: returns and prints out cleric
    @Override
    public String print() {
        System.out.println(cleric);
        return cleric;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return cleric;
    }

    // REQUIRES: cleric cannot be null
    // EFFECTS: saves cleric to a file named Cleric.txt
    @Override
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Cleric.txt"));
            writer.write(cleric);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // MODIFIES: this
    // EFFECTS: sets cleric to be equal to some traits
    @Override
    public void setTraits(String trait1, String trait2) {
        this.cleric = cleric + "\n" + trait1 + "\n" + trait2;
    }
}
