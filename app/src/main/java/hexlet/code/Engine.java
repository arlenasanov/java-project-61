package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.GameMethods;

public class Engine {
    public static void start(GameMethods game) {
        Cli.sayHello();
        game.getRules();

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Question: " + game.getData());
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (game.getResult().equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println('\'' + answer + "' is wrong answer ;(. Correct answer was '"
                        + game.getResult() + "'.");
                System.out.println("Let's try again, " + Cli.name + '!');
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Cli.name + '!');
        }
    }
}
