package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Progression implements GameMethods {
    int a1;
    int difference;
    int result;

    public static void runGame() {
        Engine.start(new Progression());
    }

    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    public String getData() {
        Random random = new Random();
        int minRandomNumber = 0;
        int maxRandomNumber = 100;
        int minDifference = 1;
        int maxDifference = 10;

        a1 = random.nextInt(minRandomNumber, maxRandomNumber);
        difference = random.nextInt(minDifference, maxDifference);

        int hiddenNumberIndex = random.nextInt(1, 10);
        String progression = "";
        for (int i = 1; i <= 10; i++) {
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
