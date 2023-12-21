package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        final byte CLI = 1;
        final byte EVEN = 2;
        final byte CALC = 3;
        final byte GCDGAME = 4;
        final byte PROGRESSION = 5;
        final byte PRIME = 6;
        final byte EXIT = 7;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n"
                + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        byte gameNumberSelection = scanner.nextByte();
        System.out.println();

        switch (gameNumberSelection) {
            case CLI:
                Cli.sayHello();
                break;
            case EVEN:
                Even.runGame();
                break;
            case CALC:
                Calc.runGame();
                break;
            case GCDGAME:
                GCD.runGame();
                break;
            case PROGRESSION:
                Progression.runGame();
                break;
            case PRIME:
                Prime.runGame();
                break;
            case EXIT:
                System.out.println("End of game.");
                break;
            default:
                System.out.println("Incorrect choice!");
        }
    }
}
