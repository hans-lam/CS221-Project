package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bard implements Classes, CharacterClass {
    private String bard;

    public Bard() {
        this.bard = "Bard traits: ";
    }

    private void easyTraits(String bardTrait1, String bardTrait2) {
        this.bard = bard + "\n" + bardTrait1 + "\n" + bardTrait2;
    }

    @Override
    public String getLevelOneTraits() {
        easyTraits(BardDescriptions.BardicInspiration, BardDescriptions.Spellcasting);
        return bard;
    }

    @Override
    public String getLevelTwoTraits() {
        easyTraits(BardDescriptions.JackOfAllTrades, BardDescriptions.SongOfRest);
        return bard;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return bard;
    }

    public void saveBard() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Bard.txt"));
            writer.write(bard);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String print() {
        System.out.println(bard);
        return bard;
    }
}
