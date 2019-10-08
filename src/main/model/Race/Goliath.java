package model.Race;

public class Goliath extends Races {
    public static String PowerfulBuild = "You count as one size larger when determining your carrying capacity and " +
            "the weight you can push, drag, or lift.";
    public static String NaturalAthlete = "You have proficiency in the Athletics skill.";

    public Goliath(String AbilityScores, String Size, String Speed, String Age, String Alignment,
                  String RacialTraits, String Languages) {
        super(AbilityScores, Size, Speed, Age, Alignment, RacialTraits, Languages);
        AbilityScores = "Str +2, Con +1";
        Size = "Medium";
        Speed = "30 ft.";
        Age = "Goliaths have lifespans comparable to humans. They enter adulthood in their late teens and usually " +
                "live less than a century.";
        Alignment = "Goliath society, with its clear roles and tasks, has a strong lawful bent. The goliath sense" +
                " of fairness, balanced with an emphasis no self sufficiency and personal accountability, pushes them" +
                "toward neutrality.";
        RacialTraits = "";
        Languages = "You can speak, read, and write Common and Giant.";
    }

    @Override
    public String getRacialTraits() {
        this.RacialTraits = "Powerful Build: " + PowerfulBuild + "\n" + "Natural Athlete: " + NaturalAthlete;
        return RacialTraits;
    }
}
