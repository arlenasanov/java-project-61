package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Even {

    private int number;

    public static void runGame() {
        final int countOfQuestions = 3;
        GameRound[] gameRound = new GameRound[countOfQuestions];
        Even game = new Even();

        for (int i = 0; i < countOfQuestions; i++) {
            gameRound[i] = new GameRound(game.getData(), game.getResult());
        }

        final String ruleMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.start(gameRound, ruleMessage);
    }

    public String getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 1000;
        number = random.nextInt(minRandomNumber, maxRandomNumber);
        return "" + number;
    }

    public String getResult() {
        return number % 2 == 0 ? "yes" : "no";
    }
}
