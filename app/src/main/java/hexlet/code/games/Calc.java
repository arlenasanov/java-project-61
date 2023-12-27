package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Calc {
    public static void runGame() {
        final int countOfRounds = 3;
        GameRound[] gameRound = new GameRound[countOfRounds];
        Calc game = new Calc();

        int number1, number2, result;
        char sign;
        for (int i = 0; i < countOfRounds; i++) {
            number1 = game.getNumber();
            number2 = game.getNumber();
            sign = game.getSign();
            result = game.getResult(number1, number2, sign);
            gameRound[i] = new GameRound("" + number1 + ' ' + sign + ' ' + number2, "" + result);
        }

        final String ruleMessage = "What is the result of the expression?";
        Engine.start(gameRound, ruleMessage, countOfRounds);
    }

    public int getNumber() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 1000;
        char[] expressionSigns = {'+', '-', '*'};
        return random.nextInt(minRandomNumber, maxRandomNumber);
    }

    public char getSign() {
        Random random = new Random();
        char[] expressionSigns = {'+', '-', '*'};
        return expressionSigns[random.nextInt(0, 2)];
    }

    public int getResult(int number1, int number2, char ch) {
        switch (ch) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                return -1;
        }
    }


}
