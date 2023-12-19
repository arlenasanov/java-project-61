package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");
        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        byte gameNumberSelection = scanner.nextByte();
        System.out.println();

        switch (gameNumberSelection) {
            case 1:
                Cli.sayHello();
                break;
            case 2:
                Even.runGame();
        }
    }
}
