package model.race;

public class Human extends Races {
    public Human(String abilityScores, String size, String speed, String age, String alignment,
                 String racialTraits, String languages) {
        super(abilityScores, size, speed, age, alignment, racialTraits, languages);
    }

    @Override
    public String getRacialTraits() {
        return null;
    }
}
