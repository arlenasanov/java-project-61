package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

final public class Even implements GameMethods {

    private int number;

    public static void runGame() {
        Engine.start(new Even());
    }

    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
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
