package model.spells;

import java.util.ArrayList;

public class MySpell extends Spell {
    String name;
    private ArrayList<CharacterSpells> spellList;

    public MySpell(String name) {
        super(name);
        this.spellList = new ArrayList<>();
    }

    // MODIFIES: mySpellCharacterList, spellList (in MySpell class)
    // EFFECTS: adds a character spell to mySpellCharacterList and adds this to spellList
    public void addCharacterSpell(CharacterSpells spell) {
        if (!this.spellList.contains(spell)) {
            try {
                spellList.add(spell);
                spell.addSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    // REQUIRES: mySpellCharacterList and spellList cannot be empty
    // MODIFIES: mySpellCharacterList, spellList (in MySpell class)
    // EFFECTS: removes a character spell from mySpellCharacterList and removes this from spellList
    public void removeCharacterSpell(CharacterSpells spell) {
        if (this.spellList.contains(spell)) {
            try {
                spellList.remove(spell);
                spell.removeSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public int getSize() {
        return spellList.size();
    }


    public String getFirst() {
        return spellList.get(0).getName();
    }

    // EFFECTS: returns whether or not an object equals this
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MySpell other = (MySpell) obj;

        return this.name.equals(other.name);
    }
}
