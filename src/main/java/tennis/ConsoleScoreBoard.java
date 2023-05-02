package tennis;

public class ConsoleScoreBoard implements Observer {
    @Override
    public String update(int scoreA, int scoreB, boolean deuce, boolean advantageA, boolean advantageB, boolean gameOver) {
        String scoreString;
        if (gameOver) {
            scoreString = (scoreA > scoreB) ? "Player A wins the game" : "Player B wins the game";
        } else if (deuce) {
            scoreString = "Deuce";
            if (advantageA) {
                scoreString = "Advantage Player A";
            } else if (advantageB) {
                scoreString = "Advantage Player B";
            }
        } else {
            scoreString = "Player A: " + convertToTennisScore(scoreA) + " / Player B: " + convertToTennisScore(scoreB);
        }
        System.out.println(scoreString);
        return scoreString;
    }

    private String convertToTennisScore(int score) {
        switch (score) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            default:
                return "";
        }
    }
}