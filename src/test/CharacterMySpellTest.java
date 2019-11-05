import model.spells.CharacterSpells;
import model.spells.MySpell;
import model.spells.Spell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterMySpellTest {
    private String testName;
    private ArrayList<MySpell> testMySpellCharacterList;
    private CharacterSpells testCharacterSpells;

    @BeforeEach
    void runBefore() {
        this.testName = "Bob";
        this.testMySpellCharacterList = new ArrayList<>();
        this.testCharacterSpells = new CharacterSpells(testName, testMySpellCharacterList);
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
        MySpell testMySpell = new MySpell("ooga-booga", new ArrayList<>());
        testCharacterSpells.addSpell(testMySpell);
        assertEquals(testMySpell.getName(), testCharacterSpells.getFirst());
    }

    @Test
    void testRemoveSpell() {
        MySpell testMySpell = new MySpell("ooga-booga", new ArrayList<>());
        testCharacterSpells.addSpell(testMySpell);
        testCharacterSpells.removeSpell(testMySpell);
        assertEquals(testMySpellCharacterList.size(), testCharacterSpells.getSize());
    }
}
