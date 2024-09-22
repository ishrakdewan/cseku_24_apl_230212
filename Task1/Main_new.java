package GameNew;

import GameOld.GameEntry_old;
import GameOld.Scoreboard_old;

import java.util.Scanner;

public class Main_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard_old scoreboard = new Scoreboard_old(10); // Initialize scoreboard with capacity 10
        GameEntry_old gameEntry;
        String name;
        int score;

        System.out.println("Game Start");

        while (true) {
            System.out.println("Enter name (without space) and score " +
                    "(enter 'over' to stop the game):");
            name = sc.next();

            if (name.equals("over")) {
                break;
            }

            score = sc.nextInt();
            gameEntry = new GameEntry_old(name, score);
            scoreboard.add(gameEntry);

            System.out.println("Current scoreboard:");
            scoreboard.show();
            System.out.println();
        }

        System.out.println("Game over");
        sc.close();
    }
}
