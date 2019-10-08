package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadClasses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Monk.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
