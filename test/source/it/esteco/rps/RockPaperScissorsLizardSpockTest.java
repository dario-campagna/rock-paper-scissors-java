package it.esteco.rps;

import it.esteco.rps.game.Game;
import it.esteco.rps.game.RockPaperScissorsLizardSpock;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsLizardSpockTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = RockPaperScissorsLizardSpock.game();
    }

    @Test
    public void lizardBeatsPaper() throws Exception {
        assertThat(game.play(Move.LIZARD, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void paperLosesOverLizard() throws Exception {
        assertThat(game.play(Move.PAPER, Move.LIZARD), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void lizardLosesOverScissors() throws Exception {
        assertThat(game.play(Move.LIZARD, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void scissorsBeatsLizard() throws Exception {
        assertThat(game.play(Move.SCISSORS, Move.LIZARD), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void lizardLosesOverRock() throws Exception {
        assertThat(game.play(Move.LIZARD, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void rockBeatsLizard() throws Exception {
        assertThat(game.play(Move.ROCK, Move.LIZARD), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void lizardDraw() throws Exception {
        assertThat(game.play(Move.LIZARD, Move.LIZARD), is(equalTo(Result.DRAW)));
    }

    @Test
    public void spockLosesOverLizard() throws Exception {
        assertThat(game.play(Move.SPOCK, Move.LIZARD), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void lizardBeatsSpock() throws Exception {
        assertThat(game.play(Move.LIZARD, Move.SPOCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void spockBeatsRock() throws Exception {
        assertThat(game.play(Move.SPOCK, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void rockLosesOverSpock() throws Exception {
        assertThat(game.play(Move.ROCK, Move.SPOCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void spockBeatsScissors() throws Exception {
        assertThat(game.play(Move.SPOCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLosesOverSpock() throws Exception {
        assertThat(game.play(Move.SCISSORS, Move.SPOCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void spockLosesOverPaper() throws Exception {
        assertThat(game.play(Move.SPOCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void paperBeatsSpock() throws Exception {
        assertThat(game.play(Move.PAPER, Move.SPOCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void spockDraw() throws Exception {
        assertThat(game.play(Move.SPOCK, Move.SPOCK), is(equalTo(Result.DRAW)));
    }

    @Test
    public void rockLosesOverPaper() throws Exception {
        assertThat(game.play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void PaperBeatsRock() throws Exception {
        assertThat(game.play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(game.play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void scissorsLosesOverRock() throws Exception {
        assertThat(game.play(Move.SCISSORS, Move.ROCK), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(game.play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void paperLosesOverScissors() throws Exception {
        assertThat(game.play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void paperDraw() throws Exception {
        assertThat(game.play(Move.PAPER, Move.PAPER), is(equalTo(Result.DRAW)));
    }

    @Test
    public void rockDraw() throws Exception {
        assertThat(game.play(Move.ROCK, Move.ROCK), is(equalTo(Result.DRAW)));
    }

    @Test
    public void scissorsDraw() throws Exception {
        assertThat(game.play(Move.SCISSORS, Move.SCISSORS), is(equalTo(Result.DRAW)));
    }
}
