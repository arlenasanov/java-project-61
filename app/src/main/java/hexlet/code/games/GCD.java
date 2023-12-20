package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;
public class GCD implements GameMethods{
    int number1;
    int number2;

    public static void runGame() {
        Engine.start(new GCD());
    }

    public void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public String getData() {
        Random random = new Random();
        int minRandomNumber = 0, maxRandomNumber = 100;
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