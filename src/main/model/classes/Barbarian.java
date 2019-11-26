package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static model.classes.BarbarianDescriptions.*;

public class Barbarian implements Classes {
    private String barbarian;

    public Barbarian() {
        this.barbarian = "Barbarian traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        setTraits(Rage, UnarmoredDefense);
        return barbarian;
    }

    @Override
    public String getLevelTwoTraits() {
        setTraits(DangerSense, RecklessAttack);
        return barbarian;
    }

    // EFFECTS: prints and returns barbarian
    @Override
    public String print() {
        System.out.println(barbarian);
        return barbarian;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return barbarian;
    }

    // REQUIRES: barbarian cannot be null
    // EFFECTS: saves barbarian into a file named Barbarian.txt
    @Override
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Barbarian.txt"));
            writer.write(barbarian);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // MODIFIES: this
    // EFFECTS: sets barbarian to be equal to some traits
    @Override
    public void setTraits(String trait1, String trait2) {
        this.barbarian = barbarian + "\n" + trait1 + "\n" + trait2;
    }
}
