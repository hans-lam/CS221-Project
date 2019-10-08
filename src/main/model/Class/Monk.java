package model.Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Monk implements Classes, CharacterClass {
    public static String UnarmoredDefense = "Unarmored Defense: \n Beginning at 1st level, while you are wearing no " +
            "armor and not wielding a shield, " +
            "your AC equals 10 + your Dexterity modifier + your Wisdom Modifier.";
    public static String MartialArts = "I'll finish this later";

    public static String UnarmoredMovement = "Unarmored Movement: \n Starting at 2nd level, your speed increases by " +
            "10 feet while you are not wearing " +
            "armor or wielding a shield. This bonus increases when you reach certain monk levels, as shown in the " +
            "Monk table. \n At 9th level, you gain the ability to move along vertical surfaces and across liquids on" +
            "your turn without falling during the move.";
    public static String Ki = "So much ai ya.";
    private String Monk = "";

    public void Monk() {
        this.Monk = "Monk traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        Monk();
        this.Monk = Monk + "\n" + UnarmoredDefense + "\n" + MartialArts;
        return Monk;
    }

    @Override
    public String getLevelTwoTraits() {
        this.Monk = Monk + "\n" + UnarmoredMovement + "\n" + Ki;
        return Monk;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return Monk;
    }

    public void SaveMonk() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Monk.txt"));
            writer.write(Monk);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void PrintMonk() {
        System.out.println(Monk);
    }
}
