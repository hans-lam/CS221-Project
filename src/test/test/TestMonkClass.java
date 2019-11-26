package test;

import model.classes.Classes;
import model.classes.Monk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static model.classes.Monk.*;
import static model.classes.MonkDescriptions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMonkClass {
    private Classes testMonk;
    @BeforeEach
    void runBefore() {
        testMonk = new Monk();
    }

    @Test
    void testGetLevelOneTraits() {
        assertEquals("Monk traits: " + "\n" + UnarmoredDefense + "\n" + MartialArts,
                testMonk.getLevelOneTraits());
    }

    @Test
    void testGetLevelTwoTraits() {
        assertEquals("Monk traits: " + "\n" + UnarmoredMovement + "\n" + Ki,
                testMonk.getLevelTwoTraits());
    }

    @Test
    void testGetInfo() {
        Classes testMonk2;
        testMonk2 = new Monk();

        testMonk.getLevelOneTraits();
        assertEquals(testMonk.getLevelTwoTraits(), testMonk2.getClassInfo());
    }

    @Test
    void saveMonk() throws IOException {
        Monk testMonk2 = new Monk();
        File monkFile = new File("Monk.txt");

        monkFile.setWritable(false);
        testMonk2.getClassInfo();
        testMonk2.save();
        String contents = testMonk.getClassInfo();
        String path = "TestMonk.txt";
        saveFile(contents, path);
        File file = new File(path);
        Assertions.assertTrue(file.length() > 0);
        assertEquals(readFile(path), readFile("Monk.txt"));

        monkFile.setWritable(true);
        testMonk2.getClassInfo();
        testMonk2.save();
        String contents1 = testMonk.getClassInfo();
        String path1 = "TestMonk.txt";
        saveFile(contents1, path1);
        File file1 = new File(path1);
        Assertions.assertTrue(file1.length() > 0);
        assertEquals(readFile(path1), readFile("Monk.txt"));
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

    @Test
    void testPrint() {
        String testMonk2 = "Monk traits: ";
        assertEquals(testMonk2, testMonk.print());
    }
}
