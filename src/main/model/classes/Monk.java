package model.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Monk implements Classes, CharacterClass {
    public static String UnarmoredDefense = "Unarmored Defense: \n Beginning at 1st level, while you are wearing no "
            + "armor and not wielding a shield, "
            + "your AC equals 10 + your Dexterity modifier + your Wisdom Modifier.";
    public static String MartialArts = "I'll finish this later";

    public static String UnarmoredMovement = "Unarmored Movement: \n Starting at 2nd level, your speed increases by "
            + "10 feet while you are not wearing "
            + "armor or wielding a shield. This bonus increases when you reach certain monk levels, as shown in the "
            + "Monk table. \n At 9th level, you gain the ability to move along vertical surfaces and across liquids on"
            + "your turn without falling during the move.";
    public static String Ki = "So much ai ya.";
    private String monk = "";

    private void monk() {
        this.monk = "Monk traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        monk();
        this.monk = monk + "\n" + UnarmoredDefense + "\n" + MartialArts;
        return monk;
    }

    @Override
    public String getLevelTwoTraits() {
        this.monk = monk + "\n" + UnarmoredMovement + "\n" + Ki;
        return monk;
    }

    @Override
    public String getClassInfo() {
        getLevelOneTraits();
        getLevelTwoTraits();
        return monk;
    }

    public void saveMonk() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Monk.txt"));
            writer.write(monk);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String print() {
        System.out.println(monk);
        return monk;
    }
}
