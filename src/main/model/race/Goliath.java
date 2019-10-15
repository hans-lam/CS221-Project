package model.race;

public class Goliath extends Races {
    public static String PowerfulBuild = "You count as one size larger when determining your carrying capacity and "
            + "the weight you can push, drag, or lift.";
    public static String NaturalAthlete = "You have proficiency in the Athletics skill.";
    public static String Language = "Common and Giant.";

    public Goliath(String abilityScores, String size, String speed, String age, String alignment,
                  String racialTraits, String languages) {
        super(abilityScores, size, speed, age, alignment, racialTraits, languages);
        this.abilityScores = "Str +2, Con +1";
        this.size = "Medium";
        this.speed = "30 ft.";
        this.age = "Goliaths have lifespans comparable to humans. They enter adulthood in their late teens and usually "
                + "live less than a century.";
        this.alignment = "Goliath society, with its clear roles and tasks, has a strong lawful bent. The goliath sense"
                + " of fairness, balanced with an emphasis no self sufficiency and personal accountability, "
                + "pushes them toward neutrality.";
        this.racialTraits = "";
        this.languages = "";
    }

    @Override
    public String getRacialTraits() {
        this.racialTraits = "Powerful Build: " + PowerfulBuild + "\n" + "Natural Athlete: " + NaturalAthlete;
        return racialTraits;
    }
}
