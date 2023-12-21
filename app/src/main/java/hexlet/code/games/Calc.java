package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public final class Calc implements GameMethods {

    private int number1;
    private int number2;
    private char ch;

    public static void runGame() {
        Engine.start(new Calc());
    }

    public void getRules() {
        System.out.println("What is the result of the expression?");
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
