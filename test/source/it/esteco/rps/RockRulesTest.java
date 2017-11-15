package it.esteco.rps;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockRulesTest {

    @Test
    public void rockBeatsScissors() throws Exception {
        assertThat(new Game(new RockRules()).play(Move.ROCK, Move.SCISSORS), is(equalTo(Result.CHALLENGEE_WINS)));
    }

    @Test
    public void rockLosesOverPaper() throws Exception {
        assertThat(new Game(new RockRules()).play(Move.ROCK, Move.PAPER), is(equalTo(Result.CHALLENGER_WINS)));
    }

    @Test
    public void rockDraw() throws Exception {
        assertThat(new Game(new RockRules()).play(Move.ROCK, Move.ROCK), is(equalTo(Result.DRAW)));
    }

}
