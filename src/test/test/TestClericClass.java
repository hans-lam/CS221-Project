package test;

import model.classes.Classes;
import model.classes.Cleric;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static model.classes.ClericDescriptions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestClericClass {
    private Classes testCleric;

    @BeforeEach
    void runBefore() {
        testCleric = new Cleric();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Cleric traits: " + "\n" + Spellcasting + "\n" + DivineDomain,
                testCleric.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("Cleric traits: " + "\n" + ChannelDivinity + "\n" + DivineDomainFeature,
                testCleric.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        Cleric testCleric2 = new Cleric();
        testCleric.getLevelOneTraits();

        assertEquals(testCleric.getLevelTwoTraits(), testCleric2.getClassInfo());
    }

    @Test
    void testPrint() {
        String testCleric2 = "Cleric traits: ";
        assertEquals(testCleric2, testCleric.print());
    }

    @Test
    void saveCleric() throws IOException {
        Cleric testCleric2 = new Cleric();
        File clericFile = new File("Cleric.txt");

        clericFile.setWritable(false);
        testCleric2.getClassInfo();
        testCleric2.save();
        String contents = testCleric.getClassInfo();
        String path = "TestCleric.txt";
        saveFile(contents, path);
        File file = new File(path);
        Assertions.assertTrue(file.length() > 0);
        assertEquals(readFile(path), readFile("Cleric.txt"));

        clericFile.setWritable(true);
        testCleric2.getClassInfo();
        testCleric2.save();
        String contents1 = testCleric.getClassInfo();
        String path1 = "TestCleric.txt";
        saveFile(contents1, path1);
        File file1 = new File(path1);
        Assertions.assertTrue(file1.length() > 0);
        assertEquals(readFile(path1), readFile("Cleric.txt"));
    }

    static void saveFile(String contents, String path) throws IOException {
        File file = new File(path);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(contents);
        writer.close();
    }

    static String readFile(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        line = br.readLine();
        return line;
    }
}
