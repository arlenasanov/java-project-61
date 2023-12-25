package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        final byte cli = 1;
        final byte even = 2;
        final byte calc = 3;
        final byte gcdgame = 4;
        final byte progression = 5;
        final byte prime = 6;
        final byte exit = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n"
                + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        byte gameNumberSelection = scanner.nextByte();
        System.out.println();

        switch (gameNumberSelection) {
            case cli:
                Engine.sayHello();
                break;
            case even:
                Even.runGame();
                break;
            case calc:
                Calc.runGame();
                break;
            case gcdgame:
                GCD.runGame();
                break;
            case progression:
                Progression.runGame();
                break;
            case prime:
                Prime.runGame();
                break;
            case exit:
                System.out.println("End of game.");
                break;
            default:
                System.out.println("Incorrect choice!");
        }

        scanner.close();
    }
}
