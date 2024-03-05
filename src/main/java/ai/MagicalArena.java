package ai;

import java.util.Random;

public class MagicalArena {
    static Random random = new Random();

    public static int dyeNumber() {
        return random.nextInt(6) + 1; // 1 to 6 sided die
    }

    public static void fight(Participant attacker, Participant defender) {
        int attackRandom = dyeNumber();
        int defenceRandom = dyeNumber();

        int totalAttack = attacker.attack * attackRandom;
        int totalDefend = defender.strength * defenceRandom;

        int damageLeft = Math.max(0, totalAttack - totalDefend);
        defender.health -= damageLeft;

        System.out.println("Attacker rolls " + attackRandom + ", Defender rolls " + defenceRandom);
        System.out.println("Attack damage: " + totalAttack + ", Defense strength: " + totalDefend);
        System.out.println("Defender health reduced by " + damageLeft + " to " + defender.health + "\n");
    }
}