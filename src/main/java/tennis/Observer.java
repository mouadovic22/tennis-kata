package tennis;

public interface Observer {
    String update(int scoreA, int scoreB, boolean deuce, boolean advantageA, boolean advantageB, boolean gameOver);
}
