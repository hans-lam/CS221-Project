package model.Race;

public class Goblin extends Races {
    public static String DarkVision = "You can see in dim light within 60 feet of you as if it were bright light, and " +
            "in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
    public static String NimbleEscape = "You can take the Disengage or Hide action as a bonus action on each of your" +
            "turns.";

    public Goblin(String AbilityScores, String Size, String Speed, String Age, String Alignment,
                  String RacialTraits, String Languages) {
        super(AbilityScores, Size, Speed, Age, Alignment, RacialTraits, Languages);
        AbilityScores = "Dex +2, Con +1";
        Size = "Small";
        Speed = "30 ft.";
        Age = "Goblins reach adulthood around age 8. They age noticeably faster than humans, and though few goblins" +
                " live to old age, the most cautious rarely live longer than 60 years.";
        Alignment = "Most of the goblins of Ravnica are chaotic, with no inclination towards good or evil.";
        RacialTraits = "";
        Languages = "You can speak, read, and write Common and Goblin. In Ravnica, Goblin is a simplistic language" +
                " with a limited vocabulary and fluid rules of grammar, unsuited for any sophisticated conversation.";
    }

    @Override
    public String getRacialTraits() {
        this.RacialTraits = "DarkVision: " + DarkVision + "\n" + "Nimble Escape: " + NimbleEscape;
        return RacialTraits;
    }
}
