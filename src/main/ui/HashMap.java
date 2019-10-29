package ui;

import model.spells.CharacterSpells;
import model.spells.Spell;

import java.util.ArrayList;

public class HashMap {
    public static void main(String[] args) {
        Spell acidSplash = new Spell("Acid Splash", new ArrayList<CharacterSpells>());
        CharacterSpells fireball = new CharacterSpells("Fireball", new ArrayList<Spell>());
        CharacterSpells frostbolt = new CharacterSpells("Frostbolt", new ArrayList<Spell>());
        java.util.HashMap<String, CharacterSpells> spellMap = new java.util.HashMap<String, CharacterSpells>();
        java.util.HashMap<String, Spell> spellCharacterMap = new java.util.HashMap<>();

        acidSplash.addCharacterSpell(fireball);
        System.out.println(acidSplash.getFirst());
        System.out.println(fireball.getFirst());

        spellMap.put(acidSplash.getFirst(), fireball);
        System.out.println(spellMap.get(acidSplash.getFirst()).getName());
        System.out.println(spellMap.get("Fireball").getName());

        spellCharacterMap.put(fireball.getFirst(), acidSplash);
        System.out.println(spellCharacterMap.get(fireball.getFirst()).getName());
        System.out.println(spellCharacterMap.get("Acid Splash").getName());

        acidSplash.removeCharacterSpell(fireball);
        acidSplash.addCharacterSpell(frostbolt);
        System.out.println(acidSplash.getFirst());
        System.out.println(fireball.getSize());
    }
}
