Feature: Console Score Board Feature

  Scenario: Deuce
    Given a new ConsoleScoreBoard
    When the score is 3-3, deuce is true, advantage A is false, advantage B is false, and game is false
    Then the scoreboard displays "Deuce"

  Scenario: Advantage Player A
    Given a new ConsoleScoreBoard
    When the score is 4-3, deuce is true, advantage A is true, advantage B is false, and game is false
    Then the scoreboard displays "Advantage Player A"

  Scenario: Advantage Player B
    Given a new ConsoleScoreBoard
    When the score is 3-4, deuce is true, advantage A is false, advantage B is true, and game is false
    Then the scoreboard displays "Advantage Player B"

  Scenario: Player A wins the game
    Given a new ConsoleScoreBoard
    When the score is 4-2, deuce is false, advantage A is false, advantage B is false, and game is true
    Then the scoreboard displays "Player A wins the game"

  Scenario: Player B wins the game
    Given a new ConsoleScoreBoard
    When the score is 2-4, deuce is false, advantage A is false, advantage B is false, and game is true
    Then the scoreboard displays "Player B wins the game"

  Scenario: Player A and B scores
    Given a new ConsoleScoreBoard
    When the score is 2-1, deuce is false, advantage A is false, advantage B is false, and game is false
    Then the scoreboard displays "Player A: 30 / Player B: 15"
