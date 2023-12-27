package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class GCD {
    public static void runGame() {
        final int countOfRounds = 3;
        GameRound[] gameRound = new GameRound[countOfRounds];
        GCD game = new GCD();

        int number1;
        int number2;
        int result;
        for (int i = 0; i < countOfRounds; i++) {
            number1 = game.getData();
            number2 = game.getData();
            result = game.gcd(number1, number2);
            gameRound[i] = new GameRound(number1 + " " + number2, "" + result);
        }

        final String ruleMessage = "Find the greatest common divisor of given numbers.";
        Engine.start(gameRound, ruleMessage, countOfRounds);
    }

    public int getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 100;
        return random.nextInt(minRandomNumber, maxRandomNumber);
    }

    public int gcd(int number1, int number2) {
        while (number2 != 0) {
            int tmp = number2;
            number2 = number1 % number2;
            number1 = tmp;
        }
        return number1;
    }
}
