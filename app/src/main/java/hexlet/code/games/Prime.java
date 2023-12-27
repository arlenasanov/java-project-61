package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Prime {

    public static void runGame() {
        final int countOfRounds = 3;
        GameRound[] gameRound = new GameRound[countOfRounds];
        Prime game = new Prime();

        int number;
        String result;
        for (int i = 0; i < countOfRounds; i++) {
            number = game.getData();
            result = game.isPrimeNumber(number) ? "yes" : "no";
            gameRound[i] = new GameRound("" + number, result);
        }

        final String ruleMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.start(gameRound, ruleMessage, countOfRounds);
    }

    public int getData() {
        Random random = new Random();
        final int minRandomNumber = 2;
        final int maxRandomNumber = 100;
        return random.nextInt(minRandomNumber, maxRandomNumber);
    }

    public boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
