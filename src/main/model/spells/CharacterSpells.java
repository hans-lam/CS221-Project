package model.spells;

import java.util.ArrayList;


public class CharacterSpells {
    String name;
    ArrayList<Spell> spellCharacterList;

    public CharacterSpells(String name, ArrayList<Spell> spellCharacterList) {
        this.name = name;
        this.spellCharacterList = spellCharacterList;
    }

    public void addSpell(Spell spell) {
        if (!this.spellCharacterList.contains(spell)) {
            try {
                spellCharacterList.add(spell);
                spell.addCharacterSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public void removeSpell(Spell spell) {
        if (this.spellCharacterList.contains(spell)) {
            try {
                spellCharacterList.remove(spell);
                spell.removeCharacterSpell(this);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getFirst() {
        return spellCharacterList.get(0).getName();
    }

    public int getSize() {
        return spellCharacterList.size();
    }

    @Override
    public int hashCode() {
        String spellName = name;
        return spellName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Spell other = (Spell) obj;

        return this.name.equals(other.name)
                &&
                this.name == other.name;
    }
}
