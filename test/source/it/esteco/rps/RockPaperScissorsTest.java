package it.esteco.rps;

import it.esteco.rps.Move;
import it.esteco.rps.Result;
import it.esteco.rps.game.Game;
import it.esteco.rps.game.RockPaperScissors;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockPaperScissorsTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = RockPaperScissors.game();
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
