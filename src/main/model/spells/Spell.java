package model.spells;

import java.util.ArrayList;

public class Spell {
    String name;
    ArrayList<CharacterSpells> spellList;

    public Spell(String name, ArrayList<CharacterSpells> spellList) {
        this.name = name;
        this.spellList = spellList;
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

    public String getName() {
        return name;
    }

    public String getFirst() {
        return spellList.get(0).getName();
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
