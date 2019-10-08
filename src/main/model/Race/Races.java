package model.Race;

import javafx.scene.AmbientLight;

import java.util.ArrayList;
import java.util.List;

public abstract class Races implements CharacterRace {
    private String AbilityScores;
    private String Size;
    private String Speed;
    private String Age;
    private String Alignment;
    String RacialTraits;
    private String Languages;

    public Races(String AbilityScores, String Size, String Speed, String Age, String Alignment,
                 String RacialTraits, String Languages) {
        this.AbilityScores = AbilityScores;
        this.Size = Size;
        this.Speed = Speed;
        this.Age = Age;
        this.Alignment = Alignment;
        this.RacialTraits = RacialTraits;
        this.Languages = Languages;
    }

    public String getAbilityScores() {
        System.out.println(AbilityScores);
        return AbilityScores;
    }

    public String getSize() {
        System.out.println(Size);
        return Size;
    }

    public String getSpeed() {
        System.out.println(Speed);
        return Size;
    }

    public abstract String getRacialTraits();
}
