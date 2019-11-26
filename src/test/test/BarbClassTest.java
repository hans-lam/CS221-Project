package test;

import model.classes.Barbarian;
import model.classes.Classes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static model.classes.BarbarianDescriptions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbClassTest {
    private Classes testBarbarian;

    @BeforeEach
    void runBefore() {
        testBarbarian = new Barbarian();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Barbarian traits: " + "\n" + Rage + "\n" + UnarmoredDefense,
                testBarbarian.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("Barbarian traits: " + "\n" + DangerSense + "\n" + RecklessAttack,
                testBarbarian.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        Classes testBarbarian2;
        testBarbarian2 = new Barbarian();

        testBarbarian.getLevelOneTraits();
        assertEquals(testBarbarian.getLevelTwoTraits(), testBarbarian2.getClassInfo());
    }

    @Test
    void testPrint() {
        String testBarbarian2 = "Barbarian traits: ";
        assertEquals(testBarbarian2, testBarbarian.print());
    }

    @Test
    void saveBarbarian() throws IOException {
        Barbarian testBarbarian2 = new Barbarian();
        File barbarianFile = new File("Barbarian.txt");

        barbarianFile.setWritable(false);
        testBarbarian2.getClassInfo();
        testBarbarian2.save();
        String contents = testBarbarian.getClassInfo();
        String path = "TestBarbarian.txt";
        saveFile(contents, path);
        File file = new File(path);
        Assertions.assertTrue(file.length() > 0);
        assertEquals(readFile(path), readFile("Barbarian.txt"));

        barbarianFile.setWritable(true);
        testBarbarian2.getClassInfo();
        testBarbarian2.save();
        String contents1 = testBarbarian.getClassInfo();
        String path1 = "TestBarbarian.txt";
        saveFile(contents1, path1);
        File file1 = new File(path1);
        Assertions.assertTrue(file1.length() > 0);
        assertEquals(readFile(path1), readFile("Barbarian.txt"));
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
