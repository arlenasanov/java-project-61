package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Progression implements GameMethods {
    private int result;

    public static void runGame() {
        Engine.start(new Progression());
    }

    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    public String getData() {
        Random random = new Random();
        final int minRandomNumber = 0;
        final int maxRandomNumber = 100;
        final int minDifference = 1;
        final int maxDifference = 10;

        int a1 = random.nextInt(minRandomNumber, maxRandomNumber);
        final int difference = random.nextInt(minDifference, maxDifference);

        final int countOfNumbersInProgression = 10;
        final int firstNumberIndex = 1;
        int hiddenNumberIndex = random.nextInt(firstNumberIndex, countOfNumbersInProgression);
        String progression = "";
        for (int i = 1; i <= countOfNumbersInProgression; i++) {
            if (i == hiddenNumberIndex) {
                progression += ".. ";
                result = a1;
                a1 += difference;
                continue;
            }
            progression += a1 + " ";
            a1 += difference;
        }
        return progression;
    }

    public String getResult() {
        return "" + result;
    }
}
