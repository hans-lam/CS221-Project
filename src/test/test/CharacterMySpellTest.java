package test;

import model.spells.CharacterSpells;
import model.spells.MySpell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CharacterMySpellTest {
    private String testName;
    private ArrayList<MySpell> testMySpellCharacterList;
    private CharacterSpells testCharacterSpells;

    @BeforeEach
    void runBefore() {
        this.testName = "Bob";
        this.testMySpellCharacterList = new ArrayList<>();
        this.testCharacterSpells = new CharacterSpells(testName);
    }

    @Test
    void testGetName() {
        assertEquals(testName, testCharacterSpells.getName());
    }

    @Test
    void testGetSize() {
        assertEquals(testMySpellCharacterList.size(), testCharacterSpells.getSize());
    }

    @Test
    void testAddSpell() {
        MySpell testMySpell = new MySpell("ooga-booga");
        testCharacterSpells.addSpell(testMySpell);
        assertEquals(testMySpell.getName(), testCharacterSpells.getFirst());
    }

    @Test
    void testRemoveSpell() {
        MySpell testMySpell = new MySpell("ooga-booga");
        testCharacterSpells.addSpell(testMySpell);
        testCharacterSpells.removeSpell(testMySpell);
        assertEquals(testMySpellCharacterList.size(), testCharacterSpells.getSize());
    }

    @Test
    void testEquals() {
        Assertions.assertNotEquals(null, testCharacterSpells);
    }
}
