package ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SavingSkills {
    List<String> listOfSkills;

    public SavingSkills() throws IOException {
        listOfSkills = Files.readAllLines(Paths.get("inputfile.txt"));
        PrintWriter writer = new PrintWriter("outputfile.txt","UTF-8");
        listOfSkills.add("Acrobatics");
        for (String line : listOfSkills) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.print("Name: " + partsOfLine.get(0) + " ");
            System.out.println("Bonus: " + partsOfLine.get(1));
            writer.println(line);
        }
        writer.close();
    }

    public static ArrayList<String> splitOnSpace(String line) {
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));
    }
}
