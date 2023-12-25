package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class GCD {
    private int number1;
    private int number2;

    public static void runGame() {
        final int countOfQuestions = 3;
        GameRound[] gameRound = new GameRound[countOfQuestions];
        GCD game = new GCD();

        for (int i = 0; i < countOfQuestions; i++) {
            gameRound[i] = new GameRound(game.getData(), game.getResult());
        }

        final String ruleMessage = "Find the greatest common divisor of given numbers.";
        Engine.start(gameRound, ruleMessage);
    }

    public String getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 100;
        char[] expressionSigns = {'+', '-', '*'};

        number1 = random.nextInt(minRandomNumber, maxRandomNumber);
        number2 = random.nextInt(minRandomNumber, maxRandomNumber);

        return "" + number1 + ' ' + number2;
    }

    public String getResult() {
        while (number2 != 0) {
            int tmp = number2;
            number2 = number1 % number2;
            number1 = tmp;
        }
        return "" + number1;
    }
}
