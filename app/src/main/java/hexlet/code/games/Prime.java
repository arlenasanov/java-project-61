package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Prime implements GameMethods {
    int number;

    public static void runGame() {
        Engine.start(new Prime());
    }

    public void getRules() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public String getData() {
        Random random = new Random();
        int minRandomNumber = 2, maxRandomNumber = 100;
        number = random.nextInt(minRandomNumber, maxRandomNumber);
        return " " + number;
    }

    public String getResult() {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return "no";
        }
        return "yes";
    }
}