package tennis;

import java.util.Scanner;

public class TennisScoreObserverDemo {
    public static void main(String[] args) {
        TennisScore score = new TennisScore();
        ConsoleScoreBoard scoreboard = new ConsoleScoreBoard();
        score.addObserver(scoreboard);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A') {
                score.playerAWon();
            } else if (c == 'B') {
                score.playerBWon();
            }
        }
    }
}