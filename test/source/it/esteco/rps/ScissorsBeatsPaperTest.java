package it.esteco.rps;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsBeatsPaperTest {

    @Test
    public void scissorsBeatsPaper() throws Exception {
        assertThat(new Game(Scissors.rules()).play(Move.SCISSORS, Move.PAPER), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void paperLosesOverScissors() throws Exception {
        assertThat(new Game(Scissors.rules()).play(Move.PAPER, Move.SCISSORS), is(equalTo(Result.CHALLENGER_WINS)));
    }
}
