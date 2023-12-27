package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Progression {

    private int difference;
    public static void runGame() {
        final int countOfRounds = 3;
        GameRound[] gameRound = new GameRound[countOfRounds];
        Progression game = new Progression();

        String[] progression;
        int result;
        for (int i = 0; i < countOfRounds; i++) {
            progression = game.getProgression();
            result = game.getResult(progression);
            gameRound[i] = new GameRound(String.join(" ", progression), "" + result);
        }

        final String ruleMessage = "What number is missing in the progression?";
        Engine.start(gameRound, ruleMessage, countOfRounds);
    }

    public String[] getProgression() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 100;
        final int minDifference = 1;
        final int maxDifference = 10;

        int a1 = random.nextInt(minRandomNumber, maxRandomNumber);
        difference = random.nextInt(minDifference, maxDifference);

        final int minProgressionSize = 5;
        final int maxProgressionSize = 10;
        String[] progression = new String[random.nextInt(minProgressionSize, maxProgressionSize + 1)];

        final int firstNumberIndex = 0;
        int hiddenNumberIndex = random.nextInt(firstNumberIndex, progression.length);

        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenNumberIndex) {
                progression[i] = "..";
                a1 += difference;
                continue;
            }
            progression[i] = "" + a1;
            a1 += difference;
        }

        return progression;
    }

    public int getResult(String[] progression) {
        int index = -1;
        for (int i = 0; i < progression.length; i++) {
            if (progression[i].equals("..")) {
                index = i;
                break;
            }
        }
        if (index < progression.length - 1) {
            final int elementAfterUnknownElement = Integer.parseInt(progression[index + 1]);
            return elementAfterUnknownElement - difference;
        }

        final int penultimateElement = Integer.parseInt(progression[progression.length - 2]);
        return penultimateElement + difference;
    }
}
