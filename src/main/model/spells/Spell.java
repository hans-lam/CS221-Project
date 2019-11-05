package model.spells;

public abstract class Spell {
    String name;

    public Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
