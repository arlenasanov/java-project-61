package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Even {
    public static void runGame() {
        final int countOfRounds = 3;
        GameRound[] gameRound = new GameRound[countOfRounds];
        Even game = new Even();

        int number;
        String result;
        for (int i = 0; i < countOfRounds; i++) {
            number = game.getData();
            result = game.isEven(number) ? "yes" : "no";
            gameRound[i] = new GameRound("" + number, result);
        }

        final String ruleMessage = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.start(gameRound, ruleMessage, countOfRounds);
    }

    public int getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 1000;
        return random.nextInt(minRandomNumber, maxRandomNumber);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

}
