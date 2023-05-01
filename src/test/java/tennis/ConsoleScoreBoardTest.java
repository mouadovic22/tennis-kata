package tennis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsoleScoreBoardTest {

    private ConsoleScoreBoard scoreboard;

    @BeforeEach
    void setUp() {
        scoreboard = new ConsoleScoreBoard();
    }

    @Test
    @DisplayName("Test Deuce")
    void testDeuce() {
        String scoreString = scoreboard.update(3, 3, true, false, false, false);
        Assertions.assertEquals("Deuce", scoreString);
    }

    @Test
    @DisplayName("Test Advantage Player A")
    void testAdvantageA() {
        String scoreString = scoreboard.update(4, 3, true, true, false, false);
        Assertions.assertEquals("Advantage Player A", scoreString);
    }

    @Test
    @DisplayName("Test Advantage Player B")
    void testAdvantageB() {
        String scoreString = scoreboard.update(3, 4, true, false, true, false);
        Assertions.assertEquals("Advantage Player B", scoreString);
    }

    @Test
    @DisplayName("Test Player A wins the game")
    void testPlayerAWins() {
        String scoreString = scoreboard.update(4, 2, false, false, false, true);
        Assertions.assertEquals("Player A wins the game", scoreString);
    }

    @Test
    @DisplayName("Test Player B wins the game")
    void testPlayerBWins() {
        String scoreString = scoreboard.update(2, 4, false, false, false, true);
        Assertions.assertEquals("Player B wins the game", scoreString);
    }

    @Test
    @DisplayName("Test Player A and B scores")
    void testPlayerScores() {
        String scoreString = scoreboard.update(2, 1, false, false, false, false);
        Assertions.assertEquals("Player A: 30 / Player B: 15", scoreString);
    }
}
