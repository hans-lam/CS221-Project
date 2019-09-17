package UI;

import java.util.ArrayList;

public class Operations {
    private String key;
    private ArrayList<String> notes;
    private ArrayList<Integer> rhythm;
    private int tempo;

    public Operations() {
        key = "";
        notes = new ArrayList<>();
        rhythm = new ArrayList<>();
        tempo = 0;
    }

    // EFFECTS: tells the key of the music piece
    public String returnKey() {
        return key;
    }

    // EFFECTS: tells the notes of the music piece
    public ArrayList<String> returnNotes() {
        return notes;
    }

    // EFFECTS: tells the rhythm of the music piece
    public ArrayList<Integer> returnRhythm() {
        return rhythm;
    }

    // EFFECTS: tells the tempo of the music piece
    public int returnTempo() {
        return tempo;
    }
}
