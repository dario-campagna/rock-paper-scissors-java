package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaperRulesTest {

    @Test
    public void paperBeatsRock() throws Exception {
        assertThat(new Game(new PaperRules()).play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void paperLosesOverScissors() throws Exception {
        assertThat(new Game(new PaperRules()).play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void paperDraw() throws Exception {
        assertThat(new Game(new PaperRules()).play(Move.PAPER, Move.PAPER), is(equalTo(Result.DRAW)));
    }

}
