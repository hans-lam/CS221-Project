package model.spells;

import java.util.ArrayList;


public class CharacterSpells extends Spell {
    String name;
    ArrayList<MySpell> mySpellCharacterList;

    public CharacterSpells(String name, ArrayList<MySpell> mySpellCharacterList) {
        super(name);
        this.mySpellCharacterList = new ArrayList<>();
    }

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
