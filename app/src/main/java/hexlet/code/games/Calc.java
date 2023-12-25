package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Calc {

    private int number1;
    private int number2;
    private char ch;

    public static void runGame() {
        GameRound[] gameRound = new GameRound[3];
        Calc game = new Calc();

        final int iterationsNumber = 3;
        for (int i = 0; i < iterationsNumber; i++) {
            gameRound[i] = new GameRound(game.getData(), game.getResult());
        }

        final String ruleMessage = "What is the result of the expression?";
        Engine.start(gameRound, ruleMessage);
    }

    public String getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 1000;
        char[] expressionSigns = {'+', '-', '*'};

        number1 = random.nextInt(minRandomNumber, maxRandomNumber);
        number2 = random.nextInt(minRandomNumber, maxRandomNumber);
        ch = expressionSigns[random.nextInt(0, 2)];

        return "" + number1 + ' ' + ch + ' ' + number2;
    }

    public String getResult() {
        switch (ch) {
            case '+':
                return "" + (number1 + number2);
            case '-':
                return "" + (number1 - number2);
            case '*':
                return "" + (number1 * number2);
            default:
                return "";
        }
    }


}
