package model.race;

public class Human extends Races {
    public Human(String abilityScores, String size, String speed, String age, String alignment,
                 String racialTraits, String languages) {
        super(abilityScores, size, speed, age, alignment, racialTraits, languages);
        this.abilityScores = "All stats +1";
        this.size = "Medium";
        this.speed = "30 ft.";
        this.age = "Humans reach adulthood in their late teens and live less than a century.";
        this.alignment = "Humans tend toward no particular alignment. The best and the worst are found among them.";
        this.racialTraits = "";
        this.languages = "";
    }

    @Override
    public String getRacialTraits() {
        return null;
    }
}
