package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaperBeatsRock {

    @Test
    public void paperBeatsRock() throws Exception {
        assertThat(new Game(Paper.rules()).play(Move.PAPER, Move.ROCK), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void rockLosesOverPaper() throws Exception {
        assertThat(new Game(Paper.rules()).play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }

}
