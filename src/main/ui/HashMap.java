package ui;

import model.spells.CharacterSpells;
import model.spells.MySpell;

public class HashMap {
    public static void main(String[] args) {
        MySpell acidSplash = new MySpell("Acid Splash");
        CharacterSpells fireball = new CharacterSpells("Fireball");
        CharacterSpells frostbolt = new CharacterSpells("Frostbolt");
        java.util.HashMap<String, CharacterSpells> spellMap = new java.util.HashMap<>();
        java.util.HashMap<String, MySpell> spellCharacterMap = new java.util.HashMap<>();

        acidSplash.addCharacterSpell(fireball);
        System.out.println(acidSplash.getFirst());
        System.out.println(fireball.getFirst());

        spellMap.put(acidSplash.getFirst(), fireball);
        System.out.println(spellMap.get(acidSplash.getFirst()).getName());
        System.out.println(spellMap.get("Fireball").getName());

        spellCharacterMap.put(fireball.getFirst(), acidSplash);
        System.out.println(spellCharacterMap.get("Acid Splash").getName());

        acidSplash.removeCharacterSpell(fireball);
        acidSplash.addCharacterSpell(frostbolt);
        System.out.println(acidSplash.getFirst());
        System.out.println(fireball.getSize());
        System.out.println(acidSplash.getSize());
    }
}
