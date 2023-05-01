package tennis;

import java.util.ArrayList;
import java.util.List;

class TennisScore {
    private int scoreA = 0;
    private int scoreB = 0;
    private boolean deuce = false;
    private boolean advantageA = false;
    private boolean advantageB = false;
    private boolean gameOver = false;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(scoreA, scoreB, deuce, advantageA, advantageB, gameOver);
        }
    }

    public void playerAWon() {
        if (gameOver) {
            return;
        }

        if (deuce) {
            if (advantageB) {
                deuce = false;
            } else {
                advantageA = true;
            }
        } else {
            scoreA++;
            if (scoreA == 3 && scoreB == 3) {
                deuce = true;
            } else if (scoreA == 4) {
                gameOver = true;
            }
        }

        notifyObservers();
    }

    public void playerBWon() {
        if (gameOver) {
            return;
        }

        if (deuce) {
            if (advantageA) {
                deuce = false;
            } else {
                advantageB = true;
            }
        } else {
            scoreB++;
            if (scoreA == 3 && scoreB == 3) {
                deuce = true;
            } else if (scoreB == 4) {
                gameOver = true;
            }
        }

        notifyObservers();
    }
}