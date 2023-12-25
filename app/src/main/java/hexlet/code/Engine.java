package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.GameRound;

public class Engine {

    private static String name;

    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + '!');
    }

    public static String getName() {
        return name;
    }

    public static void start(GameRound[] game, String ruleMessage) {
        sayHello();
        System.out.println(ruleMessage);

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        final int iterationsNumber = 3;

        for (; i < iterationsNumber; i++) {
            System.out.println("Question: " + game[i].getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (game[i].getAnswer().equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println('\'' + answer + "' is wrong answer ;(. Correct answer was '"
                        + game[i].getAnswer() + "'.");
                System.out.println("Let's try again, " + getName() + '!');
                break;
            }
        }
        if (i == iterationsNumber) {
            System.out.println("Congratulations, " + getName() + '!');
        }

        scanner.close();
    }
}
