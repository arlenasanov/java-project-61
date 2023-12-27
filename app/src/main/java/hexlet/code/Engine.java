package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.GameRound;

public class Engine {
    public static void start(GameRound[] game, String ruleMessage, int countOfRounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + '!');
        System.out.println(ruleMessage);

        int i = 0;

        for (; i < countOfRounds; i++) {
            System.out.println("Question: " + game[i].getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (game[i].getAnswer().equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println('\'' + answer + "' is wrong answer ;(. Correct answer was '"
                        + game[i].getAnswer() + "'.");
                System.out.println("Let's try again, " + name + '!');
                break;
            }
        }
        if (i == countOfRounds) {
            System.out.println("Congratulations, " + name + '!');
        }

        scanner.close();
    }
}
