package test;

import model.classes.Bard;
import model.classes.CharacterClass;
import model.classes.Classes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;


import static model.classes.Bard.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBardClass {
    private Classes testBard;

    @BeforeEach
    void runBefore() {
        testBard = new Bard();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Bard traits: " + "\n" + BardicInspiration + "\n" + Spellcasting,
                testBard.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("" + "\n" + JackOfAllTrades + "\n" + SongOfRest,
                testBard.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        CharacterClass testBard2;
        testBard2 = new Bard();

        testBard.getLevelOneTraits();
        assertEquals(testBard.getLevelTwoTraits(), testBard2.getClassInfo());
    }

    @Test
    void testPrint() {
        String testBard2 = "";
        assertEquals(testBard2, testBard.print());
    }

    @Test
    void saveBard() throws IOException {
        Bard testBard2 = new Bard();
        File bardFile = new File("Bard.txt");

        bardFile.setWritable(false);
        testBard2.getClassInfo();
        testBard2.saveBard();
        String contents = testBard.getClassInfo();
        String path = "TestBard.txt";
        saveFile(contents, path);
        File file = new File(path);
        Assertions.assertTrue(file.length() > 0);
        assertEquals(readFile(path), readFile("Bard.txt"));

        bardFile.setWritable(true);
        testBard2.getClassInfo();
        testBard2.saveBard();
        String contents1 = testBard.getClassInfo();
        String path1 = "TestBard.txt";
        saveFile(contents1, path1);
        File file1 = new File(path1);
        Assertions.assertTrue(file1.length() > 0);
        assertEquals(readFile(path1), readFile("Bard.txt"));
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

