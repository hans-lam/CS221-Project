package model.race;

public abstract class Races implements CharacterRace {
    String abilityScores;
    String size;
    String speed;
    String age;
    String alignment;
    String racialTraits;
    String languages;

    Races(String abilityScores, String size, String speed, String age,
            String alignment, String racialTraits, String languages) {
        this.abilityScores = abilityScores;
        this.size = size;
        this.speed = speed;
        this.age = age;
        this.alignment = alignment;
        this.racialTraits = racialTraits;
        this.languages = languages;
    }

    public String getAbilityScores() {
        System.out.println(abilityScores);
        return abilityScores;
    }

    public String getSize() {
        System.out.println(size);
        return size;
    }

    public String getSpeed() {
        System.out.println(speed);
        return speed;
    }

    public abstract String getRacialTraits();
}
