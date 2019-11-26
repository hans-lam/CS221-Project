package model.spells;

import java.util.ArrayList;


public class CharacterSpells extends Spell {
    private String name;
    private ArrayList<MySpell> mySpellCharacterList;

    public CharacterSpells(String name) {
        super(name);
        this.mySpellCharacterList = new ArrayList<>();
    }

    // MODIFIES: mySpellCharacterList, spellList (in MySpell class)
    // EFFECTS: adds a spell to mySpellCharacterList and adds this to spellList
    public void addSpell(MySpell mySpell) {
        if (!this.mySpellCharacterList.contains(mySpell)) {
            try {
                mySpellCharacterList.add(mySpell);
                mySpell.addCharacterSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    // REQUIRES: mySpellCharacterList and spellList cannot be empty
    // MODIFIES: mySpellCharacterList, spellList (in MySpell class)
    // EFFECTS: removes a spell from mySpellCharacterList and removes this from spellList
    public void removeSpell(MySpell mySpell) {
        if (this.mySpellCharacterList.contains(mySpell)) {
            try {
                mySpellCharacterList.remove(mySpell);
                mySpell.removeCharacterSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public String getFirst() {
        return mySpellCharacterList.get(0).getName();
    }

    public int getSize() {
        return mySpellCharacterList.size();
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
