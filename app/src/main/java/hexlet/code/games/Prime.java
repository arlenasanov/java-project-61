package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Prime {
    private int number;

    public static void runGame() {
        final int countOfQuestions = 3;
        GameRound[] gameRound = new GameRound[countOfQuestions];
        Prime game = new Prime();

        for (int i = 0; i < countOfQuestions; i++) {
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
