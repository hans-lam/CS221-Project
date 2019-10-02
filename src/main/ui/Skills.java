package ui;

import java.util.List;

public class Skills implements Backgrounds, Feats, Classes {
    List<String> listOfSkills;
    public boolean proficiency;

    public Skills() {
        listOfSkills.set(0, "Acrobatics");
        listOfSkills.set(1, "Animal Handling");
        listOfSkills.set(2, "Arcana");
        listOfSkills.set(3, "Athletics");
        listOfSkills.set(4, "Deception");
        listOfSkills.set(5, "History");
        listOfSkills.set(6, "Insight");

    }

    @Override
    public boolean getBackgroundProficiency() {
        return false;
    }

    @Override
    public boolean getFeatProficiency() {
        return false;
    }

    @Override
    public boolean getClassProficiency() {
        return false;
    }
}
