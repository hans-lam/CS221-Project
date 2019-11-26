package model.spells;

import java.util.ArrayList;

public class MySpell extends Spell {
    String name;
    ArrayList<CharacterSpells> spellList;

    public MySpell(String name, ArrayList<CharacterSpells> spellList) {
        super(name);
        this.spellList = new ArrayList<>();
    }

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
