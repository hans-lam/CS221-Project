package ui;

import model.classes.Bard;
import model.classes.Monk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SaveAndLoadClasses {
    public static void main(String[] args) throws IOException {
        Bard myBard = new Bard();
        myBard.getClassInfo();
        myBard.saveBard();

        Monk myMonk = new Monk();
        myMonk.getClassInfo();
        myMonk.saveMonk();

        BufferedReader br = new BufferedReader(new FileReader("Monk.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
