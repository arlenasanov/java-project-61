package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

public class Calc implements GameMethods {

    int number1;
    int number2;
    char ch;

    public static void runGame() {
        Engine.start(new Calc());
    }

    public void getRules() {
        System.out.println("What is the result of the expression?");
    }

    public String getData() {
        Random random = new Random();
        int minRandomNumber = 0;
        int maxRandomNumber = 1000;
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
