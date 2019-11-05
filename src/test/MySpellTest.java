import model.spells.CharacterSpells;
import model.spells.MySpell;
import model.spells.Spell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySpellTest {
    private String testName;
    private ArrayList<CharacterSpells> testSpellList;
    private MySpell testMySpell;

    @BeforeEach
    void runBefore() {
        this.testName = "Bob";
        this.testSpellList = new ArrayList<>();
        this.testMySpell = new MySpell(testName, testSpellList);
    }

    @Test
    void testGetName() {
        assertEquals(testName, testMySpell.getName());
    }

    @Test
    void testGetSize() {
        assertEquals(testSpellList.size(), testMySpell.getSize());
    }

    @Test
    void testAddCharacterSpell() {
        CharacterSpells testCharacterSpell = new CharacterSpells("ooga-booga", new ArrayList<>());
        testMySpell.addCharacterSpell(testCharacterSpell);
        assertEquals(testCharacterSpell.getName(), testMySpell.getFirst());
    }

    @Test
    void testRemoveCharacterSpell() {
        CharacterSpells testCharacterSpell = new CharacterSpells("ooga-booga", new ArrayList<>());
        testMySpell.addCharacterSpell(testCharacterSpell);
        testMySpell.removeCharacterSpell(testCharacterSpell);
        assertEquals(0, testMySpell.getSize());
    }
}
