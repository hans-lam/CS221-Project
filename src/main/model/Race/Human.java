package model.Race;

public class Human extends Races {
    public Human(String AbilityScores, String Size, String Speed, String Age, String Alignment,
                 String RacialTraits, String Languages) {
        super(AbilityScores, Size, Speed, Age, Alignment, RacialTraits, Languages);
    }

    @Override
    public String getRacialTraits() {
        return null;
    }
}
