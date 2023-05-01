package tennis.stepdefs;


import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import tennis.ConsoleScoreBoard;

public class ConsoleScoreBoardSteps {
    private ConsoleScoreBoard consoleScoreBoard;
    private String displayedScore;

    @Given("a new ConsoleScoreBoard")
    public void a_new_console_scoreboard() {
        consoleScoreBoard = new ConsoleScoreBoard();
    }


    @When("the score is {int}-{int}, deuce is {booleanValue}, advantage A is {booleanValue}, advantage B is {booleanValue}, and game is {booleanValue}")
    public void the_score_is_deuce_is_true_advantage_a_is_false_advantage_b_is_false_and_game_is_false(Integer playerAScore, Integer playerBScore, Boolean isDeuce, Boolean hasAdvantageA, Boolean hasAdvantageB, Boolean isGame) {
        // Write code here that turns the phrase above into concrete actions
        displayedScore = consoleScoreBoard.update(playerAScore, playerBScore, isDeuce, hasAdvantageA, hasAdvantageB, isGame);

    }


    @Then("the scoreboard displays {string}")
    public void the_scoreboard_displays(String expectedScoreString) {
        Assertions.assertEquals(expectedScoreString, displayedScore);
    }
    @ParameterType(value = "true|True|TRUE|false|False|FALSE")
    public Boolean booleanValue(String value) {
        return Boolean.valueOf(value);
    }

}
