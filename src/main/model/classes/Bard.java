package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bard implements Classes, CharacterClass {
    public static String BardicInspiration = "Bardic Inspiration: \n You can inspire others through stirring words "
            + "or music. To do so, you can use a bonus "
            + "action on your turn to choose one creature other than yourself within 60 feet of you who can hear you. "
            + "That creature gains one Bardic Inspiration die, a d6. \n Once within the next 10 minutes, the creature "
            + "can roll the die and add the number rolled to one ability check, attack roll, or saving throw it makes. "
            + "The creature can wait until after it rolls the d20 before deciding to use the Bardic Inspiration die, "
            + "but must decide before the DM says whether the roll succeeds or fails. Once the Bardic Inspiration die "
            + "is rolled, it is lost. A creature can have only one Bardic Inspiration die at a time. \n You can use "
            + "this feature a number of times equal to your Charisma modifier (a minimum of once). You regain any "
            + "expended uses when you finish a long rest. \n Your Bardic Inspiration die changes when you reach "
            + "certain levels in this class. The die becomes a d8 at 5th level, a d10 at 10th level, and a "
            + "d12 at 15th level.";
    public static String Spellcasting = "I'll add this later.";

    public static String JackOfAllTrades = "Jack Of All Trades: \n Starting at 2nd level, you can add half your "
            + "proficiency bonus, rounded down, to any "
            + "ability check you make that doesn't already include your proficiency bonus.";
    public static String SongOfRest = "I'll fill this in later.";
    private String bard = "";

    private void bard() {
        this.bard = "Bard traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        bard();
        this.bard = bard + "\n" + BardicInspiration + "\n" + Spellcasting;
        return bard;
    }

    @Override
    public String getLevelTwoTraits() {
        this.bard = bard + "\n" + JackOfAllTrades + "\n" + SongOfRest;
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

    public String print() {
        System.out.println(bard);
        return bard;
    }
}
