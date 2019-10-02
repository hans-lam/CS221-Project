package ui;

import java.lang.String;

public class Spells {
    public String name = "";
    public int level;
    public String type = "";
    public String castingTime = "";
    public int range;
    public String components = "";
    public String duration = "";
    public String description = "";

    // EFFECTS: constructs the basic template for spells
    public Spells(String name, int level, String type, String castingTime, int range,
                   String components, String duration, String description, Classes classType) {
        this.level = level;
        this.range = range;
    }
}
