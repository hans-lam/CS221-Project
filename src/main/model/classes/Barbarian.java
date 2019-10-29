package model.classes;

public class Barbarian implements Classes {
    public static String Rage = "In battle, you fight with primal ferocity. On your turn, you can enter rage as a "
            + "bonus action. \n While raging, you gain the following benefits if you aren't wearing heavy armor: \n"
            + "1. You have advantage on Strength checks and Strength saving throws. \n2. When you make a melee weapon "
            + "attack using Strength, you gain a +2 bonus to the damage roll. This bonus increases as you level. \n3. "
            + "You have resistance to bludgeoning, piercing, and slashing damage. \n If you are able to cast spells, "
            + "you can't cast them or concentrate on them while raging. \nYour rage lasts for 1 minute. It ends early"
            + "if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since "
            + "your last turn or taken damage since then. You can also end your rage on your turn as a bonus action. \n"
            + "Once you have raged the maximum number of times for your barbarian level, you must finish a long rest "
            + "before you can rage again. You may rage 2 times at 1st level, 3 at 3rd, 4 at 6th, 5 at 12th, and 6 at "
            + "17th.";
    public static String UnarmoredDefense = "While you are not wearing any armor, your Armor Class equals 10 + your "
            + "DEX modifier + your CON modifier. You can use a shield and still gain this benefit.";
    public static String DangerSense = "At 2nd level, you gain an uncanny sense of when things nearby aren't as they "
            + "should be, giving you an edge when you dodge away from danger. You have advantage on Dexterity saving "
            + "throws against effects that you can see, such as traps and spells. To gain this benefit, you can't be "
            + "blinded, deafened, or incapacitated.";
    public static String RecklessAttack = "At 2nd level, you can throw aside all concern for defense to attack with "
            + "fierce desperation. When you make your first attack on your turn, you can decide to attack recklessly. "
            + "Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, but attack "
            + "rolls against you have advantage until your next turn.";
    private String barbarian = "";

    public void barbarian() {
        this.barbarian = "Barbarian traits: ";
    }

    @Override
    public String getLevelOneTraits() {
        this.barbarian = barbarian + "\nRage: " + Rage + "\nUnarmored Defense: " + UnarmoredDefense;
        return barbarian;
    }

    @Override
    public String getLevelTwoTraits() {
        this.barbarian = barbarian + "\nDanger Sense: " + DangerSense + "\nReckless Attack: " + RecklessAttack;
        return barbarian;
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public String getClassInfo() {
        barbarian();
        getLevelOneTraits();
        getLevelTwoTraits();
        return barbarian;
    }
}
