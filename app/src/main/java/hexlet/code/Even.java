package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void runGame() {
        Cli.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (; i < 3; i++) {
            int randomNumber = random.nextInt(1000);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if ((randomNumber % 2 == 0 && answer.equals("yes")) ||
                    (randomNumber % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println('\'' + answer + "' is wrong answer ;(. Correct answer was '" +
                        (randomNumber % 2 == 0 ? "yes" : "no"));
                System.out.println("Let's try again " + Cli.name);
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Cli.name + '!');
        }
    }
}
