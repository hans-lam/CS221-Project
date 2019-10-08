package model.race;

public class Goblin extends Races {
    public static String DarkVision = "You can see in dim light within 60 feet of you as if it were bright light, and "
            + "in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.";
    public static String NimbleEscape = "You can take the Disengage or Hide action as a bonus action on each of your"
            + "turns.";

    public Goblin(String abilityScores, String size, String speed, String age, String alignment,
                  String racialTraits, String languages) {
        super(abilityScores, size, speed, age, alignment, racialTraits, languages);
        this.abilityScores = "Dex +2, Con +1";
        this.size = "Small";
        this.speed = "30 ft.";
        this.age = "Goblins reach adulthood around age 8. They age noticeably faster than humans, and though few "
                + "goblins live to old age, the most cautious rarely live longer than 60 years.";
        this.alignment = "Most of the goblins of Ravnica are chaotic, with no inclination towards good or evil.";
        this.racialTraits = "";
        this.languages = "You can speak, read, and write Common and Goblin. In Ravnica, Goblin is a simplistic language"
                + " with a limited vocabulary and fluid rules of grammar, unsuited for any sophisticated conversation.";
    }

    @Override
    public String getRacialTraits() {
        this.racialTraits = "DarkVision: " + DarkVision + "\n" + "Nimble Escape: " + NimbleEscape;
        return racialTraits;
    }
}
