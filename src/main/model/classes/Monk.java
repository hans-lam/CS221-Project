package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static model.classes.MonkDescriptions.*;

public class Monk implements Classes {
    private String monk;

    public Monk() {
        this.monk = "Monk traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        setTraits(UnarmoredDefense, MartialArts);
        return monk;
    }

    @Override
    public String getLevelTwoTraits() {
        setTraits(UnarmoredMovement, Ki);
        return monk;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return monk;
    }

    // REQUIRES: monk cannot be null
    // EFFECTS: saves monk to a file named Monk.txt
    @Override
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Monk.txt"));
            writer.write(monk);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // MODIFIES: this
    // EFFECTS: sets monk to some traits
    @Override
    public void setTraits(String trait1, String trait2) {
        this.monk = monk + "\n" + trait1 + "\n" + trait2;
    }

    // EFFECTS: returns and prints out monk
    public String print() {
        System.out.println(monk);
        return monk;
    }
}
