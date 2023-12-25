package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Prime {
    private int number;

    public static void runGame() {
        GameRound[] gameRound = new GameRound[3];
        Prime game = new Prime();

        final int iterationsNumber = 3;
        for (int i = 0; i < iterationsNumber; i++) {
            gameRound[i] = new GameRound(game.getData(), game.getResult());
        }

        final String ruleMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.start(gameRound, ruleMessage);
    }

    public String getData() {
        Random random = new Random();
        final int minRandomNumber = 2;
        final int maxRandomNumber = 100;
        number = random.nextInt(minRandomNumber, maxRandomNumber);
        return "" + number;
    }

    public String getResult() {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
